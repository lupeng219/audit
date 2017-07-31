package com.crdloo.audit.platform.information.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.crdloo.audit.client.dto.TelCheckDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;
import com.crdloo.audit.platform.common.service.AbstractBfdEntityService;
import com.crdloo.audit.platform.information.dao.entity.TelCheckEntity;
import com.crdloo.audit.platform.information.service.TelCheckService;
import com.crdloo.audit.platform.information.service.vo.TelCheckVo;

@Service("com.crdloo.audit.platform.information.service.impl.TelCheckServiceImpl")
public class TelCheckServiceImpl extends AbstractBfdEntityService<TelCheckDto,TelCheckEntity> implements TelCheckService{

	@Override
	public TelCheckDto bfdQueryTelCheckDto(Long employeeId, BfdMealTypeEnum mealType, String id, String cell,
			String name) throws BizException {
		monitorLog.info("TelCheckServiceImpl-bfdQueryTelCheckDto: [employeeId="+employeeId+",id="+id+", cell="+cell+",name="+name+"]");
        Map<String,Object> map =  new HashMap<String,Object>();
        map.put("id", id);
        map.put("cell", cell);
        map.put("name", name);
        return bfdQuery(employeeId, mealType, map,TelCheckVo.class);
	}

}
