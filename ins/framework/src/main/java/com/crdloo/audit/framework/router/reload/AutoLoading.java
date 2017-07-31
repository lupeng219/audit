package com.crdloo.audit.framework.router.reload;

import java.io.File;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.log4j.Logger;

import com.crdloo.audit.framework.router.Router;
import com.crdloo.audit.framework.router.cluster.Cluster;
import com.crdloo.audit.framework.router.cluster.ConfigCluster;
import com.crdloo.audit.framework.router.conf.ClusterConfig;

public class AutoLoading {

	private static final Logger logger = Logger.getLogger(AutoLoading.class);
	
	private ScheduledExecutorService heartbeat;
    private static final int DEFAULT_CHECK_INTERVAL = 5; // 5 minute

    private Router router;

    private String projectName;

    /**
     * 最后修改时间
     */
    private long lastModifiedTime;
    
    /**
     * 最后配置信息
     */
    private Set<String> lastServers;
    
    /**
     * 切换中状态
     */
    private final AtomicBoolean switching = new AtomicBoolean(false);
	
	public AutoLoading(String projectName) {
        this.projectName = projectName;

        File file = ClusterConfig.checkAndGet();
        // 初始化
        this.lastModifiedTime = file.lastModified();
        this.lastServers = ClusterConfig.getClusters(projectName, "http");

        this.heartbeat = Executors.newSingleThreadScheduledExecutor();
        this.heartbeat.scheduleAtFixedRate(newFileCheckRunner(), DEFAULT_CHECK_INTERVAL, DEFAULT_CHECK_INTERVAL,
                TimeUnit.MINUTES);
    }
	
	public void setRouter(Router router) {
        this.router = router;
    }
	
	private Runnable newFileCheckRunner() {
        return new Runnable() {
            public void run() {
                changeCheck();
            }
        };
    }

    private synchronized void changeCheck() {
        File file = ClusterConfig.checkAndGet();
        long currentModifiedTime = file.lastModified();
        if (this.lastModifiedTime == currentModifiedTime) {
            return;
        }
        // 更新最后修改时间
        this.lastModifiedTime = currentModifiedTime;

        Set<String> currentServers = ClusterConfig.getClusters(this.projectName, "http");
        if (!ipAndPortCheck(lastServers, currentServers)) {
            return;
        }
        // 保存最新数据
        this.lastServers = currentServers;

        Cluster currentCluster = new ConfigCluster(this.projectName);

        // 切换开始
        this.switching.compareAndSet(false, true);

        long start = System.currentTimeMillis();
        try {
            this.router.refresh(currentCluster);
            logger.warn("ins-router reload ins-cluster.conf for " + projectName + "  success, "
                    + (System.currentTimeMillis() - start) + " ms");
        } catch (Exception e) {
            logger.error("ins-router reload ins-cluster.conf for " + projectName + " fail", e);
        }

        // 切换结束
        this.switching.compareAndSet(true, false);
    }
    
    /**
     * 检查服务地址是否有变化
     * <p>
     * true: 有变化 | fasle: 无变化
     * 
     * @param last
     * @param current
     * @return
     */
    private boolean ipAndPortCheck(Set<String> last, Set<String> current) {
        if (last.size() != current.size()) {
            return true;
        }
        int hit = 0;
        for (String value : current) {
            if (last.contains(value)) {
                hit++;
            }
        }
        return (hit != last.size()) ? true : false;
    }
	
    /**
     * 阻塞请求
     * <p>
     * 最大切换时长：10ms
     */
    public void lockWaiting() {
        if (!switching()) {
            return;
        }

        int retry = 1;
        try {
            while (switching() && retry-- != 0) {
                TimeUnit.MILLISECONDS.sleep(20);
            }
        } catch (InterruptedException ie) {
            // ignore
        }
    }

    /**
     * 是否正在切换中
     * 
     * @return
     */
    public boolean switching() {
        return switching.get();
    }
    
}
