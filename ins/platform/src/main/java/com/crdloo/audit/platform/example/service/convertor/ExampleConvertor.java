package com.crdloo.audit.platform.example.service.convertor;

import org.springframework.stereotype.Component;

import com.crdloo.audit.client.dto.ExampleDto;
import com.crdloo.audit.framework.common.service.convertor.AbstractConvertor;
import com.crdloo.audit.platform.example.dao.entity.ExampleEntity;

@Component
public class ExampleConvertor extends AbstractConvertor<ExampleDto, ExampleEntity> {

	@Override
	public ExampleDto entity2Dto(ExampleEntity entity) {
		if (entity == null) {
			return null;
		}
		ExampleDto dto = new ExampleDto();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setCreated(entity.getCreated());
		return dto;
	}

	@Override
	public ExampleEntity dto2Entity(ExampleDto dto) {
		if (dto == null) {
			return null;
		}
		ExampleEntity entity = new ExampleEntity();
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		return entity;
	}

}
