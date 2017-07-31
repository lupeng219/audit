package com.crdloo.audit.web.antifraud.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.web.antifraud.form.ApplyLoanMonForm;
import com.crdloo.audit.web.antifraud.form.ApplyLoanStrForm;
import com.crdloo.audit.web.antifraud.form.ExecutionForm;
import com.crdloo.audit.web.antifraud.form.InfoRelationForm;
import com.crdloo.audit.web.antifraud.form.SpecialList_cForm;
import com.crdloo.audit.web.antifraud.service.AntifraudService;
import com.crdloo.audit.web.common.controller.BaseController;
import com.crdloo.audit.web.common.enums.GeneralExCode;
@Controller
@RequestMapping("/antifraud")
public class AntifraudController extends BaseController{
    @Autowired
    private AntifraudService antifraudService;


    @RequestMapping("/indexSpecialList_c")
    public String indexSpecialList_c(){
        return "/antifraud/getSpecialList_c";
    }
    
    @RequestMapping(value = "/getSpecialList_cData")
    public String getSpecialList_cData(String id, String cell, String name,
            String linkman_cell,Model model) throws BizException {
        Long userId = getCurrentUserId();
        logger.info("rule [getSpecialList_cData]: id=" +id + ", cell=" + cell +", name="+name+",linkman_cell="+linkman_cell);
        monitorLog.info("rule [getSpecialList_cData]: id=" +id + ", cell=" + cell +", name="+name+",linkman_cell="+linkman_cell);
        if (userId == null || userId <= 0) {
            throw new BizException(GeneralExCode.USER_NOT_LOGIN);
        }
        SpecialList_cForm form = antifraudService.getSpecialList_cDto(id, cell,name, linkman_cell);
        model.addAttribute("specialList", form);
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        model.addAttribute("cell", cell);
        model.addAttribute("linkman_cell", linkman_cell);
        return "/antifraud/specialList_cResult";
    }
    @RequestMapping(value = "/exportSpecialList_cPdf")
    public void exportSpecialList_cPdf(HttpServletRequest request,String id,String cell,String name, String linkman_cell, HttpServletResponse response) throws BizException {
        logger.info("rule [exportgetSpecialList_cPdf]: id=" +id + ", cell=" + cell +", name="+name+",linkman_cell="+linkman_cell);
        monitorLog.info("rule [exportgetSpecialList_cPdf]: id=" +id + ", cell=" + cell +", name="+name+",linkman_cell="+linkman_cell);
        byte[] pdffile = antifraudService.exportSpecialList_cPdf(id, cell, name, linkman_cell);
        responsePdf(pdffile, response);
    }
    @RequestMapping("/indexApplyLoanStr")
    public String indexApplyLoanStr(){
        return "/antifraud/getApplyLoanStr";
    }    
    @RequestMapping(value = "/getApplyLoanStrData")
    public String getApplyLoanStrData(String id, String cell, String name,Model model) throws BizException {
        Long userId = getCurrentUserId();
        logger.info("rule [getApplyLoanStrData]: id=" +id + ", cell=" + cell +", name="+name);
        monitorLog.info("rule [getApplyLoanStrData]: id=" +id + ", cell=" + cell +", name="+name);
        if (userId == null || userId <= 0) {
            throw new BizException(GeneralExCode.USER_NOT_LOGIN);
        }
        ApplyLoanStrForm form = antifraudService.getApplyLoanStrData(id, cell, name);
        model.addAttribute("applyLoanStrForm", form);
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        model.addAttribute("cell", cell);
        return "/antifraud/applyLoanStrResult";
    }
    @RequestMapping(value = "/exportApplyLoanStrPdf")
    public void exportApplyLoanStrPdf(HttpServletRequest request,String id,String cell,String name, HttpServletResponse response) throws BizException {
        logger.info("rule [exportApplyLoanStrPdf]: id=" +id + ", cell=" + cell +", name="+name);
        monitorLog.info("rule [exportApplyLoanStrPdf]: id=" +id + ", cell=" + cell +", name="+name);
        byte[] pdffile = antifraudService.exportApplyLoanStrPdf(id, cell, name);
        responsePdf(pdffile, response);
    }
    
    
    @RequestMapping("/indexApplyLoanMon")
    public String indexApplyLoanMon(){
        return "/antifraud/indexApplyLoanMon";
    }
    @RequestMapping(value = "/exportApplyLoanMonPdf")
	public void exportApplyLoanMonPdf(String id, String cell, String name,HttpServletRequest request, String linkman_cell,HttpServletResponse response) throws BizException {
        logger.info("ApplyLoanMon [exportApplyLoanMonPdf]: id=" +id + ", cell=" + cell +", name="+name+",linkman_cell="+linkman_cell);
        monitorLog.info("ApplyLoanMon [exportApplyLoanMonPdf]: id=" +id + ", cell=" + cell +", name="+name+",linkman_cell="+linkman_cell);
    	byte[] pdffile = antifraudService.exportApplyLoanMonPdf(id, cell, name, linkman_cell);
		responsePdf(pdffile, response);
	}
    @RequestMapping(value = "/getApplyLoanMonData")
    public String getApplyLoanMonData(String id, String cell, String name,
            String linkman_cell,Model model) throws BizException {
    	Long userId = getCurrentUserId();
        logger.info("ApplyLoanMon [ApplyLoanMon]: id=" +id + ", cell=" + cell +", name="+name+",linkman_cell="+linkman_cell);
        monitorLog.info("ApplyLoanMon [ApplyLoanMon]: id=" +id + ", cell=" + cell +", name="+name+",linkman_cell="+linkman_cell);
        if (userId == null || userId <= 0) {
            throw new BizException(GeneralExCode.USER_NOT_LOGIN);
        }
        ApplyLoanMonForm form = antifraudService.getApplyLoanMonData(id, cell, name, linkman_cell);
    	
        model.addAttribute("applyLoanMonForm", form);
        model.addAttribute("id",id);
        model.addAttribute("cell",cell);
        model.addAttribute("name",name);
        model.addAttribute("linkman_cell",linkman_cell);
    	return "/antifraud/getApplyLoanMonData";
    }
    
    @RequestMapping("/indexExecution")
    public String indexExecution(){
        return "/antifraud/indexExecution";
    }
    @RequestMapping(value = "/exportExecutionPdf")
   	public void exportExecutionPdf(String id, String cell, String name,HttpServletRequest request, HttpServletResponse response) throws BizException {
    	logger.info("Execution [exportExecutionPdf]: id=" +id + ", cell=" + cell +", name="+name);
        monitorLog.info("Execution [exportExecutionPdf]: id=" +id + ", cell=" + cell +", name="+name);
       	byte[] pdffile = antifraudService.exportExecutionPdf(id, cell, name);
   		responsePdf(pdffile, response);
   	}
    
    @RequestMapping(value = "/getExecutionData")
    public String getExecutionData(String id, String cell, String name,
            Model model) throws BizException {
    	Long userId = getCurrentUserId();
        logger.info("Execution [Execution]: id=" +id + ", cell=" + cell +", name="+name);
        monitorLog.info("Execution [Execution]: id=" +id + ", cell=" + cell +", name="+name);
        if (userId == null || userId <= 0) {
            throw new BizException(GeneralExCode.USER_NOT_LOGIN);
        }
        ExecutionForm form = antifraudService.getExecutionData(id, cell, name);
        model.addAttribute("executionForm", form);
        model.addAttribute("id",id);
        model.addAttribute("cell",cell);
        model.addAttribute("name",name);
    	return "/antifraud/getExecutionData";
    }
    
    @RequestMapping("/indexInfoRelation")
    public String indexInfoRelation(){
        return "/antifraud/getInfoRelation";
    } 
    
    @RequestMapping(value = "/getInfoRelationData")
    public String getInfoRelationData(String id, String cell, String name,
            Model model) throws BizException {
    	Long userId = getCurrentUserId();
        logger.info("getInfoRelationData [getInfoRelationData]: id=" +id + ", cell=" + cell +", name="+name);
        monitorLog.info("getInfoRelationData [getInfoRelationData]: id=" +id + ", cell=" + cell +", name="+name);
        if (userId == null || userId <= 0) {
            throw new BizException(GeneralExCode.USER_NOT_LOGIN);
        }
        InfoRelationForm form = antifraudService.getInfoRelationData(id, cell, name);
        
        model.addAttribute("infoRelationForm", form);
        model.addAttribute("id",id);
        model.addAttribute("cell",cell);
        model.addAttribute("name",name);
    	return "/antifraud/infoRelationResult";
    }
    @RequestMapping(value = "/exportInfoRelationPdf")
    public void exportInfoRelationPdf(HttpServletRequest request,String id,String cell,String name, HttpServletResponse response) throws BizException {
        logger.info("rule [exportInfoRelationPdf]: id=" +id + ", cell=" + cell +", name="+name);
        monitorLog.info("rule [exportInfoRelationPdf]: id=" +id + ", cell=" + cell +", name="+name);
        byte[] pdffile = antifraudService.exportInfoRelationPdf(id, cell, name);
        responsePdf(pdffile, response);
    }
}
