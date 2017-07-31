package com.crdloo.audit.framework.common.filter;

import java.util.HashMap;
import java.util.Map;

public class PlatformThreadLocal extends ThreadLocal<Map<String, Object>> {

    private static final PlatformThreadLocal instance = new PlatformThreadLocal();

    private PlatformThreadLocal() {
    }

    public static PlatformThreadLocal getInstance() {
        return instance;
    }

    public Object get(String key) {
        return this.get().get(key);
    }

    public void set(String key, Object value) {
        this.get().put(key, value);
    }

    public void setViewId(String viewId) {
        set(InterfaceReq.VIEW_ID, viewId);
    }

    public String getViewId() {
        Object obj = get(InterfaceReq.VIEW_ID);
        return (obj != null) ? (String) obj : "0";
    }

    public void setClientId(String clientId) {
        set(InterfaceReq.CLIENT_ID, clientId);
    }

    public String getClientId() {
        Object obj = get(InterfaceReq.CLIENT_ID);
        return (obj != null) ? (String) obj : "0";
    }

    public void setVisitIp(String visitIp) {
        set(InterfaceReq.VISIT_IP, visitIp);
    }

    public String getVisitIp() {
        Object obj = get(InterfaceReq.VISIT_IP);
        return (obj != null) ? (String) obj : "";
    }

    @Override
    protected Map<String, Object> initialValue() {
        return new HashMap<String, Object>(5);
    }
    
    @Override
    public void remove() {
        this.get().clear();
    }
    
}
