package com.crdloo.audit.framework.common.service;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.crdloo.audit.framework.client.IDto;
import com.crdloo.audit.framework.client.PageResults;
import com.crdloo.audit.framework.common.dao.IEntityDao;
import com.crdloo.audit.framework.common.dao.entity.IEntity;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.framework.common.exception.SystemMessageCode;
import com.crdloo.audit.framework.common.service.convertor.IConvertor;
import com.crdloo.audit.framework.router.utils.MonitorLogger;
import com.crdloo.audit.framework.router.utils.SpringContextUtil;
import com.crdloo.audit.framework.router.utils.StringUtil;
import com.google.common.collect.Lists;

public abstract class AbstractEntityService<D extends IDto, E extends IEntity> {

	protected final Logger logger = Logger.getLogger(getClass());

	protected final MonitorLogger monitorLog = MonitorLogger.getInstance();

	protected IEntityDao<E> dao;
	protected IConvertor<D, E> convertor;
	protected Class<D> dtoClazz;
	protected Class<E> entityClazz;
	protected String entityName;

	@SuppressWarnings("unchecked")
	public AbstractEntityService() {
		Type genericSuperclass = getClass().getGenericSuperclass();
		if (genericSuperclass instanceof ParameterizedType) {
			ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
			this.dtoClazz = (Class<D>) pt.getActualTypeArguments()[0];
			this.entityClazz = (Class<E>) pt.getActualTypeArguments()[1];
			this.entityName = entityClazz.getSimpleName();
			String _entityName = StringUtil.lowercaseFirstLetter(entityName.replace("Entity", ""));
			this.dao = SpringContextUtil.getBean(_entityName + "DaoImpl", IEntityDao.class);
			try {
				int idx = getClass().getName().indexOf("impl.");
				String fullPath = getClass().getName().substring(0, idx)+ "convertor." + entityName.replace("Entity", "") + "Convertor";
				Class.forName(fullPath);
				this.convertor = SpringContextUtil.getBean(_entityName + "Convertor", IConvertor.class);
			} catch (ClassNotFoundException e) {
				this.convertor = null;
			}
		}
	}
	
	public E insert(E entity) {
		return dao.insert(entity);
	}

	public List<E> insertBatch(List<E> entities) {
		return dao.insertBatch(entities);
	}

	public E update(E entity) {
		return dao.update(entity);
	}

	public List<E> updateBatch(List<E> entities) {
		return dao.updateBatch(entities);
	}

	public void deleteByPK(Long id) {
		dao.deleteByPK(id);
	}

	public void delete(E entity) {
		dao.delete(entity);
	}

	public void deleteBatchByPKs(List<Long> ids) {
		dao.deleteBatchByPKs(ids);
	}

	public void deleteBatch(List<E> entities) {
		dao.deleteBatch(entities);
	}

	public E selectByPK(Long id) {
		return dao.selectByPK(id);
	}

	public List<E> selectEntitiesByPKs(List<Long> ids) {
		return dao.selectEntitiesByPKs(ids);
	}

	public List<E> selectList(String hql) {
		return dao.selectList(hql);
	}

	public List<E> selectList(String hql, int pageNo, int pageSize) {
		return dao.selectList(hql, pageNo, pageSize);
	}

	public List<E> selectList(String hql, Map<String, Object> params) {
		return dao.selectList(hql, params);
	}

	public List<E> selectList(String hql, Map<String, Object> params, int pageNo, int pageSize) {
		return dao.selectList(hql, params, pageNo, pageSize);
	}

	public long selectRowCount(String hql) {
		return dao.selectRowCount(hql);
	}

	public long selectRowCount(String hql, Map<String, Object> params) {
		return dao.selectRowCount(hql, params);
	}

	public E save(E entity) {
		return dao.save(entity);
	}

	/** ------ 以下方法提供直接返回Dto ------ **/

	public D insertDto(D dto) throws BizException {
		if(convertor==null){
			throw new BizException(SystemMessageCode.BIZ_00001);
		}
		E entity = convertor.dto2Entity(dto);
		entity = insert(entity);
		return convertor.entity2Dto(entity);
	}

	public D updateDto(D dto) throws BizException {
		if(convertor==null){
			throw new BizException(SystemMessageCode.BIZ_00001);
		}
		E entity = convertor.dto2Entity(dto);
		entity = update(entity);
		return convertor.entity2Dto(entity);
	}

	public void deleteDto(D dto) throws BizException {
		if(convertor==null){
			throw new BizException(SystemMessageCode.BIZ_00001);
		}
		E entity = convertor.dto2Entity(dto);
		delete(entity);
	}

	public D getDtoById(Long id) throws BizException {
		if(convertor==null){
			throw new BizException(SystemMessageCode.BIZ_00001);
		}
		E entity = selectByPK(id);
		return convertor.entity2Dto(entity);
	}

	public List<D> listDtos(List<Long> ids) throws BizException {
		if(convertor==null){
			throw new BizException(SystemMessageCode.BIZ_00001);
		}
		List<E> entitieList = selectEntitiesByPKs(ids);
		if (CollectionUtils.isEmpty(entitieList)) {
			return Lists.newArrayList();
		}
		return convertor.entity2DtoList(entitieList);
	}
	
	public List<D> listDtos(String hql, Map<String, Object> params) throws BizException {
		if(convertor==null){
			throw new BizException(SystemMessageCode.BIZ_00001);
		}
		List<E> entitieList = selectList(hql, params);
		if (CollectionUtils.isEmpty(entitieList)) {
			return Lists.newArrayList();
		}
		return convertor.entity2DtoList(entitieList);
	}

	public List<D> listDtos(String hql, Map<String, Object> params, int pageNo, int pageSize) throws BizException {
		if(convertor==null){
			throw new BizException(SystemMessageCode.BIZ_00001);
		}
		List<E> entitieList = selectList(hql, params, pageNo, pageSize);
		if (CollectionUtils.isEmpty(entitieList)) {
			return Lists.newArrayList();
		}
		return convertor.entity2DtoList(entitieList);
	}

	public D save(D dto) throws BizException {
		if(convertor==null){
			throw new BizException(SystemMessageCode.BIZ_00001);
		}
		E entity = convertor.dto2Entity(dto);
		entity = dao.save(entity);
		return convertor.entity2Dto(entity);
	}

	public PageResults<D> listPage(String hql, Map<String, Object> params, int pageNo, int pageSize) throws BizException {
		String countHql = countHql(hql);
		return listPage(hql, countHql, params, pageNo, pageSize);
	}

	private String countHql(String hql) {
		String countHql = null;
		if (StringUtils.isNotBlank(hql)) {
			int fromIdx = hql.indexOf("from");
			if (fromIdx > 0) {
				countHql = hql.substring(fromIdx);
			} else {
				countHql = hql;
			}

			int orderIdx = countHql.indexOf(" order by");
			if (orderIdx > 0) {
				countHql = countHql.substring(0, orderIdx);
			}
			countHql = "select count(*) " + countHql;
		}
		return countHql;
	}

	public PageResults<D> listPage(String hql, String countHql, Map<String, Object> params, int pageNo,
			int pageSize) throws BizException {
		List<D> data = listDtos(hql, params, pageNo, pageSize);
		long count = 0;
		if (StringUtils.isNotBlank(countHql)) {
			count = selectRowCount(countHql, params);
		}
		PageResults<D> queryResultsDto = new PageResults<D>(data, pageNo, pageSize, count);
		return queryResultsDto;
	}
	
}
