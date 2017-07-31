package com.crdloo.audit.web.creditEvaluation.service;

import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.web.creditEvaluation.form.TelPeriodForm;
import com.crdloo.audit.web.creditEvaluation.form.TelStatusForm;

public interface CreditEvaluationService {

	public TelPeriodForm getTelPeriodData(Long employeeId, String id,String cell,String name) throws BizException;
	public TelStatusForm getTelStatusData(Long employeeId, String id,String cell,String name) throws BizException;
	public byte[] exportTelPeriodPdf(Long employeeId,String id,String cell,String name) throws BizException;
	public byte[] exportTelStatusPdf(Long employeeId,String id,String cell,String name) throws BizException;
	
}



