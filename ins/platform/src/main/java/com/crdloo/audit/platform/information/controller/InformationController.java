package com.crdloo.audit.platform.information.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crdloo.audit.client.dto.BankThreeDto;
import com.crdloo.audit.client.dto.IdTwo_zDto;
import com.crdloo.audit.client.dto.KeyAttributionDto;
import com.crdloo.audit.client.dto.TelCheckDto;
import com.crdloo.audit.framework.common.controller.BaseController;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;
import com.crdloo.audit.platform.information.service.BankThreeService;
import com.crdloo.audit.platform.information.service.IdTwo_zService;
import com.crdloo.audit.platform.information.service.KeyAttributionService;
import com.crdloo.audit.platform.information.service.TelCheckService;
@Controller
@RequestMapping("/information")
public class InformationController extends BaseController   {

    @Autowired
    private BankThreeService bankThreeService; 
    @Autowired
    private IdTwo_zService idTwo_zService;
    @Autowired
    private TelCheckService telCheckService;
    @Autowired
    private KeyAttributionService keyAttributionService;
    @RequestMapping("/getBankThreeData.json")
    public void getBankThreeData(HttpServletRequest request, HttpServletResponse response) throws BizException{
         Long employeeId = getParam2Long("employeeId");
         String id = getParam("id");
         String name = getParam("name");
         String bank_id = getParam("bank_id");
         BankThreeDto dto = bankThreeService.bfdQueryBankThreeData(employeeId, BfdMealTypeEnum.BankThree, id, name, bank_id);
         returnData(request, dto);
    }
    
    @RequestMapping("/getIdTwo_zData.json")
    public void getIdTwo_zData(HttpServletRequest request, HttpServletResponse response) throws BizException{
         Long employeeId = getParam2Long("employeeId");
         String id = getParam("id");
         String name = getParam("name");
         IdTwo_zDto dto = idTwo_zService.bfdQueryIdTwo_zData(employeeId, BfdMealTypeEnum.IdTwo_z, id, name);
         returnData(request, dto);
    }
    @RequestMapping("/getKeyAttributionData.json")
    public void getKeyAttributionData(HttpServletRequest request, HttpServletResponse response) throws BizException{
         Long employeeId = getParam2Long("employeeId");
         String id = getParam("id");
         String name = getParam("name");
         String cell = getParam("cell");
         KeyAttributionDto dto = keyAttributionService.bfdQueryKeyAttributionDto(employeeId, BfdMealTypeEnum.KeyAttribution, id, cell, name);
         returnData(request, dto);
    }
    
    @RequestMapping("/getTelCheckData.json")
    public void getTelCheckData(HttpServletRequest request, HttpServletResponse response) throws BizException{
         Long employeeId = getParam2Long("employeeId");
         String id = getParam("id");
         String name = getParam("name");
         String cell = getParam("cell");
         TelCheckDto dto = telCheckService.bfdQueryTelCheckDto(employeeId, BfdMealTypeEnum.TelCheck, id, cell, name);
         returnData(request, dto);
    }
    
    
}
