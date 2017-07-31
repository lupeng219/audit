package com.crdloo.audit.platform.creditEvaluation.service.convertor;

import org.springframework.stereotype.Component;

import com.crdloo.audit.client.dto.TelPeriodDto;
import com.crdloo.audit.framework.common.service.convertor.AbstractConvertor;
import com.crdloo.audit.platform.creditEvaluation.dao.entity.TelPeriodEntity;
import com.crdloo.audit.platform.creditEvaluation.service.vo.TelPeriodVo;
@Component   
public class TelPeriodConvertor extends AbstractConvertor<TelPeriodDto,TelPeriodEntity>{

	@Override
	public TelPeriodEntity vo2Entity(Object vo) {
		TelPeriodVo telPeriodVo =(TelPeriodVo)vo;
		TelPeriodEntity entity =new TelPeriodEntity();
		
		entity.setSwift_number(telPeriodVo.getSwift_number());
		entity.setFlag_telperiod(telPeriodVo.getFlag().getFlag_telperiod());
		entity.setResult(telPeriodVo.getProduct().getResult());
		entity.setOperation(telPeriodVo.getProduct().getOperation());
		entity.setValue(telPeriodVo.getProduct().getData().getValue());
		return entity;
	}

}
