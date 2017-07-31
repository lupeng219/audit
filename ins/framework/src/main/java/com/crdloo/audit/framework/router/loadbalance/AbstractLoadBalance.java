package com.crdloo.audit.framework.router.loadbalance;

import com.crdloo.audit.framework.router.cluster.Address;
import com.crdloo.audit.framework.router.cluster.Cluster;

public abstract class AbstractLoadBalance {

	protected Cluster cluster;
	
	public void setCluster(Cluster cluster) {
        this.cluster = cluster;
    }
	
	/**
     * 策略所依赖的计算值, 可以返回null
     * 
     * @return
     */
    public abstract Object value();

    /**
     * 策略计算
     * 
     * @param t
     * @return
     */
    public abstract Address select(Object t);
    
    /**
     * 策略选择方法
     * 
     * @param location
     * @return 服务器地址
     * @throws ServerDisabledException
     */
    public Address select(String location) throws ServerDisabledException {
        Address address = null;

        int aliveSize = cluster.aliveSize();
        // 无可用服务器直接抛错
        if (aliveSize == 0) {
            throw new ServerDisabledException(prompt());
        }

        // 只有一台服务器时,不需要走策略
        if (aliveSize == 1) {
            try {
                return cluster.getAliveAddresses().get(0);
            } catch (IndexOutOfBoundsException e) {
                // by any possibility
                throw new ServerDisabledException(prompt());
            }
        }

        // 使用策略分配
        address = select(value());
        if (address == null) {
            throw new ServerDisabledException(prompt());
        }
        return address;
    }

    /**
     * 取模
     * 
     * @param id
     * @param radix
     * @return
     */
    protected int mod(long id, int radix) {
        if (radix == 1) {
            return 0;
        }
        int suffix = (int) (id % radix);
        if (suffix < 0) {
            suffix += radix;
        }
        return suffix;
    }

    private String prompt() {
        return "no servers is alived [" + cluster.clusterName() + "]";
    }
    
}
