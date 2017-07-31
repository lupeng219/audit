package com.crdloo.audit.platform.creditEvaluation.service;

import com.crdloo.audit.client.dto.TelPeriodDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;

public interface TelPeriodService {
	public TelPeriodDto bfdQueryTelPeriodDto(Long employeeId, BfdMealTypeEnum mealType,String id,String cell,String name) throws BizException;
}
