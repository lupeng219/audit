package com.crdloo.audit.platform.information.service;

import com.crdloo.audit.client.dto.TelCheckDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;

public interface TelCheckService {
	public TelCheckDto bfdQueryTelCheckDto(Long employeeId, BfdMealTypeEnum mealType,String id,String cell,String name) throws BizException;
}
