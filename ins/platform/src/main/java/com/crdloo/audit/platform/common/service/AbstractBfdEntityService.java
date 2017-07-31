package com.crdloo.audit.platform.common.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.data.redis.core.ValueOperations;

import com.crdloo.audit.framework.client.IDto;
import com.crdloo.audit.framework.common.dao.IEntityDao;
import com.crdloo.audit.framework.common.dao.entity.IEntity;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.framework.common.service.AbstractEntityService;
import com.crdloo.audit.framework.router.utils.SpringContextUtil;
import com.crdloo.audit.platform.common.enums.BfdExCode;
import com.crdloo.audit.platform.common.hao.bfd.BfdHaoProcess;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;
import com.crdloo.audit.platform.common.hao.bfd.BfdResult;
import com.crdloo.audit.platform.log.dao.entity.QueryLogEntity;
import com.google.common.collect.Maps;

public abstract class AbstractBfdEntityService<D extends IDto, E extends IEntity> extends AbstractEntityService<D, E> {

	@Resource
	protected BfdHaoProcess bfdHaoProcess;
	@Resource(name = "redisTemplate")
	private ValueOperations<String, String> redis;

	private List<String> bfdParams = new ArrayList<String>();
	private IEntityDao<QueryLogEntity> queryLogDao;

	public AbstractBfdEntityService() {
		super();
		this.queryLogDao = SpringContextUtil.getBean("queryLogDaoImpl", IEntityDao.class);
		bfdParams.add("id");
		bfdParams.add("cell");
		bfdParams.add("name");
		bfdParams.add("linkman_cell");
		bfdParams.add("bank_id");
		bfdParams.add("biz_workfor");
		bfdParams.add("keyNo");
		bfdParams.add("upstreamCount");
		bfdParams.add("downstreamCount");
		bfdParams.add("searchKey");
		bfdParams.add("phone");
	}

	// 百融接口调用
	public D bfdQuery(Long employeeId, BfdMealTypeEnum mealType, Map<String, Object> map) throws BizException {
		return bfdQuery(employeeId, mealType, map, null);
	}
	
	public D bfdQuery(Long employeeId, BfdMealTypeEnum mealType, Map<String, Object> map, Class<?> voClass) throws BizException {
		if (employeeId == null) {
			throw new BizException(BfdExCode.EMPLOYEDID_IS_NULL);
		}
		if (MapUtils.isEmpty(map)) {
			throw new BizException(BfdExCode.PARAMS_IS_EMPTY);
		}

		String cacheKey = this.bfdCacheKey(mealType, map);
		String swift_number = redis.get(cacheKey);
		logger.info("bfdQuery: [cacheKey=" + cacheKey + ", swift_number=" + swift_number + "]");

		E entity = null;
		String code = "00";
		boolean hitCache = false;
		if (StringUtils.isNotBlank(swift_number)) {
			String hql = "from " + entityName + " e where e.swift_number=:swift_number";
			Map<String, Object> params = Maps.newHashMap();
			params.put("swift_number", swift_number);
			List<E> list = this.selectList(hql, params, 1, 1);
			if (CollectionUtils.isNotEmpty(list)) {
				entity = list.get(0);
			}
			if (entity != null) {
				hitCache = true;
			}
		}
		if (entity == null) {
			BfdResult<?> bfdResult = null;
			map.put("meal", mealType.getMeal());
			Class clazz = entityClazz;
			if(voClass!=null){
				clazz = voClass;
			}
			if ("pack".equals(mealType.getInvokeType())) {
				bfdResult = bfdHaoProcess.query(map, clazz);
			} else {
				bfdResult = bfdHaoProcess.hnQuery(map, clazz);
			}
			code = bfdResult.getCode();
			swift_number = bfdResult.getSwift_number();
			Object data = bfdResult.getData();
			if(data!=null){
				if (data instanceof IEntity) {
					entity = (E)data;
				}else{
					entity = convertor.vo2Entity(data);
				}
				if (entity != null) {
					this.insert(entity);
					redis.set(cacheKey, swift_number, 10, TimeUnit.DAYS);
				}
			}
		}
		// 记录查询日志
		QueryLogEntity logEntity = new QueryLogEntity(employeeId, mealType.getId(), code, map.toString(), swift_number,
				hitCache);
		queryLogDao.insert(logEntity);
		
		D dto = null;
		if (entity!=null) {
		    try {
	            dto = dtoClazz.newInstance();
	            BeanUtils.copyProperties(dto, entity);
	        } catch (Exception e) {
	            throw new BizException(BfdExCode.CONVERT_DTO_ERR);
	        }
		}
		return dto;
	}
	
	private String bfdCacheKey(BfdMealTypeEnum mealType, Map<String, Object> map) {
		StringBuilder sb = new StringBuilder();
		sb.append("bfd.rs.").append(mealType.getId()).append(".");

		for (String key : bfdParams) {
			Object value = map.get(key);
			if (value != null) {
				if (value instanceof String[]) {
					sb.append(ArrayUtils.toString(value));
				} else {
					sb.append(value.toString());
				}
			}
		}

		return sb.toString();
	}
}
