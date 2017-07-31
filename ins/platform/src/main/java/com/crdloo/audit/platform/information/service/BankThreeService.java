package com.crdloo.audit.platform.information.service;

import com.crdloo.audit.client.dto.BankThreeDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;

public interface BankThreeService {
    /**
     * 银行卡三要素验证
     * @param id 身份证
     * @param name 姓名
     * @param bank_id 银行卡
     * @return
     * @throws BizException
     */
    public BankThreeDto bfdQueryBankThreeData(Long employeeId,BfdMealTypeEnum mealType,String id, String name,String bank_id) throws BizException;
}
