package com.crdloo.audit.framework.router;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.commons.lang.math.RandomUtils;
import org.apache.log4j.Logger;

import com.crdloo.audit.framework.client.router.DefaultPreprocessor;
import com.crdloo.audit.framework.common.httpclient.HttpSendClient;
import com.crdloo.audit.framework.common.httpclient.HttpSendClientFactory;
import com.crdloo.audit.framework.router.cluster.AbstractHealthChecker;
import com.crdloo.audit.framework.router.cluster.Address;
import com.crdloo.audit.framework.router.cluster.Cluster;
import com.crdloo.audit.framework.router.cluster.TcpHealthChecker;
import com.crdloo.audit.framework.router.handler.AbstractExceptionHandler;
import com.crdloo.audit.framework.router.handler.AbstractInterruptPlan;
import com.crdloo.audit.framework.router.handler.AbstractPostprocessor;
import com.crdloo.audit.framework.router.handler.IPreprocessor;
import com.crdloo.audit.framework.router.listener.HeartbeatMulticastListener;
import com.crdloo.audit.framework.router.listener.MulticastListener;
import com.crdloo.audit.framework.router.loadbalance.AbstractLoadBalance;
import com.crdloo.audit.framework.router.loadbalance.UserAndRoundRobinLoadBalance;
import com.crdloo.audit.framework.router.reload.AutoLoading;
import com.crdloo.audit.framework.router.utils.JsonUtil;

public class Router implements ITrigger {

	private static final Logger logger = Logger.getLogger(Router.class);
	
    private AbstractLoadBalance loadBalance = new UserAndRoundRobinLoadBalance();
    
    private AbstractInterruptPlan interruptPlan = new AbstractInterruptPlan() {};
	
	private AbstractExceptionHandler<?> exceptionHandler = new AbstractExceptionHandler<String>() {};
	
    private IPreprocessor preprocessor = new DefaultPreprocessor();
    
    private AbstractPostprocessor<?> postprocessor = new AbstractPostprocessor<String>() {};
	
    private Cluster cluster;
    
    private static final int DEFAULT_CHECK_INTERVAL = 3 * 1000; // 3 second
    
    /**
     * 监听对应服务器启动、停止 UDP消息
     */
    private List<MulticastListener> listeners = new ArrayList<MulticastListener>();
    
    /**
     * 心跳检查协议类型, 默认tcp检查
     */
    @SuppressWarnings("rawtypes")
    private AbstractHealthChecker healthChecker = new TcpHealthChecker();
    
    /**
     * http 发送实例
     */
    private HttpSendClient timeoutHttpClient;// 默认3秒超时
    
    /**
     * 心跳检测, 客户端内部心跳时间间隔. TCP默认3秒,UDP默认1秒
     */
    private ScheduledExecutorService heartbeat;
    
    /**
     * 向后端进行健康检查的间隔
     */
    private int interval = DEFAULT_CHECK_INTERVAL;
    
	/**
     * 自动加载标识，默认关闭
     */
    private boolean auto = false;
    /**
     * 自动加载模块
     */
    private AutoLoading autoLoading = null;
    
    /**
     * 启动锁
     */
    private final AtomicBoolean started = new AtomicBoolean(false);
	
	public Router() {
		
    }
	
	public Router(String projectName, boolean auto) {
        this.autoLoading = new AutoLoading(projectName);
        this.auto = auto;
        this.autoLoading.setRouter(this);
    }
	
	public void setExceptionHandler(AbstractExceptionHandler<?> exceptionHandler) {
        this.exceptionHandler = exceptionHandler;
    }
	
	public void setPreprocessor(IPreprocessor preprocessor) {
        this.preprocessor = preprocessor;
    }
	
	public void setPostprocessor(AbstractPostprocessor<?> postprocessor) {
        this.postprocessor = postprocessor;
    }
	
	public void setCluster(Cluster cluster) {
        this.cluster = cluster;
    }
	
	public void setInterval(int interval) {
        this.interval = interval;
    }
	
	public void setHealthChecker(AbstractHealthChecker<?> healthChecker) {
        this.healthChecker = healthChecker;
    }
	
	public synchronized void init() {
        if (this.cluster == null) {
            throw new RuntimeException("Cluster config is absent, please set it first!");
        }
        if (this.loadBalance == null) {
            throw new RuntimeException("LoadBalance config is absent, please set it first!");
        }
        if (this.healthChecker == null) {
            throw new RuntimeException("AbstractHealthChecker config is absent, please set it first!");
        }
        
        this.loadBalance.setCluster(this.cluster);

        if (this.interruptPlan == null) {
            throw new RuntimeException("InterruptPlan config is absent, please set it first!");
        }
        this.interruptPlan.loadCluster(this.cluster);

        // 启动监听，接收平台端组播心跳数据
        Map<Integer, Set<String>> portIpMap = new HashMap<Integer, Set<String>>();
        portGroup(portIpMap, cluster.getAliveAddresses());
        portGroup(portIpMap, cluster.getZombieAddresses());
        startListeners(portIpMap);

        // 心跳服务启动
        if (healthChecker != null) {
            if (heartbeat == null) {
                heartbeat = Executors.newSingleThreadScheduledExecutor();
                heartbeat.scheduleAtFixedRate(newAliveCheckRunner(this), this.interval * 2, this.interval,
                        TimeUnit.MILLISECONDS);
            }
        }

        HttpSendClientFactory factory = new HttpSendClientFactory();
        // (连接池)最大连接数设置
        factory.setMaxTotalConnections(2000);
        // 每条通道的并发连接数设置（连接池）
        factory.setDefaultMaxPerRoute(400);
        this.timeoutHttpClient = factory.newHttpSendClient();

        // 启动
        started.compareAndSet(false, true);
    }
	
	private void portGroup(final Map<Integer, Set<String>> map, final List<Address> addresses) {
        for (Address address : addresses) {
            int port = address.getPort();
            Set<String> ips = map.get(port);
            if (ips == null) {
                ips = new HashSet<String>();
                map.put(port, ips);
            }
            ips.add(address.getIp());
        }
    }
	
	private void startListeners(Map<Integer, Set<String>> portIpMap) {
        for (Map.Entry<Integer, Set<String>> entry : portIpMap.entrySet()) {
            // 同一个端口只需要开启一个udp监听
            MulticastListener listener = new HeartbeatMulticastListener(entry.getKey(), entry.getValue(), this,
                    healthChecker);
            listener.setName("router-udp:" + entry.getKey() + "-listener");
            listener.start();
            listeners.add(listener);
        }
    }
	
	private static Runnable newAliveCheckRunner(final Router router) {
        return new Runnable() {
            public void run() {
                if (router.isAutoLoading()) {
                    if (router.autoLoading.switching()) {
                        return;
                    }
                }
                router.checkAllServer();
                router.handler();
            }
        };
    }
	
	@SuppressWarnings("unchecked")
	private synchronized void checkAllServer() {
        if (started.get()) {
            for (Address address : cluster.getAliveAddresses()) {
                if (!healthChecker.checkAliveOrDead(address, true)) {
                    exit(address);
                    logger.error(address + " checked alive => dead");
                }
            }
            for (Address address : cluster.getZombieAddresses()) {
                if (healthChecker.checkAliveOrDead(address, false)) {
                    join(address);
                    logger.error(address + " checked dead => alive");
                }
            }
        }
    }
	
	private void handler() {
        
    }
	
	private boolean isAutoLoading() {
        return auto && autoLoading != null;
    }
	
	public void join(Address address) {
		cluster.validate(address);
        handler();
	}

	public void exit(Address address) {
		cluster.invalidate(address);
        handler();
	}
	
	public synchronized void destroy() {
        // 停止
        started.compareAndSet(true, false);
        // httpclient shutdown
        if (this.timeoutHttpClient != null) {
            this.timeoutHttpClient.shutdown();
        }
        // listener stop
        for (MulticastListener listener : listeners) {
            listener.disconnect();
            listener = null;
        }
        listeners.clear();
        // heartbeat stop
        if (heartbeat != null) {
            try {
                heartbeat.shutdownNow();
            } catch (Exception e) {
            }
            heartbeat = null;
        }
    }
	
	public synchronized void refresh(Cluster currentCluster) {
        this.loadBalance.setCluster(currentCluster);

        // listener stop
        for (MulticastListener listener : listeners) {
            listener.disconnect();
            listener = null;
        }
        listeners.clear();

        // 启动监听
        Map<Integer, Set<String>> portIpMap = new HashMap<Integer, Set<String>>();
        portGroup(portIpMap, currentCluster.getAliveAddresses());
        portGroup(portIpMap, currentCluster.getZombieAddresses());
        startListeners(portIpMap);

        this.cluster = currentCluster;

        this.interruptPlan.loadCluster(currentCluster);
    }

	public <T> T requestWithTimeout(String location, Object param, Class<?>... classes) {
        return request(timeoutHttpClient, location, param, classes);
    }
	
	@SuppressWarnings("unchecked")
    public <T> T request(HttpSendClient httpSendClient, String location, Object param, Class<?>... classes) {
        if (!started.get()) {
            throw new RuntimeException("router hadn't invoke init method");
        }

        // 可能的重新加载
        if (isAutoLoading()) {
            autoLoading.lockWaiting();
        }

        // 预处理
        Map<String, Object> map = preprocessor.preprocess(param);

        // 选择路由地址
        Address address = loadBalance.select(location);

        String url = url(location, address);
        long uuid = interruptPlan.uniqueId(address);
        String value = null;
        try {
            // http 请求
            value = httpSendClient.post(url, map);
        } catch (Exception e) {
            logger.error("url=" + url + ", param=" + param + ", classes=" + Arrays.toString(classes), e);
            // 服务器连接断开计划
            interruptPlan.interrupt(address, uuid, e);
            // 异常处理
            return (T) exceptionHandler.handle(e);
        }
        // 结果处理
        return (classes != null && classes.length > 0) ? (T) postprocessor.postprocess(value, classes) : null;
    }

    /**
     * Gzip压缩传输大文件，解决HTTP分段传输合并问题
     * 
     * @param <T>
     * @param httpSendClient
     * @param location
     * @param param
     * @param classes
     * @return
     */
    @SuppressWarnings("unchecked")
    public <T> T gizRequest(String location, Object param, Class<?>... classes) {
        if (!started.get()) {
            throw new RuntimeException("router hadn't invoke init method");
        }

        // 可能的重新加载
        if (isAutoLoading()) {
            autoLoading.lockWaiting();
        }

        // 预处理
        Map<String, Object> map = preprocessor.preprocess(param);

        // 选择路由地址
        Address address = loadBalance.select(location);
        String url = url(location, address);
        long uuid = interruptPlan.uniqueId(address);
        String value = null;
        try {
            // http 请求
            value = timeoutHttpClient.postGzip(url, JsonUtil.toJson(map));
        } catch (Exception e) {
            logger.error("url=" + url + ", param=" + param + ", classes=" + Arrays.toString(classes), e);
            // 服务器连接断开计划
            interruptPlan.interrupt(address, uuid, e);
            // 异常处理
            return (T) exceptionHandler.handle(e);
        }
        // 结果处理
        return (classes != null && classes.length > 0) ? (T) postprocessor.postprocess(value, classes) : null;
    }

    public String url(String location, Address address) {
        return address.uri() + location + "?random=" + RandomUtils.nextInt();
    }
    
}
