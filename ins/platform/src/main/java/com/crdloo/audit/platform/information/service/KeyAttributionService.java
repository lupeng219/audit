package com.crdloo.audit.platform.information.service;

import com.crdloo.audit.client.dto.KeyAttributionDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;

public interface KeyAttributionService {
	public KeyAttributionDto bfdQueryKeyAttributionDto(Long employeeId, BfdMealTypeEnum mealType,String id,String cell,String name) throws BizException;
}
