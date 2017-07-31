package com.crdloo.audit.web.common.service;

import org.apache.log4j.Logger;

import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.framework.router.utils.MonitorLogger;
import com.crdloo.audit.web.common.util.FreemarkerUtil;
import com.crdloo.audit.web.common.util.PdfUtil;

public abstract class BaseService {
	
	protected final Logger logger = Logger.getLogger(getClass());

	protected final MonitorLogger monitorLog = MonitorLogger.getInstance();
	
	protected byte[] resultToPdf(String templateName, Object data) throws BizException {
		String html = FreemarkerUtil.processAsString(templateName, data);
		return PdfUtil.createPdfByHtml(html);
	}
	
}
