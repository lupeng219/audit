package com.crdloo.audit.platform.antifraud.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.crdloo.audit.client.dto.ExecutionDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.antifraud.dao.entity.ExecutionEntity;
import com.crdloo.audit.platform.antifraud.service.ExecutionService;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;
import com.crdloo.audit.platform.common.service.AbstractBfdEntityService;

@Service("com.crdloo.audit.platform.antifraud.service.impl.ExecutionServiceImpl")
public class ExecutionServiceImpl extends AbstractBfdEntityService<ExecutionDto,ExecutionEntity> implements ExecutionService{

	@Override
	public ExecutionDto bfdQueryExecutionDto(Long employeeId, BfdMealTypeEnum mealType, String id, String cell,
			String name) throws BizException {
		monitorLog.info("ExecutionServiceImpl-bfdQueryExecutionDto: [employeeId="+employeeId+",id="+id+", cell="+cell+",name="+name+"]");
        Map<String,Object> map =  new HashMap<String,Object>();
        map.put("id", id);
        map.put("cell", new String[]{cell});
        map.put("name", name);
        return bfdQuery(employeeId, mealType, map);
	}

}
