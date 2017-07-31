package com.crdloo.audit.framework.resolver;

import javax.servlet.http.HttpServletRequest;

import com.crdloo.audit.framework.common.filter.AbstractPostprocessor;
import com.crdloo.audit.framework.common.filter.PlatformThreadLocal;

public class BasePostprocessor extends AbstractPostprocessor {

    @Override
    public void postprocess(HttpServletRequest req) {
        // 清理
        PlatformThreadLocal.getInstance().remove();
    }
	
}
