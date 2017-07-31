package com.crdloo.audit.platform.rule.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.crdloo.audit.client.dto.RuleDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;
import com.crdloo.audit.platform.common.service.AbstractBfdEntityService;
import com.crdloo.audit.platform.rule.dao.entity.RuleEntity;
import com.crdloo.audit.platform.rule.service.RuleService;
@Service("com.crdloo.audit.platform.rule.service.impl.RuleServiceImpl")
public class RuleServiceImpl extends AbstractBfdEntityService<RuleDto, RuleEntity> implements RuleService{

    @Override
    public RuleDto bfdQueryRuleDto(Long employeeId, BfdMealTypeEnum mealType, String id,String cell,String name) throws BizException {
      monitorLog.info("RuleServiceImpl-bfdQueryRuleDto: [employeeId="+employeeId+",id="+id+", cell="+cell+",name="+name+"]");
      Map<String,Object> map =  new HashMap<String,Object>();
      map.put("id", id);
      map.put("cell", new String[]{cell});
      map.put("name", name);
      return bfdQuery(employeeId, mealType, map);
    }


}
