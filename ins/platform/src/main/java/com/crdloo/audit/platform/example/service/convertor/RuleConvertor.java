package com.crdloo.audit.platform.example.service.convertor;

import org.springframework.stereotype.Component;

import com.crdloo.audit.client.dto.ExampleDto;
import com.crdloo.audit.framework.common.service.convertor.AbstractConvertor;
import com.crdloo.audit.platform.example.service.vo.RuleRsVo;
import com.crdloo.audit.platform.rule.dao.entity.RuleEntity;

@Component
public class RuleConvertor extends AbstractConvertor<ExampleDto, RuleEntity>{

	@Override
	public RuleEntity vo2Entity(Object vo) {
		RuleRsVo ruleRsvo = (RuleRsVo)vo;
		
		RuleEntity entity = new RuleEntity();
		entity.setSwift_number(ruleRsvo.getSwift_number());
		entity.setFlag_rulespeciallist(ruleRsvo.getFlag_rulespeciallist());
		entity.setFlag_ruleapplyloan(ruleRsvo.getFlag_ruleapplyloan());
		entity.setFlag_ruleapplyloanmon(ruleRsvo.getFlag_ruleapplyloanmon());
		entity.setFlag_ruleexecution(ruleRsvo.getFlag_ruleexecution());
		entity.setRule_final_decision(ruleRsvo.getRule_final_decision());
		entity.setRule_final_weight(ruleRsvo.getRule_final_weight());
		entity.setRule_name_QJS010(ruleRsvo.getRule_name_QJE010());
		entity.setRule_weight_QJS010(ruleRsvo.getRule_weight_QJE010());
		entity.setRule_name_QJF050(ruleRsvo.getRule_name_QJF010());
		entity.setRule_weight_QJF050(ruleRsvo.getRule_weight_QJF010());
		entity.setRule_name_QAM010(ruleRsvo.getRule_name_QAM010());
		entity.setRule_weight_QAM010(ruleRsvo.getRule_weight_QAM010());
		entity.setRule_name_QJE010(ruleRsvo.getRule_name_QJE010());
		entity.setRule_weight_QJE010(ruleRsvo.getRule_weight_QJE010());
		entity.setRule_name_QJE020(ruleRsvo.getRule_name_QJE020());
		entity.setRule_weight_QJE020(ruleRsvo.getRule_weight_QJE020());
		return entity;
	}
	
}
