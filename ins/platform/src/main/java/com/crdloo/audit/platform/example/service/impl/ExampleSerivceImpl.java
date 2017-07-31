package com.crdloo.audit.platform.example.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crdloo.audit.client.dto.ExampleDto;
import com.crdloo.audit.client.dto.RuleDto;
import com.crdloo.audit.framework.client.PageResults;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.framework.common.service.AbstractEntityService;
import com.crdloo.audit.platform.antifraud.dao.ApplyLoanStrDao;
import com.crdloo.audit.platform.antifraud.dao.entity.ApplyLoanStrEntity;
import com.crdloo.audit.platform.common.enums.ExampleExCode;
import com.crdloo.audit.platform.example.dao.IExampleDao;
import com.crdloo.audit.platform.example.dao.entity.ExampleEntity;
import com.crdloo.audit.platform.example.service.IExampleRule2Service;
import com.crdloo.audit.platform.example.service.IExampleRuleComplexService;
import com.crdloo.audit.platform.example.service.IExampleRuleService;
import com.crdloo.audit.platform.example.service.IExampleService;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

@Service("com.crdloo.audit.platform.example.ExampleSerivceImpl")
public class ExampleSerivceImpl extends AbstractEntityService<ExampleDto, ExampleEntity> implements IExampleService {
	
	@Resource
	private IExampleDao exampleDao;
	@Resource
	private IExampleRuleService exampleRuleService;
	@Resource
	private IExampleRule2Service exampleRule2Service;
	@Resource
	private IExampleRuleComplexService exampleRuleComplexService;
	@Resource
	private ApplyLoanStrDao applyLoanStrDao;

	@Override
	public ExampleDto getExampleData(Long id) throws BizException {
		monitorLog.info("ExampleSerivceImpl-getExampleData: [id="+id+"]");
		if(id==null){
			throw new BizException(ExampleExCode.ID_IS_NULL);
		}
		ExampleDto dto = getDtoById(id);
		
//		RuleDto ruleDto = exampleRuleService.bfdQueryRuleData();
//		RuleDto ruleDto = exampleRule2Service.bfdQueryRuleData();
		RuleDto ruleDto = exampleRuleComplexService.bfdQueryRuleData();
		return dto;
	}

	@Override
	public List<ExampleDto> getExampleDatas(String tag, Integer pageNo, Integer pageSize) throws BizException {
		/*
		monitorLog.info("ExampleSerivceImpl-getExampleDatas: [tag="+tag+", pageNo="+pageNo+", pageSize="+pageSize+"]");
		String hql = "from ExampleEntity e where e.name=:name";
		Map<String, Object> params = Maps.newHashMap();
		params.put("name", tag);
		List<ExampleDto> list = listDtos(hql, params, pageNo, pageSize);
		*/
		/*
		List<Long> ids = Lists.newArrayList();
		ids.add(2l);
		ids.add(3l);
		List<ExampleEntity> entityList = selectEntitiesByPKs(ids);
		List<ExampleDto> list = Lists.newArrayList();
		for(ExampleEntity e : entityList){
			list.add(convertor.entity2Dto(e));
		}
		*/
		List<ExampleDto> list = Lists.newArrayList();
		String hql = "select count(e.id) from ExampleEntity e where e.name=:name";
		Map<String, Object> params = Maps.newHashMap();
		params.put("name", tag);
		long count = selectRowCount(hql, params);
		logger.info("example selectRowCount="+count);
		return list;
	}

	@Override
	public PageResults<ExampleDto> getExampleList(String tag, Integer pageNo, Integer pageSize)
			throws BizException {
		monitorLog.info("ExampleSerivceImpl-getExampleDatas: [tag="+tag+", pageNo="+pageNo+", pageSize="+pageSize+"]");
		String hql = "from ExampleEntity e where e.name=:name order by e.id asc";
		Map<String, Object> params = Maps.newHashMap();
		params.put("name", tag);
		PageResults<ExampleDto> result = listPage(hql, params, pageNo, pageSize);
		return result;
	}

	@Override
	public ExampleDto insertData(String name) throws BizException {
		ExampleEntity entity = new ExampleEntity();
		entity.setId(8l);
		entity.setName("中文22222www");
		entity.setCreated(new Date());
		entity.setUpdated(new Date());
		entity.setStatus(1);
//		insert(entity);
//		update(entity);
//		deleteByPK(8l);
		List<Long> ids = Lists.newArrayList();
		ids.add(2l);
		ids.add(3l);
		deleteBatchByPKs(ids);
		logger.debug("insert Data: new_id="+entity.getId());
		ExampleDto dto = new ExampleDto();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		return dto;
	}

    @Override
    public void insertDatas() throws BizException {
        ApplyLoanStrEntity en = new ApplyLoanStrEntity();
        
        applyLoanStrDao.save(en);
        
    }

	
	
	
}
