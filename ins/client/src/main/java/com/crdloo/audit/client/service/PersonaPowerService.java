package com.crdloo.audit.client.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.crdloo.audit.client.dto.EmployeeDto;
import com.crdloo.audit.client.dto.Employee_personaDto;
import com.crdloo.audit.client.dto.PersonaDto;
import com.crdloo.audit.client.dto.Persona_powerDto;
import com.crdloo.audit.client.dto.PowerDto;
import com.crdloo.audit.framework.client.EnumConnectType;
import com.crdloo.audit.framework.client.PlatformResult;
import com.crdloo.audit.framework.client.router.AbstractRouterService;
import com.crdloo.audit.framework.router.Router;

public class PersonaPowerService extends AbstractRouterService{

    public PersonaPowerService(Router router) {
        super(router);
    }
    @Override
    public String getContext()
    {
        return "/personaPower/";
    }
    @SuppressWarnings("unchecked")
    public PlatformResult<List<PowerDto>> getPowerDatas()
    {
        Map<String , Object> map = new HashMap<String , Object>();
        return post("getPowerDatas.json",map,List.class, PowerDto.class, EnumConnectType.SHORT);
    }
    
    @SuppressWarnings("unchecked")
    public PlatformResult<List<Employee_personaDto>> getEmployeeIdBypersonaId(Long personaId)
    {
        Map<String , Object> map = new HashMap<String , Object>();
        map.put("personaId", personaId);
        return post("getEmployeeIdBypersonaId.json",map,List.class, Employee_personaDto.class, EnumConnectType.SHORT);
    }
    
    @SuppressWarnings("unchecked")
    public PlatformResult<List<EmployeeDto>> getEmployeeListByEmployeeIds(List<Long> ids)
    {
        Map<String , Object> map = new HashMap<String , Object>();
        map.put("ids", ids);
        return post("getEmployeeListByEmployeeIds.json",map,List.class, EmployeeDto.class, EnumConnectType.SHORT);
    }
    
    @SuppressWarnings("unchecked")
    public PlatformResult<List<Persona_powerDto>> getPersonaPowerBypersonaId(Long id)
    {
        Map<String , Object> map = new HashMap<String , Object>();
        map.put("personaId", id);
        PlatformResult<List<Persona_powerDto>> result = processNullMap(map);
        if(result != null)
        {
            return result;
        }
        return post("getPersonaPowerBypersonaId.json", map, List.class, Persona_powerDto.class,EnumConnectType.SHORT);
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
    public PlatformResult<PersonaDto> updateOraddPersonaPower(Long personaId,String personaDesc,String personaName, List<Long> powerIds){
        Map<String , Object> map = new HashMap<String , Object>();
        map.put("personaId", personaId);
        map.put("personaDesc",personaDesc);
        map.put("personaName",personaName);
        map.put("powerIds",powerIds);
        return post("updateOraddPersonaPower.json", map, PersonaDto.class, EnumConnectType.SHORT);
    }
    @SuppressWarnings("unchecked")
    public PlatformResult<List<PowerDto>> getPowerOne()
    {
        Map<String , Object> map = new HashMap<String , Object>();
        return post("getPowerOne.json",map,List.class, PowerDto.class, EnumConnectType.SHORT);
    }
    public PlatformResult<PersonaDto> getPersonaBypersonaId(Long personaId){
        Map<String , Object> map = new HashMap<String , Object>();
        map.put("personaId", personaId);
        PlatformResult<PersonaDto> result = processNullMap(map);
        if(result != null)
        {
            return result;
        }
        return post("getPersonaBypersonaId.json", map, PersonaDto.class, EnumConnectType.SHORT);
    }
 
    public PlatformResult<PowerDto> addPowerInfo(PowerDto power){
    	Map<String , Object> map = new HashMap<String , Object>();
    	map.put("power", power);
    	return post("addPowerInfo.json", map, PowerDto.class, EnumConnectType.SHORT);
    }
    
    @SuppressWarnings("unchecked")
    public PlatformResult<List<EmployeeDto>> getEmployeeBypersonaId(Long personaId)
    {
        Map<String , Object> map = new HashMap<String , Object>();
        map.put("personaId", personaId);
        return post("getEmployeeBypersonaId.json",map,List.class, EmployeeDto.class, EnumConnectType.SHORT);
    }
    @SuppressWarnings("unchecked")
    public PlatformResult<List<PowerDto>> getPowerBypersonaId(Long personaId)
    {
        Map<String , Object> map = new HashMap<String , Object>();
        map.put("personaId", personaId);
        return post("getPowerBypersonaId.json",map,List.class, PowerDto.class, EnumConnectType.SHORT);
    }
}
