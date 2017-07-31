package com.crdloo.audit.web.information.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.web.common.controller.BaseController;
import com.crdloo.audit.web.common.enums.GeneralExCode;
import com.crdloo.audit.web.information.form.BankThreeForm;
import com.crdloo.audit.web.information.form.IdTwo_zForm;
import com.crdloo.audit.web.information.form.KeyAttributionForm;
import com.crdloo.audit.web.information.form.TelCheckForm;
import com.crdloo.audit.web.information.service.InformationService;

@Controller
@RequestMapping("/information")
public class InformationController extends BaseController{ 
    @Autowired
    private InformationService informationService; 
    
    @RequestMapping("/indexBankThree")
    public String indexBankThree(){
        return "/information/getBankThree";
    }
    
    @RequestMapping(value = "/getBankThreeData")
    public String getBankThreeData(String id,String name,String bank_id,Model model) throws BizException {
        Long userId = getCurrentUserId();
        logger.info("rule [getBankThreeData]: id=" +id + ", bank_id=" + bank_id +", name="+name);
        monitorLog.info("rule [getBankThreeData]: id=" +id + ", bank_id=" + bank_id +", name="+name);
        if (userId == null || userId <= 0) {
            throw new BizException(GeneralExCode.USER_NOT_LOGIN);
        }
        BankThreeForm form = informationService.getBankThreeData(userId, id, name, bank_id);
      
        model.addAttribute("bankThreeForm", form);
        model.addAttribute("id",id);
        model.addAttribute("name",name);
        model.addAttribute("bank_id",bank_id);
        return "/information/bankThreeResult";
    } 
    @RequestMapping(value = "/exportBankThreePdf")
    public void exportBankThreePdf(HttpServletRequest request,String id,String name,String bank_id, HttpServletResponse response) throws BizException {
        Long employeeId = getCurrentUserId();
        logger.info("rule [exportBankThreePdf]: id=" +id + ", bank_id="+ bank_id +", name="+name);
        monitorLog.info("rule [exportBankThreePdf]: id=" +id + ", bank_id=" + bank_id +", name="+name);
        byte[] pdffile = informationService.exportBankThreePdf(employeeId, id, name, bank_id);
        responsePdf(pdffile, response);
    }
    
    @RequestMapping("/indexIdTwo_z")
    public String indexIdTwo_z(){
        return "/information/getIdTwo_z";
    }
    @RequestMapping(value = "/getIdTwo_zData")
    public String getIdTwo_zData(String id,String name,Model model) throws BizException {
        Long userId = getCurrentUserId();
        logger.info("rule [getIdTwo_zData]: id=" +id + ",  name="+name);
        monitorLog.info("rule [getIdTwo_zData]: id=" +id + ", name="+name);
        if (userId == null || userId <= 0) {
            throw new BizException(GeneralExCode.USER_NOT_LOGIN);
        }
        IdTwo_zForm form = informationService.getIdTwo_zData(userId, id, name);
        model.addAttribute("idTwo_zForm", form);
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "/information/idTwo_zResult";
    }
    @RequestMapping(value = "/exportidTwo_zPdf")
    public void exportidTwo_zPdf(HttpServletRequest request,String id,String name, HttpServletResponse response) throws BizException {
        Long employeeId = getCurrentUserId();
        logger.info("rule [exportidTwo_zPdf]: id=" +id + ",  name="+name);
        monitorLog.info("rule [exportidTwo_zPdf]: id=" +id + ", name="+name);
        byte[] pdffile =informationService.exportidTwo_zPdf(employeeId, id, name);
        responsePdf(pdffile, response);
    }
    @RequestMapping("/indexKeyAttribution")
    public String indexKeyAttribution(){
        return "/information/indexKeyAttribution";
    }
    @RequestMapping(value = "/exportKeyAttributionPdf")
	public void exportKeyAttributionPdf(String id, String cell, String name,HttpServletRequest request,HttpServletResponse response) throws BizException {
        logger.info("KeyAttribution [exportKeyAttributionPdf]: id=" +id + ", cell=" + cell +", name="+name);
        monitorLog.info("KeyAttribution [exportKeyAttributionPdf]: id=" +id + ", cell=" + cell +", name="+name);
    	byte[] pdffile = informationService.exportKeyAttributionPdf( getCurrentUserId(),id, cell, name);
		responsePdf(pdffile, response);
	}
    
    @RequestMapping(value = "/getKeyAttributionData")
	public String getKeyAttributionData(String id,String cell,String name,Model model) throws BizException {
		 Long userId = getCurrentUserId();
         logger.info("KeyAttribution [getKeyAttributionData]: id=" +id + ", cell=" + cell +", name="+name);
         monitorLog.info("KeyAttribution [getKeyAttributionData]: id=" +id + ", cell=" + cell +", name="+name);
         if (userId == null || userId <= 0) {
             throw new BizException(GeneralExCode.USER_NOT_LOGIN);
         }
         KeyAttributionForm keyAttributionForm = informationService.getKeyAttributionData(userId,id, cell, name);
	      model.addAttribute("keyAttributionForm", keyAttributionForm);
	      model.addAttribute("id",id);
          model.addAttribute("cell",cell);
          model.addAttribute("name",name);
	      return "/information/getKeyAttributionData";
	}
    @RequestMapping("/indexTelCheck")
    public String indexTelCheck(){  
        return "/information/indexTelCheck";
    }
    @RequestMapping(value = "/exportTelCheckPdf")
	public void exportTelCheckPdf(String id, String cell, String name,HttpServletRequest request,HttpServletResponse response) throws BizException {
        logger.info("TelCheck [exportTelCheckPdf]: id=" +id + ", cell=" + cell +", name="+name);
        monitorLog.info("TelCheck [exportTelCheckPdf]: id=" +id + ", cell=" + cell +", name="+name);
    	byte[] pdffile = informationService.exportTelCheckPdf( getCurrentUserId(),id, cell, name);
		responsePdf(pdffile, response);
	}
    
    @RequestMapping(value = "/getTelCheckData")
	public String getTelCheckData(String id,String cell,String name,Model model) throws BizException {
		 Long userId = getCurrentUserId();
         logger.info("getTelCheckData [getTelCheckData]: id=" +id + ", cell=" + cell +", name="+name);
         monitorLog.info("getTelCheckData [getTelCheckData]: id=" +id + ", cell=" + cell +", name="+name);
         if (userId == null || userId <= 0) {
             throw new BizException(GeneralExCode.USER_NOT_LOGIN);
         }
         TelCheckForm form = informationService.getTelCheckData(userId, id, cell, name);
	      model.addAttribute("telCheckForm", form);
	      model.addAttribute("id",id);
          model.addAttribute("cell",cell);
          model.addAttribute("name",name);
	      return "/information/getTelCheckData";
	}
}
