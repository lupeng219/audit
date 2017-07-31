package com.crdloo.audit.framework.router.cluster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class UdpHealthChecker extends AbstractHealthChecker<Address> {

	/**
     * 如果连续5秒没有收到服务器的心跳，就认为服务器出问题了
     */
    private static final long TIME_INTERVAL = 5000;// 5秒

    /**
     * 阀值时间 多长时间没收到服务器心跳报文(服务器心跳间隔2秒),判断服务器死亡
     */
    private long threshold;

    /**
     * 上次收到心跳的时间
     */
    private ConcurrentMap<Address, Long> lastTimeMap = new ConcurrentHashMap<Address, Long>();

    public UdpHealthChecker() {
        this(TIME_INTERVAL);
    }

    public UdpHealthChecker(long threshold) {
        this.threshold = threshold;
    }

    /**
     * null: 没初始数据,不判断 <br>
     * true: 正常 <br>
     * false: 失败 <br>
     */
    @Override
    public Boolean check(Address t) {
        Long time = lastTimeMap.get(t);
        if (time == null) {
            return null;
        }
        long current = System.currentTimeMillis();
        if (time.longValue() >= current) {
            return Boolean.TRUE;
        }
        return ((current - time.longValue()) >= threshold) ? Boolean.FALSE : Boolean.TRUE;
    }

    @Override
    public boolean checkAliveOrDead(Address t, boolean currentStatus) {
        if (skip(t)) {
            return currentStatus;
        }
        Boolean flag = check(t);
        return (flag != null) ? flag.booleanValue() : currentStatus;
    }

    @Override
    public void receiveHeartbeat(Address t, long time) {
        if (!skip(t)) {
            lastTimeMap.put(t, time);
        }
    }

    @Override
    public void suspend(Address t) {
        lastTimeMap.remove(t);
        super.suspend(t);
    }

}
