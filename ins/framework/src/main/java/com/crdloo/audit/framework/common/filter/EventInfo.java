package com.crdloo.audit.framework.common.filter;

public class EventInfo {

	private long start;
    private long eclipse;
    private String actionPath;
    private String clientIP;

    public long getEclipse() {
        return eclipse;
    }

    public void setEclipse(long eclipse) {
        this.eclipse = eclipse;
    }

    public String getActionPath() {
        return actionPath;
    }

    public void setActionPath(String actionPath) {
        this.actionPath = actionPath;
    }

    public String getClientIP() {
        return clientIP;
    }

    public void setClientIP(String clientIP) {
        this.clientIP = clientIP;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }
    
}
