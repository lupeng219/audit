package com.crdloo.audit.web.creditEvaluation.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.web.common.controller.BaseController;
import com.crdloo.audit.web.common.enums.GeneralExCode;
import com.crdloo.audit.web.creditEvaluation.form.TelPeriodForm;
import com.crdloo.audit.web.creditEvaluation.form.TelStatusForm;
import com.crdloo.audit.web.creditEvaluation.service.CreditEvaluationService;

@Controller
@RequestMapping("/creditEvaluation")
public class CreditEvaluationController extends BaseController {
	@Autowired
	private CreditEvaluationService creditEvaluationService;
	@RequestMapping("/indexTelPeriod")
    public String indexTelPeriod(){
        return "/creditEvaluation/indexTelPeriod";
    }
	
	@RequestMapping(value = "/exportTelPeriodPdf")
   	public void exportTelPeriodPdf(String id, String cell, String name,HttpServletRequest request, HttpServletResponse response) throws BizException {
		logger.info("TelPeriod [exportTelPeriodPdf]: id=" +id + ", cell=" + cell +", name="+name);
        monitorLog.info("TelPeriod [exportTelPeriodPdf]: id=" +id + ", cell=" + cell +", name="+name);
       	byte[] pdffile = creditEvaluationService.exportTelPeriodPdf(getCurrentUserId(),id, cell, name);
   		responsePdf(pdffile, response);
   	}
	@RequestMapping(value = "/getTelPeriodData")
	public String getTelPeriodData(String id,String cell,String name,Model model) throws BizException {
		 Long userId = getCurrentUserId();
         logger.info("TelPeriod [getTelPeriodData]: id=" +id + ", cell=" + cell +", name="+name);
         monitorLog.info("TelPeriod [getTelPeriodData]: id=" +id + ", cell=" + cell +", name="+name);
         if (userId == null || userId <= 0) {
             throw new BizException(GeneralExCode.USER_NOT_LOGIN);
         }
        // ("140502198811102244", "13986671110", "王亮")     id, cell, name
         TelPeriodForm telPeriodForm = creditEvaluationService.getTelPeriodData(userId,id, cell, name);
         model.addAttribute("telPeriodForm", telPeriodForm);
         model.addAttribute("id",id);
         model.addAttribute("cell",cell);
         model.addAttribute("name",name);
         return "/creditEvaluation/getTelPeriodData";
	}
	
	@RequestMapping("/indexTelStatus")
    public String indexTelStatus(){
        return "/creditEvaluation/indexTelStatus";
    }
	
	@RequestMapping(value = "/exportTelStatusPdf")
   	public void exportTelStatusPdf(String id, String cell, String name,HttpServletRequest request, HttpServletResponse response) throws BizException {
		logger.info("TelStatus [exportTelStatusPdf]: id=" +id + ", cell=" + cell +", name="+name);
        monitorLog.info("TelStatus [exportTelStatusPdf]: id=" +id + ", cell=" + cell +", name="+name);
       	byte[] pdffile = creditEvaluationService.exportTelStatusPdf(getCurrentUserId(),id, cell, name);
   		responsePdf(pdffile, response);
   	}
	@RequestMapping(value = "/getTelStatusData")
	public String getTelStatusData(String id,String cell,String name,Model model) throws BizException {
		 Long userId = getCurrentUserId();
         logger.info("TelStatus [getTelStatusData]: id=" +id + ", cell=" + cell +", name="+name);
         monitorLog.info("TelStatus [getTelStatusData]: id=" +id + ", cell=" + cell +", name="+name);
         if (userId == null || userId <= 0) {
             throw new BizException(GeneralExCode.USER_NOT_LOGIN);
         }
         TelStatusForm telStatusForm = creditEvaluationService.getTelStatusData(userId, id, cell, name);
	      model.addAttribute("telStatusForm", telStatusForm);
	      model.addAttribute("id",id);
	      model.addAttribute("cell",cell);
	      model.addAttribute("name",name);
	      return "/creditEvaluation/getTelStatusData";
	}
	
	
	
}
