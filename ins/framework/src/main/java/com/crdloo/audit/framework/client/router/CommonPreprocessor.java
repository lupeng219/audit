package com.crdloo.audit.framework.client.router;

import java.util.HashMap;
import java.util.Map;

import com.crdloo.audit.framework.client.PageInfo;
import com.crdloo.audit.framework.common.filter.InterfaceReq;
import com.crdloo.audit.framework.common.filter.PlatformThreadLocal;
import com.crdloo.audit.framework.router.handler.IPreprocessor;
import com.crdloo.audit.framework.router.utils.JsonUtil;
import com.crdloo.audit.framework.router.utils.PropUtil;

public class CommonPreprocessor implements IPreprocessor {

	private String version;
	
	public CommonPreprocessor() {
		this("1.0");
	}

    public CommonPreprocessor(String version) {
        this.version = version;
    }

	public Map<String, Object> preprocess(Object data) {
		// 分页信息处理
        if (data instanceof Map) {
            Map<String, Object> _data = (Map<String, Object>) data;
            Object psObj = _data.get(PageInfo.PAGEINFO_PAGESIZE);
            Object cpObj = _data.get(PageInfo.PAGEINFO_CURRENTPAGE);
            if (psObj != null && cpObj != null) {
                _data.put(PageInfo.PAGEINFO_PAGESIZE, psObj == null ? 15 : (Integer) psObj);
                _data.put(PageInfo.PAGEINFO_CURRENTPAGE, cpObj == null ? 0 : (Integer) cpObj);
            }
        }

        Map<String, Object> params = new HashMap<String, Object>();
        params.put(InterfaceReq.VIEW_ID, PlatformThreadLocal.getInstance().getViewId());
        params.put(InterfaceReq.VISIT_IP, PlatformThreadLocal.getInstance().getVisitIp());
        params.put(InterfaceReq.CLIENT_ID, PropUtil.getInstance().get("project.client_id"));
        params.put("version", version);
        params.put(InterfaceReq.DATA, JsonUtil.toJson(data));

        return params;
	}

    
}
