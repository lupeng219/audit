package com.crdloo.audit.web.rule.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.web.common.controller.BaseController;
import com.crdloo.audit.web.common.enums.GeneralExCode;
import com.crdloo.audit.web.rule.form.RuleForm;
import com.crdloo.audit.web.rule.service.RuleService;
@Controller
@RequestMapping("/rule")
public class RuleController extends BaseController{

    @Autowired
    private RuleService ruleService;

    @RequestMapping("/indexRule")
    public String indexRule(){
        return "/rule/getRule";
    }
    
    @RequestMapping(value = "/getRuleData")
    public String getRuleData(String id,String cell,String name,Model model) throws BizException, UnsupportedEncodingException {
        Long userId = getCurrentUserId();
        logger.info("rule [getRuleData]: id=" +id + ", cell=" + cell +", name="+name);
        monitorLog.info("rule [getRuleData]: id=" +id + ", cell=" + cell +", name="+name);
        if (userId == null || userId <= 0) {
            throw new BizException(GeneralExCode.USER_NOT_LOGIN);
        }
        RuleForm form = ruleService.getRuleData(userId, id, cell, name);
        model.addAttribute("ruleForm", form);
        model.addAttribute("id",id);
        model.addAttribute("cell",cell);
        model.addAttribute("name",name);
        return "/rule/ruleResult";
    }
    @RequestMapping(value = "/exportRulePdf")
    public void exportPdf(HttpServletRequest request,String id,String cell,String name, HttpServletResponse response) throws BizException {
        Long employeeId = getCurrentUserId();
        logger.info("rule [exportRulePdf]: id=" +id + ", cell=" + cell +", name="+name);
        monitorLog.info("rule [exportRulePdf]: id=" +id + ", cell=" + cell +", name="+name);
        byte[] pdffile = ruleService.exportRulePdf(employeeId, id, cell, name);
        responsePdf(pdffile, response);
    }
}
