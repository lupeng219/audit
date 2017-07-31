package com.crdloo.audit.client.service;

import java.util.HashMap;
import java.util.Map;

import com.crdloo.audit.client.dto.ApplyLoanMonDto;
import com.crdloo.audit.client.dto.ApplyLoanStrDto;
import com.crdloo.audit.client.dto.ExecutionDto;
import com.crdloo.audit.client.dto.InfoRelationDto;
import com.crdloo.audit.client.dto.SpecialList_cDto;
import com.crdloo.audit.framework.client.EnumConnectType;
import com.crdloo.audit.framework.client.PlatformResult;
import com.crdloo.audit.framework.client.router.AbstractRouterService;
import com.crdloo.audit.framework.router.Router;

public class AntifraudService extends AbstractRouterService{

    public AntifraudService(Router router) {
        super(router);
    }

    @Override
    public String getContext() {
        return "/antifraud/";
    }

  
    public PlatformResult<SpecialList_cDto> getSpecialList_cData(String id,String cell,String name,String linkman_cell ){
        
        Map<String , Object> map = new HashMap<String , Object>();
        map.put("id", id);
        map.put("cell", cell);
        map.put("name", name);
        map.put("linkman_cell",linkman_cell );
        return post("getSpecialList_cData.json",map,SpecialList_cDto.class, EnumConnectType.SHORT);

    }

    
    public PlatformResult<ApplyLoanMonDto> getApplyLoanMonData(String id,String cell,String name,String linkman_cell)

    {
        Map<String , Object> map = new HashMap<String , Object>();
        map.put("id", id);
        map.put("cell", cell);
        map.put("name", name);
        map.put("linkman_cell", linkman_cell);
        return post("getApplyLoanMonData.json",map,ApplyLoanMonDto.class, EnumConnectType.SHORT);
    }
    public PlatformResult<ExecutionDto> getExecutionData(String id,String cell,String name)
    {
        Map<String , Object> map = new HashMap<String , Object>();
        map.put("id", id);
        map.put("cell", cell);
        map.put("name", name);
        return post("getExecutionData.json",map,ExecutionDto.class, EnumConnectType.SHORT);
    }
    public PlatformResult<InfoRelationDto> getInfoRelationData(String id,String cell,String name)
    {
        Map<String , Object> map = new HashMap<String , Object>();
        map.put("id", id);
        map.put("cell", cell);
        map.put("name", name);
        return post("getInfoRelationData.json",map,InfoRelationDto.class, EnumConnectType.SHORT);

    }
    
    public PlatformResult<ApplyLoanStrDto> getApplyLoanStrData(String id,String cell,String name)
    {
        Map<String , Object> map = new HashMap<String , Object>();
        map.put("id", id);
        map.put("cell", cell);
        map.put("name", name);
        return post("getApplyLoanStrData.json",map,ApplyLoanStrDto.class, EnumConnectType.SHORT);

    }
}
