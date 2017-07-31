package com.crdloo.audit.platform.information.service;

import com.crdloo.audit.client.dto.IdTwo_zDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;

public interface IdTwo_zService {
    /**
     * 身份证二要素验证
     * @param employeeId
     * @param mealType
     * @param id
     * @param name
     * @return
     * @throws BizException
     */
    public IdTwo_zDto bfdQueryIdTwo_zData(Long employeeId,BfdMealTypeEnum mealType,String id, String name) throws BizException;
}
