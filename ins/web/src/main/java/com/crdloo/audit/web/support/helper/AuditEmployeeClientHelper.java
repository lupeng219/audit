package com.crdloo.audit.web.support.helper;

import java.util.List;

import com.crdloo.audit.client.AuditClient;
import com.crdloo.audit.client.dto.EmployeeDto;
import com.crdloo.audit.client.dto.Employee_personaDto;
import com.crdloo.audit.client.dto.PersonaDto;
import com.crdloo.audit.client.service.EmployeeService;
import com.crdloo.audit.framework.client.PageResults;
import com.crdloo.audit.framework.client.PlatformResult;
import com.crdloo.audit.framework.router.utils.MonitorLogger;

public class AuditEmployeeClientHelper {

	private static EmployeeService employeeService = AuditClient.getEmployeeService();
	public static PageResults<EmployeeDto> getEmployeePageList(String personaName, String parameName, Integer pageNo, Integer pageSize) {
		PlatformResult<PageResults<EmployeeDto>> result = employeeService.getEmployeepagelist(personaName, parameName, pageNo, pageSize);
		if (result.isOK()) {
			return result.getData();
		}
		MonitorLogger.getInstance().info("Call AuditClient.getEmployeeService().getEmployeePageList : " + result.getMessage());
		return null;
	}
	public static EmployeeDto getEmployeeByUserName(String userName) {
        PlatformResult<EmployeeDto> result = employeeService.getEmployeeByUserName(userName);
        if (result.isOK()) {
            return result.getData();
        }
        MonitorLogger.getInstance().info("Call AuditClient.getEmployeeByUserName().getData : " + result.getMessage());
        return null;
    }
	public static PersonaDto findPersonaBypersonaId(Long personaId){
		 PlatformResult<PersonaDto> result = employeeService.findPersonaBypersonaId(personaId);
         if (result.isOK()) {
             return result.getData();
         }
         MonitorLogger.getInstance().info("Call AuditClient.findPersonaBypersonaId().getData : " + result.getMessage());
		return null;
		
	}
	public static EmployeeDto getEmployeeByCustNo(String custNo) {
        PlatformResult<EmployeeDto> result = employeeService.getEmployeeByCustNo(custNo);
        if (result.isOK()) {
            return result.getData();
        }
        MonitorLogger.getInstance().info("Call AuditClient.getEmployeeByCustNo().getData : " + result.getMessage());
        return null;
    }
	
	public static EmployeeDto addorUpdateEmployee(EmployeeDto dto) {
		PlatformResult<EmployeeDto> result = employeeService.addorUpdateEmployee(dto);
		if (result.isOK()) {
			return result.getData();
		}
		MonitorLogger.getInstance().info("Call AuditClient.addEmployee() : " + result.getMessage());
		return null;
	}
	public static Employee_personaDto addOrUpdataEmployeePersona(Employee_personaDto dto){
		PlatformResult<Employee_personaDto> result = employeeService.addOrUpdataEmployeePersona(dto);
		if (result.isOK()) {
			return result.getData();
		}
		MonitorLogger.getInstance().info("Call AuditClient.addEmployeePersona() : " + result.getMessage());
		return null;
		
	}
	public static void deleteEmployee(EmployeeDto dto){
		employeeService.deleteEmployee(dto);
	}
	public static void deleteEmployee_persona(Long empId){
		employeeService.deleteEmployee_persona(empId);
	}
	public static void deleteEmployee_persona2(Long employeeId){
		employeeService.deleteEmployee_persona2(employeeId);
	}
	public static List<PersonaDto> getAllPersona(){
		PlatformResult<List<PersonaDto>> result = employeeService.getAllPersona();
        if (result.isOK()) {
            return result.getData();
        }
        MonitorLogger.getInstance().info("Call AuditClient.getAllPersona().getData : " + result.getMessage());
        return null;
	}
}
