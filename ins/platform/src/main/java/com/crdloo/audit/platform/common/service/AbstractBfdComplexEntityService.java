package com.crdloo.audit.platform.common.service;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.data.redis.core.ValueOperations;

import com.crdloo.audit.framework.client.IDto;
import com.crdloo.audit.framework.common.dao.IEntityDao;
import com.crdloo.audit.framework.common.dao.entity.IEntity;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.framework.router.utils.MonitorLogger;
import com.crdloo.audit.framework.router.utils.SpringContextUtil;
import com.crdloo.audit.platform.common.enums.BfdExCode;
import com.crdloo.audit.platform.common.hao.bfd.BfdHaoProcess;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;
import com.crdloo.audit.platform.common.hao.bfd.BfdResult;
import com.crdloo.audit.platform.log.dao.entity.QueryLogEntity;

public abstract class AbstractBfdComplexEntityService<D extends IDto, E extends IEntity> {

	protected final Logger logger = Logger.getLogger(getClass());

	protected final MonitorLogger monitorLog = MonitorLogger.getInstance();

	protected Class<D> dtoClass;
//	protected Class<T> voClass;
	@Resource
	protected BfdHaoProcess bfdHaoProcess;
	@Resource(name = "redisTemplate")
	private ValueOperations<String, String> redis;

	private List<String> bfdParams = new ArrayList<String>();
	private IEntityDao<QueryLogEntity> queryLogDao;

	@SuppressWarnings("unchecked")
	public AbstractBfdComplexEntityService() {
		Type genericSuperclass = getClass().getGenericSuperclass();
		if (genericSuperclass instanceof ParameterizedType) {
			ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
			this.dtoClass = (Class<D>) pt.getActualTypeArguments()[0];
//			this.voClass = (Class<T>) pt.getActualTypeArguments()[1];
		}
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
			entity = getDataFromDB(swift_number);
			if (entity != null) {
				hitCache = true;
			}
		}
		if (entity == null) {
			BfdResult<?> bfdResult = null;
			map.put("meal", mealType.getMeal());
			if ("pack".equals(mealType.getInvokeType())) {
				bfdResult = bfdHaoProcess.query(map, voClass);
			} else {
				bfdResult = bfdHaoProcess.hnQuery(map, voClass);
			}
			code = bfdResult.getCode();
			swift_number = bfdResult.getSwift_number();
			Object dataVo = bfdResult.getData();
			if (dataVo != null) {
				entity = saveDataToDB(dataVo);
				redis.set(cacheKey, swift_number, 10, TimeUnit.DAYS);
			}
		}
		// 记录查询日志
		QueryLogEntity logEntity = new QueryLogEntity(employeeId, mealType.getId(), code, map.toString(), swift_number,
				hitCache);
		queryLogDao.insert(logEntity);
		
		D dto = null;
		try {
			dto = dtoClass.newInstance();
			BeanUtils.copyProperties(dto, entity);
		} catch (Exception e) {
			throw new BizException(BfdExCode.CONVERT_DTO_ERR);
		}
		return dto;
	}

	protected abstract E getDataFromDB(String swift_number);

	protected abstract E saveDataToDB(Object data);

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
