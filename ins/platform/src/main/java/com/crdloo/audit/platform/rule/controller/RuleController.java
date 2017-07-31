package com.crdloo.audit.platform.rule.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crdloo.audit.client.dto.RuleDto;
import com.crdloo.audit.framework.common.controller.BaseController;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;
import com.crdloo.audit.platform.rule.service.RuleService;
@Controller
@RequestMapping("/rule")
public class RuleController extends BaseController  {
    @Autowired
    private RuleService ruleService;

    @RequestMapping("/getRuleData.json")
    public void getRuleData(HttpServletRequest request, HttpServletResponse response) throws BizException{
         Long employeeId = getParam2Long("employeeId");
         String id = getParam("id");
         String cell = getParam("cell");
         String name = getParam("name");
         RuleDto dto = ruleService.bfdQueryRuleDto(employeeId, BfdMealTypeEnum.rule, id, cell, name);
         returnData(request, dto);
    }
}
