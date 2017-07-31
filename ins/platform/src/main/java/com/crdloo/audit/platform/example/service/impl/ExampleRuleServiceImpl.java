package com.crdloo.audit.platform.example.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.crdloo.audit.client.dto.RuleDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;
import com.crdloo.audit.platform.common.service.AbstractBfdEntityService;
import com.crdloo.audit.platform.example.service.IExampleRuleService;
import com.crdloo.audit.platform.rule.dao.entity.RuleEntity;
import com.google.common.collect.Maps;

@Service("com.crdloo.audit.platform.example.ExampleRuleServiceImpl")
public class ExampleRuleServiceImpl extends AbstractBfdEntityService<RuleDto, RuleEntity> implements IExampleRuleService {

	@Override
	public RuleDto bfdQueryRuleData() throws BizException {
		Map<String, Object> map = Maps.newHashMap();
		map.put("id", "140502198811102244");
		map.put("cell", new String[]{"13986671110"});
		map.put("name", "王亮");
		RuleDto ruleDto = bfdQuery(1l, BfdMealTypeEnum.rule, map);
		logger.info("ruleDto="+ruleDto);
		return ruleDto;
	}

	
	
}
