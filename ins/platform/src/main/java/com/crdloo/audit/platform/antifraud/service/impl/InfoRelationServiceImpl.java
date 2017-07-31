package com.crdloo.audit.platform.antifraud.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.crdloo.audit.client.dto.InfoRelationDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.antifraud.dao.entity.InfoRelationEntity;
import com.crdloo.audit.platform.antifraud.service.InfoRelationService;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;
import com.crdloo.audit.platform.common.service.AbstractBfdEntityService;

@Service("com.crdloo.audit.platform.antifraud.service.impl.InfoRelationServiceImpl")
public class InfoRelationServiceImpl extends AbstractBfdEntityService<InfoRelationDto,InfoRelationEntity> implements InfoRelationService{

	@Override
	public InfoRelationDto bfdQueryInfoRelationDto(Long employeeId, BfdMealTypeEnum mealType, String id, String cell,
			String name) throws BizException {
		monitorLog.info("InfoRelationServiceImpl-bfdQueryInfoRelationDto: [employeeId="+employeeId+",id="+id+", cell="+cell+",name="+name+"]");
        Map<String,Object> map =  new HashMap<String,Object>();
        map.put("id", id);
        map.put("cell", new String[]{cell});
        map.put("name", name);
        return bfdQuery(employeeId, mealType, map);
	}

}
