package com.crdloo.audit.framework.web;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/monitor")
public class MonitorController {

	@RequestMapping(value = "/http.do")
    public void handlerHttp(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType("UTF-8");
        PrintWriter writer = response.getWriter();
        writer.print("OK");
        writer.flush();
    }
	
}
