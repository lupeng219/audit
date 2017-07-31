package com.crdloo.audit.platform.rule.service;


import com.crdloo.audit.client.dto.RuleDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;

public interface RuleService {

    public RuleDto bfdQueryRuleDto(Long employeeId, BfdMealTypeEnum mealType,String id,String cell,String name) throws BizException;
}
