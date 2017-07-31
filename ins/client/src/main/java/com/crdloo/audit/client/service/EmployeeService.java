package com.crdloo.audit.client.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.crdloo.audit.client.dto.EmployeeDto;
import com.crdloo.audit.client.dto.Employee_personaDto;
import com.crdloo.audit.client.dto.PersonaDto;
import com.crdloo.audit.framework.client.EnumConnectType;
import com.crdloo.audit.framework.client.PageInfo;
import com.crdloo.audit.framework.client.PageResults;
import com.crdloo.audit.framework.client.PlatformResult;
import com.crdloo.audit.framework.client.router.AbstractRouterService;
import com.crdloo.audit.framework.router.Router;

public class EmployeeService extends AbstractRouterService{

	public EmployeeService(Router router) {
		super(router);
	}

	@Override
	public String getContext() {
		return "/employee/";
	}
	@SuppressWarnings("unchecked")
    public PlatformResult<PageResults<EmployeeDto>> getEmployeepagelist(String personaName, String parameName, Integer pageNo, Integer pageSize){
    	Map<String , Object> map = new HashMap<String , Object>();
       /* map.put("personaName", personaName);
        map.put("parameName", parameName);*/
        map.put(PageInfo.PAGEINFO_PAGESIZE, pageSize);
        map.put(PageInfo.PAGEINFO_CURRENTPAGE, pageNo);
        
        return post("getEmployeepagelist.json", map, PageResults.class, EmployeeDto.class, EnumConnectType.SHORT);
    }
	
	
	 public PlatformResult<EmployeeDto> getEmployeeByUserName(String userName)
	    {
	        Map<String , Object> map = new HashMap<String , Object>();
	        map.put("userName", userName);
	        return post("getEmployeeByUserName.json", map, EmployeeDto.class, EnumConnectType.SHORT);
	    }
	 
	 public PlatformResult<PersonaDto> findPersonaBypersonaId(Long personaId){
		    Map<String , Object> map = new HashMap<String , Object>();
	        map.put("personaId", personaId);
	        return post("findPersonaBypersonaId.json", map, PersonaDto.class, EnumConnectType.SHORT);
	 }
	 
	 public PlatformResult<EmployeeDto> getEmployeeByCustNo(String custNo)
	    {
	        Map<String , Object> map = new HashMap<String , Object>();
	        map.put("custNo", custNo);
	        return post("getEmployeeByCustNo.json", map, EmployeeDto.class, EnumConnectType.SHORT);
	    }
	 public PlatformResult<EmployeeDto> addorUpdateEmployee(EmployeeDto dto)
	    {
	        Map<String , Object> map = new HashMap<String , Object>();
	        map.put("employeeDto", dto);
	        return post("addorUpdateEmployee.json", map, EmployeeDto.class, EnumConnectType.SHORT);
	    }
	 public void deleteEmployee(EmployeeDto dto){
		 Map<String , Object> map = new HashMap<String , Object>();
	        map.put("employeeDto", dto);
	     post("deleteEmployee.json", map, EmployeeDto.class, EnumConnectType.SHORT);     
	 }
	 
	 public void deleteEmployee_persona(Long empId){
		 Map<String , Object> map = new HashMap<String , Object>();
	       	map.put("empId", empId);
	     post("deleteEmployee_persona.json", map, Employee_personaDto.class, EnumConnectType.SHORT); 
	 }
	 public void deleteEmployee_persona2(Long employeeId){
		 Map<String , Object> map = new HashMap<String , Object>();
	       	map.put("employeeId", employeeId);
	     post("deleteEmployee_persona2.json", map, Employee_personaDto.class, EnumConnectType.SHORT); 
	 }
	 
	 public PlatformResult<Employee_personaDto> addOrUpdataEmployeePersona(Employee_personaDto dto){
		 Map<String , Object> map = new HashMap<String , Object>();
		 map.put("employee_personaDto", dto);
		return post("addOrUpdataEmployeePersona.json", map, Employee_personaDto.class, EnumConnectType.SHORT);
	 }
	@SuppressWarnings("unchecked")
	public PlatformResult<List<PersonaDto>> getAllPersona(){
		return post("getAllPersona.json",null,List.class,PersonaDto.class,EnumConnectType.SHORT);
	}

}
