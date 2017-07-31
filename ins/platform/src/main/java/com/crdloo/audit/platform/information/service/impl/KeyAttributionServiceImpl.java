package com.crdloo.audit.platform.information.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.crdloo.audit.client.dto.KeyAttributionDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;
import com.crdloo.audit.platform.common.service.AbstractBfdEntityService;
import com.crdloo.audit.platform.information.dao.entity.KeyAttributionEntity;
import com.crdloo.audit.platform.information.service.KeyAttributionService;

@Service("com.crdloo.audit.platform.information.service.impl.KeyAttributionServiceImpl")
public class KeyAttributionServiceImpl extends AbstractBfdEntityService<KeyAttributionDto,KeyAttributionEntity> implements KeyAttributionService{

	@Override
	public KeyAttributionDto bfdQueryKeyAttributionDto(Long employeeId, BfdMealTypeEnum mealType, String id, String cell,
			String name) throws BizException {
		monitorLog.info("KeyAttributionServiceImpl-bfdQueryKeyAttributionDto: [employeeId="+employeeId+",id="+id+", cell="+cell+",name="+name+"]");
        Map<String,Object> map =  new HashMap<String,Object>();
        map.put("id", id);
        map.put("cell", new String[]{cell});
        map.put("name", name);
        return bfdQuery(employeeId, mealType, map);
	}

}
