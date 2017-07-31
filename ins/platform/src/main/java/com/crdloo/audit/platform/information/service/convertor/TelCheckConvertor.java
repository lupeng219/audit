package com.crdloo.audit.platform.information.service.convertor;

import org.springframework.stereotype.Component;

import com.crdloo.audit.client.dto.TelCheckDto;
import com.crdloo.audit.framework.common.service.convertor.AbstractConvertor;
import com.crdloo.audit.platform.information.dao.entity.TelCheckEntity;
import com.crdloo.audit.platform.information.service.vo.TelCheckVo;
@Component   
public class TelCheckConvertor extends AbstractConvertor<TelCheckDto,TelCheckEntity>{

	public TelCheckEntity vo2Entity(Object vo) {
		TelCheckVo telVo = (TelCheckVo)vo;
		TelCheckEntity entity = new TelCheckEntity();
		entity.setSwift_number(telVo.getSwift_number());
		entity.setFlag_telCheck(telVo.getFlag().getFlag_telCheck());
		entity.setResult(telVo.getProduct().getResult());
		entity.setOperation(telVo.getProduct().getOperation());
		return entity;
	}

}
