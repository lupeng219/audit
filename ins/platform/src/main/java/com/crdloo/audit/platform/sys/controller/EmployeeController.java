package com.crdloo.audit.platform.sys.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crdloo.audit.client.dto.EmployeeDto;
import com.crdloo.audit.client.dto.Employee_personaDto;
import com.crdloo.audit.client.dto.PersonaDto;
import com.crdloo.audit.framework.client.PageResults;
import com.crdloo.audit.framework.common.controller.BaseController;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.common.enums.GeneralExCode;
import com.crdloo.audit.platform.common.enums.PersonaExCode;
import com.crdloo.audit.platform.sys.service.EmployeePersonaServce;
import com.crdloo.audit.platform.sys.service.EmployeeService;
import com.crdloo.audit.platform.sys.service.PersonaService;

@Controller
@RequestMapping("/employee")
public class EmployeeController extends BaseController {
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private PersonaService personaService;
	@Autowired
	private EmployeePersonaServce employeePersonaServce;
	@RequestMapping("/getAllPersona.json")
	public void getAllPersona(HttpServletRequest request, HttpServletResponse response) throws BizException{
		List<PersonaDto> allPersonas = personaService.getAllPersonas();
		returnData(request, allPersonas);
	}
	@RequestMapping("/findPersonaBypersonaId.json")
	public void findPersonaBypersonaId(HttpServletRequest request, HttpServletResponse response) throws BizException{
		 Long personaId = getParam2Long("personaId");
		 PersonaDto dto = personaService.findPersonaBypersonaId(personaId);
		 returnData(request, dto);
	}
	@RequestMapping("/getEmployeepagelist.json")
	public void getEmployeePageList(HttpServletRequest request, HttpServletResponse response) throws BizException {
		Integer pageSize = getPageSize();
		Integer pageNo = getCurrentPage();
		//未用到条件
		/*String personaName = (String) map.get("personaName");
		String parameName = (String) map.get("parameName");*/
		
		PageResults<EmployeeDto> pageResult = employeeService.getEmployeeList(pageNo, pageSize);
		
		returnData(request, pageResult);
	}
	@RequestMapping("/getEmployeeByUserName.json")
    public void getEmployeeByUserName(HttpServletRequest request, HttpServletResponse response) throws BizException {
        Map<String, Object> map = getMap();
        if (MapUtils.isEmpty(map)) {
            throw new BizException(GeneralExCode.PARAM_IS_NULL);
        }
        //未用到条件
        String userName = (String) map.get("userName");
        
        EmployeeDto result = employeeService.getEmployeeByUserName(userName);
        
        returnData(request, result);
    }
	@RequestMapping("/getEmployeeByCustNo.json")
    public void getEmployeeByCustNo(HttpServletRequest request, HttpServletResponse response) throws BizException {
        Map<String, Object> map = getMap();
        if (MapUtils.isEmpty(map)) {
            throw new BizException(GeneralExCode.PARAM_IS_NULL);
        }
        String custNo = (String) map.get("custNo");
        
        EmployeeDto result = employeeService.getEmployeeByCustNo(custNo);
        
        returnData(request, result);
    }
	@RequestMapping("addorUpdateEmployee.json")
	public void addEmployee(HttpServletRequest request, HttpServletResponse response) throws BizException {
		EmployeeDto employeeDto = getParamObj("employeeDto",EmployeeDto.class);
		logger.debug("platform addEmployee param: name="+employeeDto);
		EmployeeDto dto = employeeService.addorUpdateEmployee(employeeDto);
		returnData(request, dto);
	}
	@RequestMapping("deleteEmployee.json")
	public void deleteEmployee (HttpServletRequest request, HttpServletResponse response) throws BizException{
		EmployeeDto employeeDto = getParamObj("employeeDto",EmployeeDto.class);
		logger.debug("platform deleteEmployee param: name="+employeeDto);
		employeeService.deleteEmployee(employeeDto);
		
		Employee_personaDto employee_personaData = employeePersonaServce.getEmployee_personaData(employeeDto.getEmployeeId());
		if(employee_personaData == null){
			throw new BizException(PersonaExCode.PERSONA_ISNULL_EMPL);
		}
		employeePersonaServce.deleteEmployee_persona(employee_personaData.getEmpId());
	}
	
	@RequestMapping("deleteEmployee_persona.json")
	public void deleteEmployee_persona (HttpServletRequest request, HttpServletResponse response) throws BizException{
		Long empId  =getParam2Long("empId");
		logger.debug("platform deleteEmployee_persona param: empId="+empId);
		employeePersonaServce.deleteEmployee_persona(empId);
		
	}
	/**
	 * 使用employeeID删除
	 * @param request
	 * @param response
	 * @throws BizException
	 */
	@RequestMapping("deleteEmployee_persona2.json")
	public void deleteEmployee_persona2 (HttpServletRequest request, HttpServletResponse response) throws BizException{
		Long employeeId  =getParam2Long("employeeId");
		Employee_personaDto employee_personaData = employeePersonaServce.getEmployee_personaData(employeeId);
		if(employee_personaData == null){
			throw new BizException(PersonaExCode.PERSONA_ISNULL_EMPL);
		}
		logger.debug("platform deleteEmployee_persona2 param: employeeId="+employeeId);
		employeePersonaServce.deleteEmployee_persona(employee_personaData.getEmpId());
	}
	
	
	@RequestMapping("addOrUpdataEmployeePersona.json")
	public void addEmployeePersona (HttpServletRequest request, HttpServletResponse response) throws BizException{
		Employee_personaDto employee_personaDto = getParamObj("employee_personaDto",Employee_personaDto.class);
		logger.debug("platform addEmployeePersona param: name="+employee_personaDto);
		Employee_personaDto dto = employeePersonaServce.addOrUpdataEmployeePersona(employee_personaDto);
		returnData(request,dto);
	}
	
}
