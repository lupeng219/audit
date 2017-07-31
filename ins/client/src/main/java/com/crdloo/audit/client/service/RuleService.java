package com.crdloo.audit.client.service;

import java.util.HashMap;
import java.util.Map;

import com.crdloo.audit.client.dto.RuleDto;
import com.crdloo.audit.framework.client.EnumConnectType;
import com.crdloo.audit.framework.client.PlatformResult;
import com.crdloo.audit.framework.client.router.AbstractRouterService;
import com.crdloo.audit.framework.router.Router;

public class RuleService extends AbstractRouterService{

    public RuleService(Router router) {
        super(router);
    }
    @Override
    public String getContext()
    {
        return "/rule/";
    }

    @SuppressWarnings("unchecked")
    public PlatformResult<RuleDto> getRuleData(Long employeeId, String id,String cell,String name)
    {
        Map<String , Object> map = new HashMap<String , Object>();
        map.put("employeeId", employeeId);
        map.put("id", id);
        map.put("cell", cell);
        map.put("name", name);
        return post("getRuleData.json",map,RuleDto.class, EnumConnectType.SHORT);
    }
}
