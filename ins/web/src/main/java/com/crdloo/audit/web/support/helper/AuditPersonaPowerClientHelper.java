package com.crdloo.audit.web.support.helper;

import java.util.List;

import com.crdloo.audit.client.AuditClient;
import com.crdloo.audit.client.dto.EmployeeDto;
import com.crdloo.audit.client.dto.Employee_personaDto;
import com.crdloo.audit.client.dto.PersonaDto;
import com.crdloo.audit.client.dto.Persona_powerDto;
import com.crdloo.audit.client.dto.PowerDto;
import com.crdloo.audit.client.service.PersonaPowerService;
import com.crdloo.audit.framework.client.PlatformResult;
import com.crdloo.audit.framework.router.utils.MonitorLogger;

public class AuditPersonaPowerClientHelper {
    
    private static PersonaPowerService personaPowerService = AuditClient.getPersonaPowerService();
    
    public static List<PowerDto> getPowerDatas(){
        PlatformResult<List<PowerDto>> result = personaPowerService.getPowerDatas();
        if (result.isOK()) {
            return result.getData();
        }
        MonitorLogger.getInstance().info("Call AuditClient.getPersonaPowerService().getPowerDatas : " + result.getMessage());
        return null;
    }
    public static  List<Employee_personaDto> getEmployeeIdBypersonaId(Long id){
        PlatformResult<List<Employee_personaDto>> result = personaPowerService.getEmployeeIdBypersonaId(id);
        if (result.isOK()) {
            return result.getData();
        }
        MonitorLogger.getInstance().info("Call AuditClient.getPersonaPowerService().getEmployeeIdBypersonaId : " + result.getMessage());
        return null;
    }
    
    public static  List<EmployeeDto> getEmployeeListByEmployeeIds(List<Long> ids){
        PlatformResult<List<EmployeeDto>> result = personaPowerService.getEmployeeListByEmployeeIds(ids);
        if (result.isOK()) {
            return result.getData();
        }
        MonitorLogger.getInstance().info("Call AuditClient.getPersonaPowerService().getEmployeeListByEmployeeIds : " + result.getMessage());
        return null;
    }
    public static List<Persona_powerDto> getPersonaPowerBypersonaId(Long id){
        PlatformResult<List<Persona_powerDto>> result = personaPowerService.getPersonaPowerBypersonaId(id);
        if (result.isOK()) {
            return result.getData();
        }
        MonitorLogger.getInstance().info("Call AuditClient.getPersonaPowerService().getPersonaPowerBypersonaId : " + result.getMessage());
        return null;
    }
    public static List<PowerDto> getPowerByPowerId(List<Long> powerId){
        PlatformResult<List<PowerDto>> result = personaPowerService.getPowerByPowerId(powerId);
        if (result.isOK()) {
            return result.getData();
        }
        MonitorLogger.getInstance().info("Call AuditClient.getPersonaPowerService().getPowerByPowerId : " + result.getMessage());
        return null;
    }
    public static PersonaDto getPersonaBypersonaId(Long personaId){
        PlatformResult<PersonaDto> result = personaPowerService.getPersonaBypersonaId(personaId);
        if (result.isOK()) {
            return result.getData();
        }
        MonitorLogger.getInstance().info("Call AuditClient.getPersonaPowerService().getPersonaBypersonaId : " + result.getMessage());
       return null;
   }
    public static List<PowerDto> getPowerOne(){
        PlatformResult<List<PowerDto>> result = personaPowerService.getPowerOne();
        if (result.isOK()) {
            return result.getData();
        }
        MonitorLogger.getInstance().info("Call AuditClient.getPersonaPowerService().getPowerOne : " + result.getMessage());
        return null;
    }
    public static PersonaDto updateOraddPersonaPower(Long personaId,String personaDesc,String personaName, List<Long> powerIds){
        PlatformResult<PersonaDto> result = personaPowerService.updateOraddPersonaPower(personaId, personaDesc, personaName, powerIds);
        if (result.isOK()) {
            return result.getData();
        }
        MonitorLogger.getInstance().info("Call AuditClient.getPersonaPowerService().updateOraddPersonaPower : " + result.getMessage());
        return null;
    }
    
    public static PowerDto addPowerInfo(PowerDto power){
    	PlatformResult<PowerDto> result = personaPowerService.addPowerInfo(power);
    	if (result.isOK()) {
            return result.getData();
        }
    	MonitorLogger.getInstance().info("Call AuditClient.getPersonaPowerService().addPowerInfo : " + result.getMessage());
    	return null;
    }
    
    public static  List<EmployeeDto> getEmployeeBypersonaId(Long id){
        PlatformResult<List<EmployeeDto>> result = personaPowerService.getEmployeeBypersonaId(id);
        if (result.isOK()) {
            return result.getData();
        }
        MonitorLogger.getInstance().info("Call AuditClient.getPersonaPowerService().getEmployeeBypersonaId : " + result.getMessage());
        return null;
    }
    public static  List<PowerDto> getPowerBypersonaId(Long id){
        PlatformResult<List<PowerDto>> result = personaPowerService.getPowerBypersonaId(id);
        if (result.isOK()) {
            return result.getData();
        }
        MonitorLogger.getInstance().info("Call AuditClient.getPersonaPowerService().getPowerBypersonaId : " + result.getMessage());
        return null;
    }
}
