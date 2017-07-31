package com.crdloo.audit.web.rule.service.impl;


import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import com.crdloo.audit.client.dto.RuleDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.web.common.enums.ExampleExCode;
import com.crdloo.audit.web.common.service.BaseService;
import com.crdloo.audit.web.rule.form.RuleForm;
import com.crdloo.audit.web.rule.service.RuleService;
import com.crdloo.audit.web.support.helper.AuditRuleClientHelper;
@Service("ruleService")
public class RuleServiceImpl extends BaseService implements RuleService{

    @Override
    public RuleForm getRuleData(Long employeeId, String id,String cell,String name) throws BizException {
        RuleDto dto = AuditRuleClientHelper.getRuleData(employeeId, id,cell,name);
        RuleForm form = new RuleForm();
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
    public byte[] exportRulePdf(Long employeeId, String id, String cell, String name)
            throws BizException {
        String templateName = "rule.ftl";
        RuleForm form = getRuleData(employeeId, id, cell, name);
        return resultToPdf(templateName, form);
    }

}
