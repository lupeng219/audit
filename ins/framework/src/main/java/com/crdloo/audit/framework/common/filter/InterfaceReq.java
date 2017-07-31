package com.crdloo.audit.framework.common.filter;

import java.util.HashMap;
import java.util.Map;

import com.crdloo.audit.framework.router.utils.JsonUtil;

public class InterfaceReq {

	public static final String VIEW_ID = "view_id";
    public static final String CLIENT_ID = "client_id";
    public static final String VISIT_IP = "visit_ip";
    public static final String DATA = "data";

    private int view_id;
    private int client_id;
    private Object data;

    public int getView_id() {
        return view_id;
    }

    public void setView_id(int view_id) {
        this.view_id = view_id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String toJson() {
        return JsonUtil.toJson(this);
    }

    public Map<String, String> toMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put(VIEW_ID, view_id + "");
        map.put(CLIENT_ID, client_id + "");
        map.put(DATA, JsonUtil.toJson(data));
        return map;
    }

    @Override
    public String toString() {
        String dataJson = JsonUtil.toJson(data);
        StringBuilder builder = new StringBuilder();
        if (dataJson != null) {
            builder.append("?");
            builder.append(VIEW_ID).append("=").append(view_id);
            builder.append("&");
            builder.append(CLIENT_ID).append("=").append(client_id);
            builder.append("&");
            builder.append(DATA).append("=").append(dataJson);
        }
        return builder.toString();
    }
    
}
