package com.crdloo.audit.client.service;

import java.util.HashMap;
import java.util.Map;

import com.crdloo.audit.client.dto.TelPeriodDto;
import com.crdloo.audit.client.dto.TelStatusDto;
import com.crdloo.audit.framework.client.EnumConnectType;
import com.crdloo.audit.framework.client.PlatformResult;
import com.crdloo.audit.framework.client.router.AbstractRouterService;
import com.crdloo.audit.framework.router.Router;

public class CreditEvaluationService extends AbstractRouterService{

	public CreditEvaluationService(Router router) {
		super(router);
	}

	@Override
	public String getContext() {
		return "/creditEvaluation/";
	}
    public PlatformResult<TelPeriodDto> getTelPeriodData(Long employeeId, String id,String cell,String name)
    {
        Map<String , Object> map = new HashMap<String , Object>();
        map.put("employeeId", employeeId);
        map.put("id", id);
        map.put("cell", cell);
        map.put("name", name);
        return post("getTelPeriodData.json",map,TelPeriodDto.class, EnumConnectType.SHORT);
    }
	
    public PlatformResult<TelStatusDto> getTelStatusData(Long employeeId, String id,String cell,String name)
    {
        Map<String , Object> map = new HashMap<String , Object>();
        map.put("employeeId", employeeId);
        map.put("id", id);
        map.put("cell", cell);
        map.put("name", name);
        return post("getTelStatusData.json",map, TelStatusDto.class, EnumConnectType.SHORT);
    }
}
