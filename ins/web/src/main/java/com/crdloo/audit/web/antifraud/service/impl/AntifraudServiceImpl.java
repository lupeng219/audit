package com.crdloo.audit.web.antifraud.service.impl;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import com.crdloo.audit.client.dto.ApplyLoanMonDto;
import com.crdloo.audit.client.dto.ApplyLoanStrDto;
import com.crdloo.audit.client.dto.ExecutionDto;
import com.crdloo.audit.client.dto.InfoRelationDto;
import com.crdloo.audit.client.dto.SpecialList_cDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.web.antifraud.form.ApplyLoanMonForm;
import com.crdloo.audit.web.antifraud.form.ApplyLoanStrForm;
import com.crdloo.audit.web.antifraud.form.ExecutionForm;
import com.crdloo.audit.web.antifraud.form.InfoRelationForm;
import com.crdloo.audit.web.antifraud.form.SpecialList_cForm;
import com.crdloo.audit.web.antifraud.service.AntifraudService;
import com.crdloo.audit.web.common.enums.ExampleExCode;
import com.crdloo.audit.web.common.service.BaseService;
import com.crdloo.audit.web.support.helper.AuditAntifraudClientHelper;
@Service("antifraudService")
public class AntifraudServiceImpl  extends BaseService implements AntifraudService{

    @Override
    public SpecialList_cForm getSpecialList_cDto(String id, String cell, String name,
            String linkman_cell) throws BizException {
        SpecialList_cDto dto = AuditAntifraudClientHelper.getSpecialList_cData(id, cell, name, linkman_cell);
        SpecialList_cForm form = new SpecialList_cForm();
        if (dto != null) {
            try {
                BeanUtils.copyProperties(form, dto);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new BizException(ExampleExCode.CONVERT_FORM_ERR);
            }
        }
        return form;
    }
	@Override
	public ApplyLoanMonForm getApplyLoanMonData(String id, String cell, String name, String linkman_cell)
			throws BizException {
		ApplyLoanMonForm form = new ApplyLoanMonForm();
		ApplyLoanMonDto dto = AuditAntifraudClientHelper.getApplyLoanMonData(id, cell, name, linkman_cell);
		if (dto == null) {
			return form;
		}
		logger.debug("web get ApplyLoanMon info="+dto);
		try {
			BeanUtils.copyProperties(form, dto);
		} catch (Exception e) {
			throw new BizException(ExampleExCode.CONVERT_FORM_ERR);
		}
			
		return form;
	}

	@Override
	public ExecutionForm getExecutionData(String id, String cell, String name) throws BizException {
		ExecutionForm form = new ExecutionForm();
		ExecutionDto dto = AuditAntifraudClientHelper.getExecutionData(id, cell, name);
		if (dto == null) {
			return form;
		}
		logger.debug("web get Execution info="+dto);
		try {
			BeanUtils.copyProperties(form, dto);
		} catch (Exception e) {
			throw new BizException(ExampleExCode.CONVERT_FORM_ERR);
		}
		return form;
	}

	@Override
	public InfoRelationForm getInfoRelationData(String id, String cell, String name) throws BizException {
		InfoRelationForm form = new InfoRelationForm();
		InfoRelationDto dto = AuditAntifraudClientHelper.getInfoRelationData(id, cell, name);
		if (dto == null) {
			return form;
		}
		logger.debug("web get InfoRelation info="+dto);
		try {
			BeanUtils.copyProperties(form, dto);
		} catch (Exception e) {
			throw new BizException(ExampleExCode.CONVERT_FORM_ERR);
		}
		return form;
	}
    @Override
    public ApplyLoanStrForm getApplyLoanStrData(String id, String cell, String name)
            throws BizException {
        ApplyLoanStrDto dto = AuditAntifraudClientHelper.getApplyLoanStrData(id, cell, name);
        ApplyLoanStrForm form = new ApplyLoanStrForm();
        if (dto != null) {
            try {
                BeanUtils.copyProperties(form, dto);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new BizException(ExampleExCode.CONVERT_FORM_ERR);
            }
        }
        return form;
    }
	@Override
	public byte[] exportApplyLoanMonPdf(String id, String cell, String name, String linkman_cell) throws BizException {
		String templateName = "applyLoanMon.ftl";
		ApplyLoanMonForm form = getApplyLoanMonData(id, cell, name, linkman_cell);
        return resultToPdf(templateName, form);
	}
	@Override
	public byte[] exportExecutionPdf(String id, String cell, String name) throws BizException {
		String templateName = "execution.ftl";
		ExecutionForm form = getExecutionData(id, cell, name);
		return resultToPdf(templateName, form);
	}
    @Override
    public byte[] exportSpecialList_cPdf(String id, String cell, String name, String linkman_cell)
            throws BizException {
        String templateName = "specialList_c.ftl";
        SpecialList_cForm form = getSpecialList_cDto(id, cell, name, linkman_cell);
        return resultToPdf(templateName, form);
    }
    @Override
    public byte[] exportApplyLoanStrPdf(String id, String cell, String name) throws BizException {
        String templateName = "applyLoanStr.ftl";
        ApplyLoanStrForm form = getApplyLoanStrData(id, cell, name);
        return resultToPdf(templateName, form);
    }
    @Override
    public byte[] exportInfoRelationPdf(String id, String cell, String name) throws BizException {
        String templateName = "infoRelation.ftl";
        InfoRelationForm form = getInfoRelationData(id, cell, name);
        return resultToPdf(templateName, form);
    }
    
}

