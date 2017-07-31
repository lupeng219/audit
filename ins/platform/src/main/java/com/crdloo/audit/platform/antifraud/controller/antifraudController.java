package com.crdloo.audit.platform.antifraud.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crdloo.audit.client.dto.ApplyLoanMonDto;
import com.crdloo.audit.client.dto.ApplyLoanStrDto;
import com.crdloo.audit.client.dto.ExecutionDto;
import com.crdloo.audit.client.dto.InfoRelationDto;
import com.crdloo.audit.client.dto.SpecialList_cDto;
import com.crdloo.audit.framework.common.controller.BaseController;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.antifraud.service.ApplyLoanMonService;
import com.crdloo.audit.platform.antifraud.service.ApplyLoanStrService;
import com.crdloo.audit.platform.antifraud.service.ExecutionService;
import com.crdloo.audit.platform.antifraud.service.InfoRelationService;
import com.crdloo.audit.platform.antifraud.service.SpecialList_cService;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;

@Controller
@RequestMapping("/antifraud")
public class antifraudController extends BaseController{
    
    @Autowired
    private SpecialList_cService specialList_cService;
    @Autowired
    private ApplyLoanMonService applyLoanMonService;
    @Autowired
    private ExecutionService executionService;
    @Autowired
    private InfoRelationService infoRelationService;
    @Autowired
    private ApplyLoanStrService applyLoanStrService;

    @RequestMapping("/getSpecialList_cData.json")
    public void getSpecialList_cData(HttpServletRequest request, HttpServletResponse response) throws BizException{
         Long employeeId = getEmployeeId();
         String id = getParam("id");
         String cell = getParam("cell");
         String name = getParam("name");
         String linkman_cell = getParam("linkman_cell");
         SpecialList_cDto dto = specialList_cService.bfdQuerySpecialList_cDto(employeeId, BfdMealTypeEnum.SpecialList_c, id, cell, name,linkman_cell);
         returnData(request, dto);
    }
	@RequestMapping("/getApplyLoanMonData.json")
	public void getApplyLoanMonData(HttpServletRequest request, HttpServletResponse response) throws BizException{
         Long employeeId = getEmployeeId();
		 String id = getParam("id");
         String cell = getParam("cell");
         String name = getParam("name");
         String linkman_cell = getParam("linkman_cell");
         ApplyLoanMonDto dto = applyLoanMonService.bfdQueryApplyLoanMonDto(employeeId, BfdMealTypeEnum.ApplyLoanMon, id, cell, name, linkman_cell);
	     returnData(request, dto);
	}
	@RequestMapping("/getExecutionData.json")
	public void getExecutionData(HttpServletRequest request, HttpServletResponse response) throws BizException{
         Long employeeId = getEmployeeId();
         String id = getParam("id");
         String cell = getParam("cell");
         String name = getParam("name");
         ExecutionDto dto = executionService.bfdQueryExecutionDto(employeeId, BfdMealTypeEnum.Execution, id, cell, name);
	     returnData(request, dto);
	}
	@RequestMapping("/getInfoRelationData.json")
	public void getInfoRelationData(HttpServletRequest request, HttpServletResponse response) throws BizException{
         Long employeeId = getEmployeeId();
         String id = getParam("id");
         String cell = getParam("cell");
         String name = getParam("name");
         InfoRelationDto dto = infoRelationService.bfdQueryInfoRelationDto(employeeId, BfdMealTypeEnum.InfoRelation, id, cell, name);
	     returnData(request, dto);
	}
	@RequestMapping("/getApplyLoanStrData.json")
    public void getApplyLoanStrData(HttpServletRequest request, HttpServletResponse response) throws BizException{
         Long employeeId = getEmployeeId();
         String id = getParam("id");
         String cell = getParam("cell");
         String name = getParam("name");
         ApplyLoanStrDto dto = applyLoanStrService.bfdQueryApplyLoanStrDto(employeeId, BfdMealTypeEnum.ApplyLoanStr, id, cell, name);
         returnData(request, dto);
    }
}
