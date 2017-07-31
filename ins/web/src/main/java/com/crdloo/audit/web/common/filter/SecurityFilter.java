package com.crdloo.audit.web.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.crdloo.audit.framework.common.filter.PlatformThreadLocal;
import com.crdloo.audit.framework.router.utils.SystemUtil;
import com.crdloo.audit.web.common.util.SecurityUserHolder;

public class SecurityFilter implements Filter {
	
	public FilterConfig config;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.config = filterConfig;
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest hreq = (HttpServletRequest) request;  
		// 向ThreadLocal中加入viewid,ip
		Long userId = SecurityUserHolder.getEmployeeId();
		if(userId==null){
			userId = 0L;
		}
		String ip = SystemUtil.getRemoteIp(hreq);
		PlatformThreadLocal.getInstance().setViewId(userId.toString());
		PlatformThreadLocal.getInstance().setVisitIp(ip);
//		PlatformThreadLocal.getInstance().set("", user);
		filterChain.doFilter(request, response);
		PlatformThreadLocal.getInstance().remove();
	}

	@Override
	public void destroy() {
		this.config = null;
	}

}
