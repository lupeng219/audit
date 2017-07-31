package com.crdloo.audit.platform.antifraud.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.crdloo.audit.client.dto.ApplyLoanMonDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.antifraud.dao.entity.ApplyLoanMonEntity;
import com.crdloo.audit.platform.antifraud.service.ApplyLoanMonService;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;
import com.crdloo.audit.platform.common.service.AbstractBfdEntityService;

@Service("com.crdloo.audit.platform.antifraud.service.impl.ApplyLoanMonServiceImpl")
public class ApplyLoanMonServiceImpl extends AbstractBfdEntityService<ApplyLoanMonDto,ApplyLoanMonEntity> implements ApplyLoanMonService{

	@Override
	public ApplyLoanMonDto bfdQueryApplyLoanMonDto(Long employeeId, BfdMealTypeEnum mealType, String id, String cell,
			String name,String linkman_cell) throws BizException {
		monitorLog.info("ApplyLoanMonServiceImpl-bfdQueryApplyLoanMonDto: [employeeId="+employeeId+",id="+id+", cell="+cell+",name="+name+"]");
        Map<String,Object> map =  new HashMap<String,Object>();
        map.put("id", id);
        map.put("cell", new String[]{cell});
        map.put("name", name);
        map.put("linkman_cell", new String[]{linkman_cell});
        return bfdQuery(employeeId, mealType, map);
	}

}
