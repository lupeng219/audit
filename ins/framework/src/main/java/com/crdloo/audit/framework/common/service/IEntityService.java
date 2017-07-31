package com.crdloo.audit.framework.common.service;

import java.util.List;
import java.util.Map;

import com.crdloo.audit.framework.client.IDto;
import com.crdloo.audit.framework.client.PageResults;
import com.crdloo.audit.framework.common.dao.entity.IEntity;

public interface IEntityService<D extends IDto, E extends IEntity> {

	public E insert(E entity);
	
	public List<E> insertBatch(List<E> entities);
	
	public E update(E entity);
	
	public List<E> updateBatch(List<E> entities);
	
	public void deleteByPK(Long id);
	
	public void delete(E entity);

    public void deleteBatchByPKs(List<Long> ids);
    
    public void deleteBatch(List<E> entities);
    
    public E selectByPK(Long id);
    
    public List<E> selectEntitiesByPKs(List<Long> ids);
    
    public List<E> selectList(String hql);
    
    public List<E> selectList(String hql, int pageNo, int pageSize);
    
    public List<E> selectList(String hql, Map<String, Object> params);
    
    public List<E> selectList(String hql, Map<String, Object> params, int pageNo, int pageSize);
    
    public long selectRowCount(String hql);
    
    public long selectRowCount(String hql, Map<String, Object> params);
    
    public E save(E entity);
	
    /** ------ 以下方法提供直接返回Dto ------ **/
	
    public D insertDto(D dto);
    
    public D updateDto(D dto);
    
    public void deleteDto(D dto);
    
    public D getDtoById(Long id);
    
    public List<D> listDtos(List<Long> ids);
    
    public List<D> listDtos(String hql, Map<String, Object> params);
    
    public List<D> listDtos(String hql, Map<String, Object> params, int pageNo, int pageSize);
    
    public D save(D dto);
    
    public PageResults<D> listPage(String hql, Map<String, Object> params, int pageNo, int pageSize);
    
    public PageResults<D> listPage(String hql, String countHql, Map<String, Object> params, int pageNo, int pageSize);
	
}
