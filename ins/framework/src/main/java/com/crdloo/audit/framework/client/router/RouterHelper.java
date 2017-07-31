package com.crdloo.audit.framework.client.router;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.log4j.Logger;

import com.crdloo.audit.framework.router.Router;
import com.crdloo.audit.framework.router.cluster.ConfigCluster;
import com.crdloo.audit.framework.router.cluster.HttpHealthChecker;
import com.crdloo.audit.framework.router.cluster.TcpHealthChecker;
import com.crdloo.audit.framework.router.cluster.UdpHealthChecker;
import com.crdloo.audit.framework.router.conf.ClusterConfig;

/**
 * 路由器构造工具类
 */
public class RouterHelper {

	private static final Logger logger = Logger.getLogger(RouterHelper.class);
	
	private static final Map<String, Router> CONTAINER = new HashMap<String, Router>();

    private static final ReentrantLock lock = new ReentrantLock();
	
    public static Router getInstance(String appName) {
        Router router = CONTAINER.get(appName);
        if (router == null) {
            lock.lock();
            try {
                if (!CONTAINER.containsKey(appName)) {
                    if (ClusterConfig.isHttpAutoloading(appName)) {
                        router = new Router(appName, true);
                    } else {
                        router = new Router();
                    }
                    router.setExceptionHandler(new CommonExceptionHandler());
                    router.setPreprocessor(new CommonPreprocessor());
                    router.setPostprocessor(new CommonPostprocessor());
                    router.setCluster(new ConfigCluster(appName));

                    // 从全局配置获取心跳设置
                    StringBuilder log = new StringBuilder("ins-router config: ");
                    String[] values = ClusterConfig.getConfigs("health-check-mode", "health-check-interval");
                    router.setInterval(Integer.parseInt(values[1]));// 客户端心跳间隔
                    log.append("health-check-mode=").append(values[0]).append(" health-check-interval=")
                            .append(values[1]);
                    if (values[0] == null || values[0].equals("UDP")) {
                        String[] threshold = ClusterConfig.getConfigs("udp-threshold");
                        long t = Long.parseLong(threshold[0]) * 1000;// 秒 => 毫秒
                        router.setHealthChecker(new UdpHealthChecker(t));
                        log.append(" udp-threshold=").append(threshold[0]);
                    } else if (values[0].equals("TCP")) {
                        String[] threshold = ClusterConfig.getConfigs("tcp-threshold");
                        router.setHealthChecker(new TcpHealthChecker(Integer.parseInt(threshold[0])));
                        log.append(" tcp-threshold=").append(threshold[0]);
                    } else if (values[0].equals("HTTP")) {
                        String[] threshold = ClusterConfig.getConfigs("http-url", "http-threshold");
                        router.setHealthChecker(new HttpHealthChecker(threshold[0], Integer.parseInt(threshold[1])));
                        log.append(" http-url=").append(threshold[0]).append(" http-threshold=").append(threshold[1]);
                    }

                    router.init();
                    CONTAINER.put(appName, router);

                    log.append(" @").append(appName);
                    logger.warn(log.toString());
                } else {
                    router = CONTAINER.get(appName);
                }
            } finally {
                lock.unlock();
            }
        }
        return router;
    }
    
    static {
        registerShutdownHook();
    }

    private static void doDestroy() {
        for (Router router : CONTAINER.values()) {
            router.destroy();
        }
    }

    private static void registerShutdownHook() {
        Thread shutdownHook = new Thread() {
            public void run() {
                doDestroy();
            }
        };
        Runtime.getRuntime().addShutdownHook(shutdownHook);
    }
    
}
