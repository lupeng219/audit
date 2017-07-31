package com.crdloo.audit.framework.resolver;

import org.apache.log4j.Logger;
import org.springframework.web.util.NestedServletException;

import com.crdloo.audit.framework.client.PlatformCode;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.framework.common.filter.AbstractExceptionHandler;
import com.crdloo.audit.framework.common.filter.ResultStatus;

public class ExceptionHandler extends AbstractExceptionHandler {

	private static Logger log = Logger.getLogger(ExceptionHandler.class);

    @Override
    public ResultStatus handle(Exception e) {
        ResultStatus rs = ResultStatus.unknown();
        if (e instanceof BizException) {
            BizException x = (BizException) e;
            rs = new ResultStatus(Integer.parseInt(x.code()), e.getMessage());
        } else if (e instanceof NestedServletException) {
            Throwable th = e.getCause();
            if (th != null) {
                if ((th instanceof BizException) || (th.getCause() instanceof BizException)) {
                    BizException x = th instanceof BizException ? (BizException) th : (BizException) th.getCause();
                    int code = Integer.parseInt(x.code());
                    rs = new ResultStatus(code, x.getMessage());
                } else {
                    log.error("ERROR CODE:" + "-1" + ":" + e.getMessage(), e);
                    rs = new ResultStatus(PlatformCode.SYS_EXCPTION, e.getMessage());
                }
            }
        } else {
            log.error("ERROR CODE:" + "-1" + ":" + e.getMessage(), e);
            rs = new ResultStatus(PlatformCode.SYS_EXCPTION, e.getMessage());
        }
        return rs;
    }
	
}
