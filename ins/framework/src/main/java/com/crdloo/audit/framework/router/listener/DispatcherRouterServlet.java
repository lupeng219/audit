package com.crdloo.audit.framework.router.listener;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.crdloo.audit.framework.constant.Const;
import com.crdloo.audit.framework.router.listener.Message.State;
import com.crdloo.audit.framework.router.utils.SystemUtil;

@SuppressWarnings("serial")
public class DispatcherRouterServlet extends DispatcherServlet {

	private static final Logger logger = Logger.getLogger(DispatcherRouterServlet.class);
	
	private String broadcastIp;
    private int port;

    private MulticastSender multicastSender;
    private static final int DELAY_SECOND = 3;
	
    /**
     * 服务器状态
     */
    private volatile boolean alive = false;
    
    /**
     * 组播心跳
     */
    private ScheduledExecutorService heartbeat;
    private static final int DEFAULT_CHECK_INTERVAL = 2 * 1000; // 2 second
    
    public DispatcherRouterServlet() {
        // this.broadcastIp = SystemUtil.getBroadcastIp();
        this.broadcastIp = Const.MULTICAST_IP;
        this.port = SystemUtil.getConnectorPort();
        this.multicastSender = new MulticastSender(broadcastIp, port);
        logger.info("Load System Info [broadcastIp=" + broadcastIp + ", port=" + port + "]");
    }
    
    @Override
    protected void onRefresh(ApplicationContext context) {
        super.onRefresh(context);
        routerStarted();
    }

    @Override
    public void destroy() {
        // before Closing WebApplicationContext
        routerStop();
        super.destroy();
    }
    
    private void routerStarted() {
        delayDoStart(DELAY_SECOND);
        // 启动心跳
        startHeartbeat();
    }
    
    private void delayDoStart(final int second) {
        Thread thread = new Thread("DispatcherRouterServlet-Send-Broadcast") {
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(second);
                } catch (InterruptedException e) {
                    // ignore
                }
                doStart();
            };
        };
        thread.start();
    }
    
    private void startHeartbeat() {
        if (heartbeat == null) {
            heartbeat = Executors.newSingleThreadScheduledExecutor();
            heartbeat.scheduleAtFixedRate(newHeartbeatRunner(), DEFAULT_CHECK_INTERVAL + DELAY_SECOND,
                    DEFAULT_CHECK_INTERVAL, TimeUnit.MILLISECONDS);
        }
    }
    
    private Runnable newHeartbeatRunner() {
        return new Runnable() {
            public void run() {
                heartbeat();
            }
        };
    }
    
    private synchronized void heartbeat() {
        if (alive) {
            doAlive();
        }
    }
    
    private void routerStop() {
        // 停止心跳
        stopHeartbeat();
        doStop();
        // Stationary point time for client
        pause();
        this.multicastSender.shutdown();
    }
    
    private void stopHeartbeat() {
        if (heartbeat != null) {
            heartbeat.shutdownNow();
        }
    }
    
    private void doStart() {
        Message message = new Message(port, State.STARTED);
        multicastSender.send(message);
        this.alive = true;
    }
    
    private void doAlive() {
        Message message = new Message(port, State.ALIVE);
        multicastSender.send(message);
    }
    
    private void doStop() {
        this.alive = false;
        Message message = new Message(port, State.STOPPED);
        multicastSender.send(message);
    }

    private void pause() {
        try {
            TimeUnit.SECONDS.sleep(DELAY_SECOND);
        } catch (InterruptedException e) {
        }
    }
}
