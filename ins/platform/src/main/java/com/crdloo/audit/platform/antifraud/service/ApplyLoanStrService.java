package com.crdloo.audit.platform.antifraud.service;

import com.crdloo.audit.client.dto.ApplyLoanStrDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;

public interface ApplyLoanStrService {

    public ApplyLoanStrDto bfdQueryApplyLoanStrDto(Long employeeId, BfdMealTypeEnum mealType,String id,String cell,String name) throws BizException;
}
