package com.crdloo.audit.framework.router.loadbalance;

public class ServerDisabledException extends RuntimeException {

	private static final long serialVersionUID = 3665066320669500131L;

	public ServerDisabledException(String message) {
        super(message);
    }
	
}
