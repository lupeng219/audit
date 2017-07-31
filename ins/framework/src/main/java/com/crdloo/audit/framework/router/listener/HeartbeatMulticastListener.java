package com.crdloo.audit.framework.router.listener;

import java.util.Set;

import org.apache.log4j.Logger;

import com.crdloo.audit.framework.router.ITrigger;
import com.crdloo.audit.framework.router.cluster.AbstractHealthChecker;
import com.crdloo.audit.framework.router.cluster.Address;

public class HeartbeatMulticastListener extends MulticastListener {

	private static final Logger logger = Logger.getLogger(HeartbeatMulticastListener.class);
	
	@SuppressWarnings("rawtypes")
    private final AbstractHealthChecker abstractHealthChecker;

    @SuppressWarnings("rawtypes")
    public HeartbeatMulticastListener(int port, Set<String> ips, ITrigger trigger,
            AbstractHealthChecker abstractHealthChecker) {
        super(port, ips, trigger);
        this.abstractHealthChecker = abstractHealthChecker;
    }

    @Override
    protected void handler(Message message) {
        Address address = new Address(message.getIp(), message.getPort());
        if (Message.State.ALIVE == message.getState()) {
            logger.debug("receive ip=" + message.getIp() + ", port=" + message.getPort() + " signal="
                    + message.getState());
            abstractHealthChecker.receiveHeartbeat(address, System.currentTimeMillis());
        } else {
            if (Message.State.STOPPED == message.getState()) {
                abstractHealthChecker.suspend(address);
            }
            super.handler(message);
        }
    }
	
}
