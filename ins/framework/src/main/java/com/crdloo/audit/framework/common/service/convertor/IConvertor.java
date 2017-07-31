package com.crdloo.audit.framework.common.service.convertor;

import java.util.List;

import com.crdloo.audit.framework.client.IDto;
import com.crdloo.audit.framework.common.dao.entity.IEntity;

public interface IConvertor<D extends IDto, E extends IEntity> {

	public D entity2Dto(E entity);
	
	public E dto2Entity(D dto);
	
	public List<D> entity2DtoList(List<E> entities);
	
	public List<E> dto2EntityList(List<D> dtos);
	
	public E vo2Entity(Object vo);
	
}
