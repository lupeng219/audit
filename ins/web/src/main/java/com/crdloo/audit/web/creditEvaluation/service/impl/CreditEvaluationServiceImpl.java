package com.crdloo.audit.web.creditEvaluation.service.impl;

import org.springframework.stereotype.Service;

import com.crdloo.audit.client.dto.TelPeriodDto;
import com.crdloo.audit.client.dto.TelStatusDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.web.antifraud.form.ExecutionForm;
import com.crdloo.audit.web.common.service.BaseService;
import com.crdloo.audit.web.creditEvaluation.enums.TelFlagEnum;
import com.crdloo.audit.web.creditEvaluation.enums.TelOperationEnum;
import com.crdloo.audit.web.creditEvaluation.enums.TelPerValueEnum;
import com.crdloo.audit.web.creditEvaluation.enums.TelResultEnum;
import com.crdloo.audit.web.creditEvaluation.enums.TelStuValueEnum;
import com.crdloo.audit.web.creditEvaluation.form.TelPeriodForm;
import com.crdloo.audit.web.creditEvaluation.form.TelStatusForm;
import com.crdloo.audit.web.creditEvaluation.service.CreditEvaluationService;
import com.crdloo.audit.web.support.helper.AuditCreditEvaluationClientHelper;
@Service("creditEvaluationService")
public class CreditEvaluationServiceImpl extends BaseService implements CreditEvaluationService{

	@Override
	public TelPeriodForm getTelPeriodData(Long employeeId, String id, String cell, String name) throws BizException {
		TelPeriodForm form = new TelPeriodForm();
		TelPeriodDto dto = AuditCreditEvaluationClientHelper.getTelPeriodData(employeeId, id, cell, name);
		if (dto == null) {
			return form;
		}
		logger.debug("web get TelPeriod info="+dto);
		//转换为form
		form.setId(dto.getId());
		form.setSwift_number(dto.getSwift_number());
		form.setFlag_telperiod(TelFlagEnum.getEnum(dto.getFlag_telperiod()).getName());
		form.setResult(TelResultEnum.getEnum(dto.getResult()).getName());
		form.setOperation(TelOperationEnum.getEnum(dto.getOperation()).getName());
		form.setValue(TelPerValueEnum.getEnum(dto.getValue()).getName());
		
		return form;
	}

	@Override
	public TelStatusForm getTelStatusData(Long employeeId, String id, String cell, String name) throws BizException {
		TelStatusForm form = new TelStatusForm();
		TelStatusDto dto = AuditCreditEvaluationClientHelper.getTelStatusData(employeeId, id, cell, name);
		if (dto == null) {
			return form;
		}
		logger.debug("web get TelStatus info="+dto);
		//转换为form
		form.setId(dto.getId());
		form.setSwift_number(dto.getSwift_number());
		form.setFlag_telstatus(TelFlagEnum.getEnum(dto.getFlag_telstatus()).getName());
		form.setResult(TelResultEnum.getEnum(dto.getResult()).getName());
		form.setOperation(TelOperationEnum.getEnum(dto.getOperation()).getName());
		form.setValue(TelStuValueEnum.getEnum(dto.getValue()).getName());
		return form;
	}

	@Override
	public byte[] exportTelPeriodPdf(Long employeeId,String id, String cell, String name) throws BizException {
		String templateName = "telPeriod.ftl";
		TelPeriodForm form = getTelPeriodData(employeeId, id, cell, name);
		return resultToPdf(templateName, form);
	}

	@Override
	public byte[] exportTelStatusPdf(Long employeeId, String id, String cell, String name) throws BizException {
		String templateName = "telStatus.ftl";
		TelStatusForm form = getTelStatusData(employeeId, id, cell, name);
		return resultToPdf(templateName, form);
	}

}
