package com.crdloo.audit.client.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.crdloo.audit.client.dto.Employee_personaDto;
import com.crdloo.audit.client.dto.Persona_powerDto;
import com.crdloo.audit.client.dto.PowerDto;
import com.crdloo.audit.framework.client.EnumConnectType;
import com.crdloo.audit.framework.client.PlatformResult;
import com.crdloo.audit.framework.client.router.AbstractRouterService;
import com.crdloo.audit.framework.router.Router;

public class LoginService extends AbstractRouterService{

    public LoginService(Router router) {
        super(router);
    }
    @Override
    public String getContext()
    {
        return "/login/";
    }
    public PlatformResult<Employee_personaDto> getData(Long id)
    {
        Map<String , Object> map = new HashMap<String , Object>();
        map.put("id", id);
        PlatformResult<Employee_personaDto> result = processNullMap(map);
        if(result != null)
        {
            return result;
        }
        return post("getEmployee_personaData.json", map, Employee_personaDto.class, EnumConnectType.SHORT);
    }
    @SuppressWarnings("unchecked")
    public PlatformResult<List<PowerDto>> getPowerTwo()
    {
        Map<String , Object> map = new HashMap<String , Object>();
        return post("getPowerTwo.json",map,List.class, PowerDto.class, EnumConnectType.SHORT);
    }
    @SuppressWarnings("unchecked")
    public PlatformResult<List<PowerDto>> getPowerOne()
    {
        Map<String , Object> map = new HashMap<String , Object>();
        return post("getPowerOne.json",map,List.class, PowerDto.class, EnumConnectType.SHORT);
    }
    @SuppressWarnings("unchecked")
    public PlatformResult<List<Persona_powerDto>> getPowerId(Long id)
    {
        Map<String , Object> map = new HashMap<String , Object>();
        map.put("personaId", id);
        PlatformResult<List<Persona_powerDto>> result = processNullMap(map);
        if(result != null)
        {
            return result;
        }
        return post("getPowerId.json", map, List.class, Persona_powerDto.class,EnumConnectType.SHORT);
    }
    @SuppressWarnings("unchecked")
    public PlatformResult<List<PowerDto>> getPowerByPowerId(List<Long> powerId)
    {
        Map<String , Object> map = new HashMap<String , Object>();
        map.put("powerId", powerId);
        PlatformResult<List<PowerDto>> result = processNullMap(map);
        if(result != null)
        {
            return result;
        }
        return post("getPowerByPowerId.json", map, List.class, PowerDto.class,EnumConnectType.SHORT);
    }
    
}
