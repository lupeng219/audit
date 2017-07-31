package com.crdloo.audit.web.information.service.impl;

import org.springframework.stereotype.Service;

import com.crdloo.audit.client.dto.BankThreeDto;
import com.crdloo.audit.client.dto.IdTwo_zDto;
import com.crdloo.audit.client.dto.KeyAttributionDto;
import com.crdloo.audit.client.dto.TelCheckDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.web.common.service.BaseService;
import com.crdloo.audit.web.creditEvaluation.enums.TelOperationEnum;
import com.crdloo.audit.web.information.enums.BankThreeFlagEnum;
import com.crdloo.audit.web.information.enums.KeyAttributionFlagEnum;
import com.crdloo.audit.web.information.enums.TelCheckResultEnum;
import com.crdloo.audit.web.information.form.BankThreeForm;
import com.crdloo.audit.web.information.form.IdTwo_zForm;
import com.crdloo.audit.web.information.form.KeyAttributionForm;
import com.crdloo.audit.web.information.form.TelCheckForm;
import com.crdloo.audit.web.information.service.InformationService;
import com.crdloo.audit.web.support.helper.AuditInformationClientHelper;
@Service("informationService")
public class InformationServiceImpl extends BaseService implements InformationService{

    @Override
    public BankThreeForm getBankThreeData(Long employeeId, String id, String name, String bank_id)
            throws BizException {
        BankThreeDto dto =  AuditInformationClientHelper.getBankThreeData(employeeId, id, name, bank_id);
        BankThreeForm form = new BankThreeForm(dto);
        return form;
    }

    @Override
    public IdTwo_zForm getIdTwo_zData(Long employeeId, String id, String name) throws BizException {
        IdTwo_zDto dto = AuditInformationClientHelper.getIdTwo_zData(employeeId, id, name);
        IdTwo_zForm form = new IdTwo_zForm(dto);
        return form;
    }

	@Override
	public KeyAttributionForm getKeyAttributionData(Long employeeId, String id, String cell, String name)
			throws BizException {
		KeyAttributionForm form = new KeyAttributionForm();
		KeyAttributionDto dto = AuditInformationClientHelper.getKeyAttributionData(employeeId, id, cell, name);
		if (dto == null) {
			return form;
		}
		logger.debug("web get KeyAttribution info="+dto);
		form.setId(dto.getId());
		form.setSwift_number(dto.getSwift_number());
		form.setFlag_keyattribution(KeyAttributionFlagEnum.getEnum(dto.getFlag_keyattribution()).getName());
		form.setKa_id_province(dto.getKa_id_province());
		form.setKa_id_city(dto.getKa_id_city());
		form.setKa_cell_province(dto.getKa_cell_province());
		form.setKa_cell_city(dto.getKa_cell_city());
		form.setKa_cell_card_type(dto.getKa_cell_card_type());
		return form;
	}

	@Override
	public TelCheckForm getTelCheckData(Long employeeId, String id, String cell, String name) throws BizException {
		TelCheckForm form = new TelCheckForm();
		TelCheckDto dto = AuditInformationClientHelper.getTelCheckData(employeeId, id, cell, name);
		if (dto == null) {
			return form;
		}
		logger.debug("web get TelCheck info="+dto);
		form.setId(dto.getId());
		form.setSwift_number(dto.getSwift_number());
		form.setFlag_telCheck(BankThreeFlagEnum.getEnum(dto.getFlag_telCheck()).getName());
		form.setOperation(TelOperationEnum.getEnum(dto.getOperation()).getName());
		form.setResult(TelCheckResultEnum.getEnum(dto.getResult()).getName());
		return form;
	}

	@Override
	public byte[] exportKeyAttributionPdf(Long employeeId, String id, String cell, String name) throws BizException {
		String templateName = "keyAttribution.ftl";
		KeyAttributionForm form = getKeyAttributionData(employeeId, id, cell, name);
		 return resultToPdf(templateName, form);
	}

	@Override
	public byte[] exportTelCheckPdf(Long employeeId, String id, String cell, String name) throws BizException {
		String templateName = "telCheck.ftl";
		TelCheckForm form = getTelCheckData(employeeId, id, cell, name);
		return resultToPdf(templateName, form);
	}

    @Override
    public byte[] exportBankThreePdf(Long employeeId, String id, String name, String bank_id)
            throws BizException {
        String templateName = "bankThree.ftl";
        BankThreeForm form = getBankThreeData(employeeId, id, name, bank_id);
        return  resultToPdf(templateName, form);
    }

    @Override
    public byte[] exportidTwo_zPdf(Long employeeId, String id, String name) throws BizException {
        String templateName = "idTwo_z.ftl";
        IdTwo_zForm form = getIdTwo_zData(employeeId, id, name);
        return  resultToPdf(templateName, form);
    }

}
