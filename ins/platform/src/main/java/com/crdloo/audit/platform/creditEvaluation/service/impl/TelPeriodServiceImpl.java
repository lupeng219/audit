package com.crdloo.audit.platform.creditEvaluation.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.crdloo.audit.client.dto.TelPeriodDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;
import com.crdloo.audit.platform.common.service.AbstractBfdEntityService;
import com.crdloo.audit.platform.creditEvaluation.dao.entity.TelPeriodEntity;
import com.crdloo.audit.platform.creditEvaluation.service.TelPeriodService;
import com.crdloo.audit.platform.creditEvaluation.service.vo.TelPeriodVo;


@Service("com.crdloo.audit.platform.creditEvaluation.service.impl.TelPeriodServiceImpl")
public class TelPeriodServiceImpl extends AbstractBfdEntityService<TelPeriodDto,TelPeriodEntity> implements TelPeriodService{

	@Override
	public TelPeriodDto bfdQueryTelPeriodDto(Long employeeId, BfdMealTypeEnum mealType, String id, String cell,
			String name) throws BizException {
		monitorLog.info("TelPeriodServiceImpl-bfdQueryTelPeriodDto: [employeeId="+employeeId+",id="+id+", cell="+cell+",name="+name+"]");
        Map<String,Object> map =  new HashMap<String,Object>();
        map.put("id", id);
        map.put("cell", cell);
        map.put("name", name);
        return bfdQuery(employeeId, mealType, map,TelPeriodVo.class);
	}

}
