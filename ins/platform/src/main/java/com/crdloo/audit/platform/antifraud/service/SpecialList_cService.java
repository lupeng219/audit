package com.crdloo.audit.platform.antifraud.service;

import com.crdloo.audit.client.dto.SpecialList_cDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;

public interface SpecialList_cService {

    public SpecialList_cDto bfdQuerySpecialList_cDto(Long employeeId, BfdMealTypeEnum mealType,String id,String cell,String name,String linkman_cell) throws BizException;
}
