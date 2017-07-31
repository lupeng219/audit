package com.crdloo.audit.web.support.helper;

import java.util.List;

import com.crdloo.audit.client.AuditClient;
import com.crdloo.audit.client.dto.Employee_personaDto;
import com.crdloo.audit.client.dto.Persona_powerDto;
import com.crdloo.audit.client.dto.PowerDto;
import com.crdloo.audit.client.service.LoginService;
import com.crdloo.audit.framework.client.PlatformResult;
import com.crdloo.audit.framework.router.utils.MonitorLogger;

public class AuditLoginClientHelper {
    
    private static LoginService loginService = AuditClient.getLoginService();
    
    public static Employee_personaDto getData(Long id) {
        PlatformResult<Employee_personaDto> result = loginService.getData(id);
        if (result.isOK()) {
            return result.getData();
        }
        MonitorLogger.getInstance().info("Call AuditClient.getLoginService().getData : " + result.getMessage());
        return null;
    }
    public static List<PowerDto> getPowerTwo(){
        PlatformResult<List<PowerDto>> result = loginService.getPowerTwo();
        if (result.isOK()) {
            return result.getData();
        }
        MonitorLogger.getInstance().info("Call AuditClient.getLoginService().getPowerTwo : " + result.getMessage());
        return null;
    }
    public static List<PowerDto> getPowerOne(){
        PlatformResult<List<PowerDto>> result = loginService.getPowerOne();
        if (result.isOK()) {
            return result.getData();
        }
        MonitorLogger.getInstance().info("Call AuditClient.getLoginService().getPowerOne : " + result.getMessage());
        return null;
    }
    public static List<Persona_powerDto> getPowerId(Long id){
        PlatformResult<List<Persona_powerDto>> result = loginService.getPowerId(id);
        if (result.isOK()) {
            return result.getData();
        }
        MonitorLogger.getInstance().info("Call AuditClient.getLoginService().getPowerId : " + result.getMessage());
        return null;
    }
    public static List<PowerDto> getPowerByPowerId(List<Long> powerId){
        PlatformResult<List<PowerDto>> result = loginService.getPowerByPowerId(powerId);
        if (result.isOK()) {
            return result.getData();
        }
        MonitorLogger.getInstance().info("Call AuditClient.getLoginService().findPowerByPowerId : " + result.getMessage());
        return null;
    }
}
