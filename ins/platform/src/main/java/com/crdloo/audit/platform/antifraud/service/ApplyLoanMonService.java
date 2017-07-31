package com.crdloo.audit.platform.antifraud.service;

import com.crdloo.audit.client.dto.ApplyLoanMonDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;

public interface ApplyLoanMonService {
	public ApplyLoanMonDto bfdQueryApplyLoanMonDto(Long employeeId, BfdMealTypeEnum mealType,String id,String cell,String name,String linkman_cell) throws BizException;
}
