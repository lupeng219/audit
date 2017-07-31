package com.crdloo.audit.framework.router.handler;

import java.net.ConnectException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.HttpHostConnectException;

import com.crdloo.audit.framework.router.cluster.Address;
import com.crdloo.audit.framework.router.cluster.Cluster;

public abstract class AbstractInterruptPlan {

	private Set<Class<?>> catchExceptionClasses = new HashSet<Class<?>>();
	
	/**
     * 连续抛错次数罚值，判断服务器是否停止服务
     */
    protected int continueFreq = DEFAULT_CONTINUE_FREQ;

    /**
     * object lock
     */
    private final byte[] monitor = new byte[0];

    private static final int DEFAULT_CONTINUE_FREQ = 3;

    /**
     * 每个服务器请求自增长id
     */
    private final ConcurrentMap<Address, AtomicLong> autoIncrements = new ConcurrentHashMap<Address, AtomicLong>();

    /**
     * 每个地址的连续抛错上下文状态.
     * <p>
     * 每个地址只会保存距离当前请求最近的5次请求成功失败状态
     */
    private final ConcurrentMap<Address, ArrayBlockingQueue<Long>> contextStats = new ConcurrentHashMap<Address, ArrayBlockingQueue<Long>>();

    /**
     * 服务器集群配置
     */
    protected Cluster cluster;
	
    public AbstractInterruptPlan() {
        registerException(new Class<?>[] { ConnectTimeoutException.class, ConnectException.class,
                HttpHostConnectException.class });
    }
	
    /**
     * 注册需要捕获的Exception Class
     * 
     * @param clazzs
     */
    public void registerException(Class<?>... clazzs) {
        for (Class<?> clazz : clazzs) {
            catchExceptionClasses.add(clazz);
        }
    }
    
    /**
     * 加载集群配置
     * 
     * @param cluster
     */
    public void loadCluster(Cluster cluster) {
        synchronized (monitor) {
            this.cluster = cluster;
            this.contextStats.clear();
            this.autoIncrements.clear();
            init(cluster.getAliveAddresses());
            init(cluster.getZombieAddresses());
        }
    }

    public void init(final List<Address> addresses) {
        for (Address address : addresses) {
            contextStats.put(address, new ArrayBlockingQueue<Long>(this.continueFreq));
            autoIncrements.put(address, new AtomicLong(0));
        }
    }
    
    /**
     * 设置连续抛错次数阀值, 默认5次
     * 
     * @param continueFreq
     */
    public void setContinueFreq(int continueFreq) {
        this.continueFreq = continueFreq;
    }
    
    /**
     * 服务器请求次数加1
     * 
     * @param address
     * @return
     */
    public long uniqueId(Address address) {
        AtomicLong increment = autoIncrements.get(address);
        if (increment == null) {
            autoIncrements.put(address, increment = new AtomicLong(0));
        }
        return increment.incrementAndGet();
    }

    /**
     * 抛出异常处理逻辑
     * <p>
     * {@code true} : 需要断开连接 <br>
     * {@code false} : 继续使用 <br>
     * 
     * 目前已在内部处理断开连接
     * 
     * @param address 服务器地址
     * @param uuid 每次请求的自增长id
     * @param e 请求抛出的异常
     * @return
     */
    public boolean interrupt(Address address, long uuid, Exception e) {
        boolean is = catchExceptionClasses.contains(e.getClass());
        // 普通异常
        if (is == false) {
            return false;
        }

        synchronized (this.monitor) {
            ArrayBlockingQueue<Long> context = contextStats.get(address);
            if (context == null) {
                contextStats.put(address, context = new ArrayBlockingQueue<Long>(this.continueFreq));
            }
            // 记录状态
            if (!context.offer(uuid)) {
                // by any possibility queue full case
                context.poll();
                context.offer(uuid);
            }
            // 是否满足阀值条件
            if (context.size() < continueFreq) {
                return false;
            }
            // 判断是否连续的
            if (continuous(context)) {
                // 移除最老一个
                context.poll();
                // 残废掉此服务器
                invalidate(address);
                return true;
            } else {
                // 移除距离当前的非连续状态
                removeUnNowContinuous(context);
                return false;
            }
        }
    }

    /**
     * 判断是否连续的
     * 
     * @param queue
     * @return
     */
    private static boolean continuous(final ArrayBlockingQueue<Long> queue) {
        Long[] uuids = queue.toArray(new Long[] {});
        int length = uuids.length;
        for (int i = length - 1; i > 0; i--) {
            if ((uuids[i] - uuids[i - 1]) != 1) {
                return false;
            }
        }
        return true;
    }

    /**
     * 移除距离当前非连续状态
     * 
     * @param queue
     * @return
     */
    private static void removeUnNowContinuous(final ArrayBlockingQueue<Long> queue) {
        Long[] uuids = queue.toArray(new Long[] {});
        int length = uuids.length;
        long currentId = uuids[length - 1];
        boolean afterDelAll = false;
        for (int i = length - 2, j = 1; i >= 0; i--, j++) {
            if (afterDelAll) {
                queue.remove(uuids[i]);
            } else {
                if ((currentId - uuids[i]) != j) {
                    queue.remove(uuids[i]);
                    afterDelAll = true;
                }
            }
        }
    }

    private void invalidate(Address address) {
        this.cluster.invalidate(address);
    }
}
