package com.crdloo.audit.framework.common.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.crdloo.audit.framework.client.PageInfo;
import com.crdloo.audit.framework.common.filter.PlatformThreadLocal;
import com.crdloo.audit.framework.common.filter.ResultStatus;
import com.crdloo.audit.framework.router.utils.JsonUtil;
import com.crdloo.audit.framework.router.utils.MonitorLogger;
import com.crdloo.audit.framework.router.utils.StringUtil;

public abstract class BaseController {

	protected final Logger logger = Logger.getLogger(getClass());

	protected final MonitorLogger monitorLog = MonitorLogger.getInstance();

	private HttpServletRequest getHttpRequest() {
		return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
	}

	protected Long getEmployeeId() {
		Long userId = null;
		String viewId = PlatformThreadLocal.getInstance().getViewId();
		if (StringUtils.isNotBlank(viewId)) {
			userId = StringUtil.string2Long(viewId);
		}
		if (userId <= 0) {
			return null;
		}
		return userId;
	}

	@SuppressWarnings("unchecked")
	protected Map<String, Object> getMap() {
		return (Map<String, Object>) getHttpRequest().getAttribute(ResultStatus.INPUT);
	}

	@Deprecated
	@SuppressWarnings("unchecked")
	protected Map<String, Object> getMap(HttpServletRequest request) {
		return (Map<String, Object>) request.getAttribute(ResultStatus.INPUT);
	}

	protected void returnData(HttpServletRequest request, Object data) {
		request.setAttribute(ResultStatus.OUTPUT, data);
	}

	protected Integer getParam2Int(String name) {
		return StringUtil.string2Int((String) getMap().get(name));
	}

	protected Integer getParam2Int(String name, int defaultValue) {
		return StringUtil.string2Int((String) getMap().get(name), defaultValue);
	}

	protected int getParam2int(String name) {
		return StringUtil.string2int((String) getMap().get(name));
	}

	protected int getParam2int(String name, int defaultValue) {
		return StringUtil.string2int((String) getMap().get(name), defaultValue);
	}

	protected Long getParam2Long(String name) {
		return StringUtil.string2Long((String) getMap().get(name));
	}

	protected Long getParam2Long(String name, long defaultValue) {
		return StringUtil.string2Long((String) getMap().get(name), defaultValue);
	}

	protected long getParam2long(String name) {
		return StringUtil.string2long((String) getMap().get(name));
	}

	protected long getParam2long(String name, long defaultValue) {
		return StringUtil.string2long((String) getMap().get(name), defaultValue);
	}

	protected Float getParam2Float(String name) {
		return StringUtil.string2Float((String) getMap().get(name));
	}

	protected Float getParam2Float(String name, long defaultValue) {
		return StringUtil.string2Float((String) getMap().get(name), defaultValue);
	}

	protected float getParam2float(String name) {
		return StringUtil.string2float((String) getMap().get(name));
	}

	protected float getParam2float(String name, long defaultValue) {
		return StringUtil.string2float((String) getMap().get(name), defaultValue);
	}

	protected String getParam(String name) {
		return (String) getMap().get(name);
	}

	@SuppressWarnings("unchecked")
	protected <T> T getParamObj(String name, Class<?>... classes) {
		String json = (String) getMap().get(name);
		return (T) JsonUtil.toObject(json, classes);
	}

	protected Integer getPageSize() {
		Integer pagesize = StringUtil.string2Int((String) getMap().get(PageInfo.PAGEINFO_PAGESIZE), 0);
		if (pagesize == null) {
			pagesize = PageInfo.DEFAULT_PAGESIZE;
		}
		return pagesize;
	}

	protected Integer getCurrentPage() {
		Integer currentPage = StringUtil.string2Int((String) getMap().get(PageInfo.PAGEINFO_CURRENTPAGE), 0);
		if (currentPage == null) {
			currentPage = PageInfo.DEFAULT_CURRENT_PAGE;
		}
		return currentPage;
	}

	@Deprecated
	protected Integer getPageSize(Map<String, Object> map) {
		Integer pagesize = StringUtil.string2Int((String) map.get(PageInfo.PAGEINFO_PAGESIZE), 0);
		if (pagesize == null) {
			pagesize = PageInfo.DEFAULT_PAGESIZE;
		}
		return pagesize;
	}

	@Deprecated
	protected Integer getCurrentPage(Map<String, Object> map) {
		Integer currentPage = StringUtil.string2Int((String) map.get(PageInfo.PAGEINFO_CURRENTPAGE), 0);
		if (currentPage == null) {
			currentPage = PageInfo.DEFAULT_CURRENT_PAGE;
		}
		return currentPage;
	}

	public void responseJson(HttpServletResponse response, String json) throws IOException {
		response.setContentType("application/json;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(json);
		response.getWriter().flush();
		response.getWriter().close();
	}

}
