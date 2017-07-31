package com.crdloo.audit.framework.resolver;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.crdloo.audit.framework.common.exception.StatusCodeException;
import com.crdloo.audit.framework.common.exception.SystemMessageCode;
import com.crdloo.audit.framework.common.filter.AbstractPreprocessor;
import com.crdloo.audit.framework.common.filter.InterfaceReq;
import com.crdloo.audit.framework.common.filter.PlatformThreadLocal;
import com.crdloo.audit.framework.router.utils.JsonUtil;
import com.crdloo.audit.framework.router.utils.StringUtil;

public class PlatformPreprocessor extends AbstractPreprocessor {

	@Override
    public void preprocess(Map<String, Object> inputMap, HttpServletRequest req) throws Exception {
        // 判空
        if (inputMap == null || inputMap.isEmpty()) {
            throw new StatusCodeException(SystemMessageCode.SCE_00001);
        }

        // view_id
        String viewIdStr = (String) inputMap.get(InterfaceReq.VIEW_ID);
        int viewId = StringUtil.string2int(viewIdStr, -1);
        if (viewId < 0) {
            throw new StatusCodeException(SystemMessageCode.SCE_00002);
        }
        PlatformThreadLocal.getInstance().setViewId(viewIdStr);

        // client_id
        String clientIdStr = (String) inputMap.get(InterfaceReq.CLIENT_ID);
        int clientId = StringUtil.string2int(clientIdStr, 0);
        if (clientId == 0) {
            throw new StatusCodeException(SystemMessageCode.SCE_00003);
        }
        PlatformThreadLocal.getInstance().setClientId(clientIdStr);

        // visit_ip
        String visitIp = (String) inputMap.get(InterfaceReq.VISIT_IP);
        if (visitIp != null) {
            PlatformThreadLocal.getInstance().setVisitIp(visitIp);
        }
        
        // data
        String dataJson = (String) inputMap.get(InterfaceReq.DATA);
        if (dataJson == null || dataJson.trim().length() == 0) {
            throw new StatusCodeException(SystemMessageCode.SCE_00004);
        }
        Map<String, String> dataMap = JsonUtil.getRootJson(dataJson);
        if (dataMap != null) {
            inputMap.putAll(dataMap);
            inputMap.remove(InterfaceReq.DATA);
        }
    }
	
}
