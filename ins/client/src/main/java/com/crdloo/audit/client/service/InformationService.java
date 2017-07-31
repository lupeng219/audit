package com.crdloo.audit.client.service;

import java.util.HashMap;
import java.util.Map;

import com.crdloo.audit.client.dto.BankThreeDto;
import com.crdloo.audit.client.dto.IdTwo_zDto;
import com.crdloo.audit.client.dto.KeyAttributionDto;
import com.crdloo.audit.client.dto.TelCheckDto;
import com.crdloo.audit.framework.client.EnumConnectType;
import com.crdloo.audit.framework.client.PlatformResult;
import com.crdloo.audit.framework.client.router.AbstractRouterService;
import com.crdloo.audit.framework.router.Router;

public class InformationService extends AbstractRouterService{

    public InformationService(Router router) {
        super(router);
    }

    @Override
    public String getContext() {
        return "/information/";
    }
    public PlatformResult<BankThreeDto> getBankThreeData(Long employeeId,String id, String name,String bank_id)
    {
        Map<String , Object> map = new HashMap<String , Object>();
        map.put("employeeId", employeeId);
        map.put("id", id);
        map.put("name", name);
        map.put("bank_id", bank_id);
        return post("getBankThreeData.json",map, BankThreeDto.class, EnumConnectType.SHORT);
    }
    

    public PlatformResult<IdTwo_zDto> getIdTwo_zData(Long employeeId,String id, String name)
    {
        Map<String , Object> map = new HashMap<String , Object>();
        map.put("employeeId", employeeId);
        map.put("id", id);
        map.put("name", name);
        return post("getIdTwo_zData.json",map, IdTwo_zDto.class, EnumConnectType.SHORT);
    }
    
    public PlatformResult<KeyAttributionDto> getKeyAttributionData(Long employeeId,String id, String cell,String name){
    	Map<String , Object> map = new HashMap<String , Object>();
        map.put("employeeId", employeeId);
        map.put("id", id);
        map.put("name", name);
        map.put("cell", cell);
    	return post("getKeyAttributionData.json",map, KeyAttributionDto.class, EnumConnectType.SHORT);
    }

    public PlatformResult<TelCheckDto> getTelCheckData(Long employeeId,String id, String cell,String name){
    	Map<String , Object> map = new HashMap<String , Object>();
        map.put("employeeId", employeeId);
        map.put("id", id);
        map.put("name", name);
        map.put("cell", cell);
    	return post("getTelCheckData.json",map, TelCheckDto.class, EnumConnectType.SHORT);
    }

}
