package com.crdloo.audit.framework.router.loadbalance;

import java.util.concurrent.atomic.AtomicLong;

import com.crdloo.audit.framework.router.cluster.Address;

public class RoundRobinLoadBalance extends AbstractLoadBalance {

	private final AtomicLong unit;

    public RoundRobinLoadBalance() {
        unit = new AtomicLong(0);
    }

    @Override
    public Object value() {
        return null;
    }

    /**
     * i = (i + 1) mod n
     */
    @Override
    public Address select(Object t) {
        int index = mod(unit.getAndIncrement(), cluster.aliveSize());
        return cluster.index(index);
    }

}
