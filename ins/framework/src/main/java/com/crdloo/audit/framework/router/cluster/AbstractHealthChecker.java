package com.crdloo.audit.framework.router.cluster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

public abstract class AbstractHealthChecker<T> {

	public static final int SWITCH_THRESHOLD = 2;// 2次

    /**
     * 如果连续失败次数达到fall次, 服务器就被认为是死的
     */
    protected int fallCount = 2;
    /**
     * 如果连续成功次数达到rise次，服务器就被认为是活的
     */
    protected int riseCount = 2;

    private static final long IGNORE_TIME = 60 * 1000; // 60秒
    /**
     * 记录上次停止命令时间，用来判断在收到停止命令后 {@value #IGNORE_TIME} 时间之内忽视主动心跳
     */
    private ConcurrentMap<Address, Long> stopTimeMap = new ConcurrentHashMap<Address, Long>();

    /**
     * 设置连续失败的次数
     * 
     * @param fallCount
     */
    public void setFallCount(int fallCount) {
        this.fallCount = fallCount;
    }

    /**
     * 设置连续成功的次数
     * 
     * @param riseCount
     */
    public void setRiseCount(int riseCount) {
        this.riseCount = riseCount;
    }

    /**
     * 健康检查
     * 
     * @param t
     * @return
     */
    protected abstract Boolean check(T t);

    /**
     * 根据当前服务器的状态，确定健康检查达到一定成功/失败次数以后才会被认为是健康的/死亡的。
     * 
     * @param t
     * @param currentStatus
     * @return true: alive | false: dead
     */
    public boolean checkAliveOrDead(T t, boolean currentStatus) {
        if (skip(t)) {
            return currentStatus;
        }
        int retry = currentStatus ? fallCount : riseCount;
        boolean flag = true;
        while (retry-- > 0) {
            if (!((flag = check(t)) ^ currentStatus)) {
                break;
            }
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                // ignore
            }
        }
        return flag;
    }

    /**
     * 是否跳过此次健康检查
     * 
     * @param t
     * @return
     */
    protected boolean skip(T t) {
        Long stopTime = stopTimeMap.get(t);
        if (stopTime == null) {
            // 没有收到停止命名,不忽略
            return false;
        }
        long time = System.currentTimeMillis();
        if (time >= stopTime.longValue()) {
            if ((time - stopTime.longValue()) <= IGNORE_TIME) {
                // 如果在忽略时间范围内,忽略
                return true;
            } else {
                stopTimeMap.remove(t);
            }
        }
        return false;
    }

    /**
     * 接收到停止命令，客户端内部暂停心跳判断一定时间
     * 
     * @param t
     */
    public void suspend(Address t) {
        stopTimeMap.put(t, System.currentTimeMillis());
    }

    /**
     * 接收被动心跳
     * 
     * @param t
     * @param time
     */
    public void receiveHeartbeat(Address t, long time) {
        // 实现类自己实现
    }
    
}
