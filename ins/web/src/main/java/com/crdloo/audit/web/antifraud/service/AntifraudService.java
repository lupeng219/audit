package com.crdloo.audit.web.antifraud.service;

import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.web.antifraud.form.ApplyLoanMonForm;
import com.crdloo.audit.web.antifraud.form.ApplyLoanStrForm;
import com.crdloo.audit.web.antifraud.form.ExecutionForm;
import com.crdloo.audit.web.antifraud.form.InfoRelationForm;
import com.crdloo.audit.web.antifraud.form.SpecialList_cForm;

public interface AntifraudService {

	public ApplyLoanMonForm getApplyLoanMonData(String id,String cell,String name,String linkman_cell) throws BizException;
	public SpecialList_cForm getSpecialList_cDto(String id,String cell,String name,String linkman_cell) throws BizException;
	public ExecutionForm getExecutionData(String id,String cell,String name) throws BizException;
	public InfoRelationForm getInfoRelationData(String id,String cell,String name) throws BizException;
	public ApplyLoanStrForm getApplyLoanStrData(String id,String cell,String name) throws BizException;
	
	public byte[] exportApplyLoanMonPdf(String id,String cell,String name,String linkman_cell) throws BizException;
	
	public byte[] exportExecutionPdf(String id,String cell,String name) throws BizException;
	
	public byte[] exportSpecialList_cPdf(String id,String cell,String name, String linkman_cell) throws BizException;
	
	public byte[] exportApplyLoanStrPdf(String id,String cell,String name) throws BizException;
	
	public byte[] exportInfoRelationPdf(String id,String cell,String name) throws BizException;
	
}
