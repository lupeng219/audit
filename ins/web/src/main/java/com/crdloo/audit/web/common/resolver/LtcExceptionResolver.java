package com.crdloo.audit.web.common.resolver;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.framework.router.utils.MonitorLogger;
import com.crdloo.audit.web.common.enums.GeneralExCode;
import com.google.common.collect.Maps;

public class LtcExceptionResolver implements HandlerExceptionResolver {

	private final Logger logger = Logger.getLogger(getClass());
	private final MonitorLogger monitorLog = MonitorLogger.getInstance();

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object obj,
			Exception e) {
		if (e instanceof BizException) {
			BizException bizEx = (BizException) e;
			if (GeneralExCode.NO_QUERY_RESULTS == GeneralExCode.getEnum(bizEx.code())) {
				return new ModelAndView("/common/queryNotFound");
			}
		}
		
		logger.error(e.getMessage(), e);
		monitorLog.info(e.getMessage(), e);
		Map<String, String> map = Maps.newHashMap();
		map.put("errmsg", e.getMessage());

		return new ModelAndView("error", map);
	}

}
