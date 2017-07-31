package com.crdloo.audit.web.rule.service;

import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.web.rule.form.RuleForm;

public interface RuleService {

    public RuleForm getRuleData(Long employeeId, String id,String cell,String name) throws BizException;

    public byte[] exportRulePdf(Long employeeId, String id,String cell,String name) throws BizException;
}
