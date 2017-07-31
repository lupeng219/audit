package com.crdloo.audit.platform.antifraud.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.crdloo.audit.client.dto.SpecialList_cDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.antifraud.dao.entity.SpecialList_cEntity;
import com.crdloo.audit.platform.antifraud.service.SpecialList_cService;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;
import com.crdloo.audit.platform.common.service.AbstractBfdEntityService;
@Service("com.crdloo.audit.platform.antifraud.service.impl.SpecialList_cServiceImpl")
public class SpecialList_cServiceImpl extends AbstractBfdEntityService<SpecialList_cDto, SpecialList_cEntity> implements SpecialList_cService{

    @Override
    public SpecialList_cDto bfdQuerySpecialList_cDto(Long employeeId, BfdMealTypeEnum mealType,
            String id, String cell, String name, String linkman_cell) throws BizException {
        
        monitorLog.info("SpecialList_cServiceImpl-bfdQuerySpecialList_cDto: [employeeId="+employeeId+",id="+id+", cell="+cell+",name="+name+",linkman_cell="+linkman_cell+"]");
        Map<String,Object> map =  new HashMap<String,Object>();
        map.put("id", id);
        map.put("cell", new String[]{cell});
        map.put("name", name);
        map.put("linkman_cell",linkman_cell);
        return bfdQuery(employeeId, mealType, map);
    }

    
}
