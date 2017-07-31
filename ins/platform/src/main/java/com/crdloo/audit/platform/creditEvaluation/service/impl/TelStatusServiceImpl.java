package com.crdloo.audit.platform.creditEvaluation.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.crdloo.audit.client.dto.TelStatusDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;
import com.crdloo.audit.platform.common.service.AbstractBfdEntityService;
import com.crdloo.audit.platform.creditEvaluation.dao.entity.TelStatusEntity;
import com.crdloo.audit.platform.creditEvaluation.service.TelStatusService;
import com.crdloo.audit.platform.creditEvaluation.service.vo.TelStatusVo;

@Service("com.crdloo.audit.platform.creditEvaluation.service.impl.TelStatusServiceImpl")
public class TelStatusServiceImpl extends AbstractBfdEntityService<TelStatusDto,TelStatusEntity> implements TelStatusService{

	@Override
	public TelStatusDto bfdQueryTelStatusDto(Long employeeId, BfdMealTypeEnum mealType, String id, String cell,
			String name) throws BizException {
		monitorLog.info("TelStatusServiceImpl-bfdQueryTelStatusDto: [employeeId="+employeeId+",id="+id+", cell="+cell+",name="+name+"]");
        Map<String,Object> map =  new HashMap<String,Object>();
        map.put("id", id);
        map.put("cell",cell);
        map.put("name", name);
        return bfdQuery(employeeId, mealType, map,TelStatusVo.class);
	}

}
