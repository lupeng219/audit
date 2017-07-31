package com.crdloo.audit.framework.router;

import com.crdloo.audit.framework.router.cluster.Address;

public interface ITrigger {

	/**
     * 加入(服务器开始服务)
     */
    public void join(Address address);

    /**
     * 退出(服务器停止服务)
     */
    public void exit(Address address);
    
}
