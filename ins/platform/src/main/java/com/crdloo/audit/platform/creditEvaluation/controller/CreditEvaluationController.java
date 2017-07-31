package com.crdloo.audit.platform.creditEvaluation.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crdloo.audit.client.dto.TelPeriodDto;
import com.crdloo.audit.client.dto.TelStatusDto;
import com.crdloo.audit.framework.common.controller.BaseController;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;
import com.crdloo.audit.platform.creditEvaluation.service.TelPeriodService;
import com.crdloo.audit.platform.creditEvaluation.service.TelStatusService;

@Controller
@RequestMapping("/creditEvaluation")
public class CreditEvaluationController extends BaseController{
	@Autowired
	private TelPeriodService telperiodService;
	@Autowired
	private TelStatusService telStatusService;
	@RequestMapping("/getTelPeriodData.json")
	public void getTelPeriodData(HttpServletRequest request, HttpServletResponse response) throws BizException{
         Long employeeId = getParam2Long("employeeId");
         String id = getParam("id");
         String cell = getParam("cell");
         String name = getParam("name");
         TelPeriodDto dto = telperiodService.bfdQueryTelPeriodDto(employeeId, BfdMealTypeEnum.TelPeriod, id, cell, name);
	     returnData(request, dto);
	}
	
	@RequestMapping("/getTelStatusData.json")
	public void getTelStatusData(HttpServletRequest request, HttpServletResponse response) throws BizException{
         Long employeeId = getParam2Long("employeeId");
         String id = getParam("id");
         String cell = getParam("cell");
         String name = getParam("name");
         TelStatusDto dto = telStatusService.bfdQueryTelStatusDto(employeeId, BfdMealTypeEnum.TelStatus, id, cell, name);
	     returnData(request, dto);
	}
	
	
	
}
