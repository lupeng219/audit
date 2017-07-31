package com.crdloo.audit.web.information.service;


import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.web.information.form.BankThreeForm;
import com.crdloo.audit.web.information.form.IdTwo_zForm;
import com.crdloo.audit.web.information.form.KeyAttributionForm;
import com.crdloo.audit.web.information.form.TelCheckForm;

public interface InformationService {

    public BankThreeForm getBankThreeData(Long employeeId,String id, String name,String bank_id) throws BizException;

    public IdTwo_zForm getIdTwo_zData(Long employeeId,String id, String name) throws BizException;

    public KeyAttributionForm getKeyAttributionData(Long employeeId, String id,String cell,String name) throws BizException;
    
    public TelCheckForm getTelCheckData(Long employeeId, String id,String cell,String name) throws BizException;
    public byte[] exportKeyAttributionPdf(Long employeeId,String id,String cell,String name) throws BizException;
    public byte[] exportTelCheckPdf(Long employeeId,String id,String cell,String name) throws BizException;
    public byte[] exportBankThreePdf(Long employeeId,String id,String name,String bank_id) throws BizException;
    public byte[] exportidTwo_zPdf(Long employeeId,String id,String name) throws BizException;
    
}
