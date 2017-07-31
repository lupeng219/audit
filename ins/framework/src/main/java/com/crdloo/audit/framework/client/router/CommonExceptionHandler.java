package com.crdloo.audit.framework.client.router;

import com.crdloo.audit.framework.client.PlatformCode;
import com.crdloo.audit.framework.client.PlatformResult;
import com.crdloo.audit.framework.router.handler.AbstractExceptionHandler;

public class CommonExceptionHandler extends AbstractExceptionHandler<PlatformResult<?>> {

	@SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public PlatformResult<?> handle(Exception e) {
        return new PlatformResult(PlatformCode.SYS_TIMEOUT, e.getMessage(), null);
    }
	
}
