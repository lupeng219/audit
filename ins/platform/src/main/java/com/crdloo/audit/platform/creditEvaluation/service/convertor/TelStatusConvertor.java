package com.crdloo.audit.platform.creditEvaluation.service.convertor;

import org.springframework.stereotype.Component;

import com.crdloo.audit.client.dto.TelStatusDto;
import com.crdloo.audit.framework.common.service.convertor.AbstractConvertor;
import com.crdloo.audit.platform.creditEvaluation.dao.entity.TelStatusEntity;
import com.crdloo.audit.platform.creditEvaluation.service.vo.TelStatusVo;
@Component   
public class TelStatusConvertor extends AbstractConvertor<TelStatusDto,TelStatusEntity>{

	public TelStatusEntity vo2Entity(Object vo) {
		TelStatusVo telVo = (TelStatusVo)vo;
		TelStatusEntity entity = new TelStatusEntity();
		
		entity.setSwift_number(telVo.getSwift_number());
		entity.setFlag_telstatus(telVo.getFlag().getFlag_telstatus());
		entity.setResult(telVo.getProduct().getResult());
		entity.setOperation(telVo.getProduct().getOperation());
		entity.setValue(telVo.getProduct().getData().getValue());
		return entity;
	}

}
