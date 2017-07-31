package com.crdloo.audit.framework.router.loadbalance;

import java.util.concurrent.atomic.AtomicLong;

import com.crdloo.audit.framework.common.filter.PlatformThreadLocal;
import com.crdloo.audit.framework.router.cluster.Address;
import com.crdloo.audit.framework.router.utils.StringUtil;

public class UserAndRoundRobinLoadBalance extends RoundRobinLoadBalance {

	private final AtomicLong unit;

    public UserAndRoundRobinLoadBalance() {
        unit = new AtomicLong(0);
    }

    @Override
    public Object value() {
        return PlatformThreadLocal.getInstance().getViewId();
    }

    @Override
    public Address select(Object value) {
        int viewId = StringUtil.string2int((String) value, 0);
        int index = 0;
        if (viewId == 0) {
            index = mod(unit.getAndIncrement(), cluster.aliveSize());
        } else {
            index = mod(viewId, cluster.aliveSize());
        }
        return cluster.index(index);
    }
    
}
