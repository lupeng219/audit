package com.crdloo.audit.platform.example.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import com.crdloo.audit.client.dto.RuleDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;
import com.crdloo.audit.platform.common.service.AbstractBfdComplexEntityService;
import com.crdloo.audit.platform.example.service.IExampleRuleComplexService;
import com.crdloo.audit.platform.example.service.vo.RuleRsVo;
import com.crdloo.audit.platform.rule.dao.RuleDao;
import com.crdloo.audit.platform.rule.dao.entity.RuleEntity;
import com.google.common.collect.Maps;

@Service("com.crdloo.audit.platform.example.ExampleRuleComplexServiceImpl")
public class ExampleRuleComplexServiceImpl extends AbstractBfdComplexEntityService<RuleDto, RuleEntity> implements IExampleRuleComplexService {
	
	@Resource
	private RuleDao ruleDao;

	@Override
	public RuleDto bfdQueryRuleData() throws BizException {
		Map<String, Object> map = Maps.newHashMap();
		map.put("id", "140502198811102244");
		map.put("cell", new String[]{"13986671110"});
		map.put("name", "王亮");
		RuleDto ruleDto = bfdQuery(1l, BfdMealTypeEnum.rule, map, RuleRsVo.class);
		logger.info("ruleDto="+ruleDto);
		return ruleDto;
	}

	@Override
	protected RuleEntity getDataFromDB(String swift_number) {
		RuleEntity entity = null;
		String hql = "from RuleEntity e where e.swift_number=:swift_number";
		Map<String, Object> params = Maps.newHashMap();
		params.put("swift_number", swift_number);
		List<RuleEntity> list = ruleDao.selectList(hql, params, 1, 1);
		if(CollectionUtils.isNotEmpty(list)){
			entity = list.get(0);
		}
		return entity;
	}

	@Override
	protected RuleEntity saveDataToDB(Object vo) {
		RuleRsVo data = (RuleRsVo)vo;
		RuleEntity entity = new RuleEntity();
		entity.setSwift_number(data.getSwift_number());
		entity.setFlag_rulespeciallist(data.getFlag_rulespeciallist());
		entity.setFlag_ruleapplyloan(data.getFlag_ruleapplyloan());
		entity.setFlag_ruleapplyloanmon(data.getFlag_ruleapplyloanmon());
		entity.setFlag_ruleexecution(data.getFlag_ruleexecution());
		entity.setRule_final_decision(data.getRule_final_decision());
		entity.setRule_final_weight(data.getRule_final_weight());
		entity.setRule_name_QJS010(data.getRule_name_QJE010());
		entity.setRule_weight_QJS010(data.getRule_weight_QJE010());
		entity.setRule_name_QJF050(data.getRule_name_QJF010());
		entity.setRule_weight_QJF050(data.getRule_weight_QJF010());
		entity.setRule_name_QAM010(data.getRule_name_QAM010());
		entity.setRule_weight_QAM010(data.getRule_weight_QAM010());
		entity.setRule_name_QJE010(data.getRule_name_QJE010());
		entity.setRule_weight_QJE010(data.getRule_weight_QJE010());
		entity.setRule_name_QJE020(data.getRule_name_QJE020());
		entity.setRule_weight_QJE020(data.getRule_weight_QJE020());
		ruleDao.insert(entity);
		return entity;
	}

	
}
