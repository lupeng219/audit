package com.crdloo.audit.platform.antifraud.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.crdloo.audit.client.dto.ApplyLoanStrDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.antifraud.dao.entity.ApplyLoanStrEntity;
import com.crdloo.audit.platform.antifraud.service.ApplyLoanStrService;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;
import com.crdloo.audit.platform.common.service.AbstractBfdEntityService;
@Service("com.crdloo.audit.platform.antifraud.service.impl.ApplyLoanStrServiceImpl")
public class ApplyLoanStrServiceImpl  extends AbstractBfdEntityService<ApplyLoanStrDto,ApplyLoanStrEntity> implements ApplyLoanStrService{

    @Override
    public ApplyLoanStrDto bfdQueryApplyLoanStrDto(Long employeeId, BfdMealTypeEnum mealType,
            String id, String cell, String name) throws BizException {
        monitorLog.info("ApplyLoanStrServiceImpl-bfdQueryApplyLoanStrDto: [employeeId="+employeeId+",id="+id+", cell="+cell+",name="+name+"]");
        Map<String,Object> map =  new HashMap<String,Object>();
        map.put("id", id);
        map.put("cell", new String[]{cell});
        map.put("name", name);
        return bfdQuery(employeeId, mealType, map);
    }

}
