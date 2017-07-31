package com.crdloo.audit.web.sys.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.crdloo.audit.client.dto.EmployeeDto;
import com.crdloo.audit.client.dto.Employee_personaDto;
import com.crdloo.audit.client.dto.PersonaDto;
import com.crdloo.audit.framework.client.PageResults;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.web.common.enums.EmployeeExCode;
import com.crdloo.audit.web.common.service.BaseService;
import com.crdloo.audit.web.common.util.ConstWeb;
import com.crdloo.audit.web.support.helper.AuditEmployeeClientHelper;
import com.crdloo.audit.web.support.helper.AuditLoginClientHelper;
import com.crdloo.audit.web.sys.form.EmployeeForm;
import com.crdloo.audit.web.sys.form.PersonaForm;
import com.crdloo.audit.web.sys.service.EmployeeService;
import com.google.common.collect.Lists;
@Service("employeeService")
public class EmployeeServiceImpl extends BaseService implements EmployeeService {
  	@Autowired
    private Md5PasswordEncoder passwordEncode;

   
	@Override
	public PageResults<EmployeeForm> getEmployeePageList(String personaName, String parameName, Integer pageNumber,
			Integer pageSize) throws BizException {
		PageResults<EmployeeForm> resultForm = null;
		PageResults<EmployeeDto> result = AuditEmployeeClientHelper.getEmployeePageList(personaName, parameName, pageNumber, pageSize);
		if(result != null){
			List<EmployeeForm> formList = Lists.newArrayList();
			List<EmployeeDto> dtoList =  result.getList();
			for (EmployeeDto employeeDto : dtoList) {
				if(employeeDto != null){
					formList.add(new EmployeeForm(employeeDto));
				}
			}
			long count = result.getTotalCount();
			resultForm = new PageResults<EmployeeForm>(formList,pageNumber,pageSize,count);
			return resultForm;
		}else{
			throw new BizException(EmployeeExCode.EMPLOYEE_NOT_FOUND);
		}
	}

    @Override
    public EmployeeForm getEmployeeByUserName(String userName) throws BizException {

        EmployeeDto EmployeeDto = AuditEmployeeClientHelper.getEmployeeByUserName(userName);
        if (EmployeeDto == null) {
            throw new BizException(EmployeeExCode.EMPLOYEE_NOT_FOUND);
        }
        EmployeeForm  employeeForm = new EmployeeForm(EmployeeDto);
        return employeeForm;
    
    }
	@Override
	public Long addEmployee(EmployeeDto employee, Long personaId) throws BizException{
		EmployeeDto temp_dto = null;
		String username = employee.getUsername();
		temp_dto=AuditEmployeeClientHelper.getEmployeeByUserName(username);
		if(temp_dto != null){
			return 0l;
		}
		Long employeeId = null;
        Long result = 1l;
        String custNo = employee.getCustNo();
        String password = employee.getPassword();
        password = passwordEncode.encodePassword(password, custNo);
        try {
        	 employee.setPassword(password);
             // 添加员工
             employee = AuditEmployeeClientHelper.addorUpdateEmployee(employee);
             employeeId = employee.getEmployeeId();
             // 添加权限
             Employee_personaDto employee_persona = new Employee_personaDto();
             employee_persona.setEmployeeId(employeeId);
             employee_persona.setPersonaId(personaId);
             AuditEmployeeClientHelper.addOrUpdataEmployeePersona(employee_persona);
		} catch (Exception e) {
			result = 0l;
			e.printStackTrace();
	        throw new BizException(EmployeeExCode.EMPLOYEE_ADD_FAIL);
		}
       
		return result;
	}

	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> updateEnable(String empStatus, String custNo) throws BizException {
		 Map<String, Object> map = new HashMap<String, Object>();
	     EmployeeDto employee = AuditEmployeeClientHelper.getEmployeeByCustNo(custNo);
	        if (employee == null) {
	            map.put(ConstWeb.retCode, false);
	            map.put(ConstWeb.retMsg, "员工不存在");
	            return map;
	        }
	        employee.setEmpStatus(empStatus);
	        AuditEmployeeClientHelper.addorUpdateEmployee(employee);
	        map.put(ConstWeb.retCode, true);
	        map.put(ConstWeb.retMsg, "更新成功!");
	        return map;
	}

	@Override
	public Map<String, Object> updatePassword(String password, String custNo) throws BizException{
		logger.info(String.format("call EmployeeServiceImpl#updatePassword:[custNo=%s]", custNo));
        logger.info("更改员工密码custNo" + custNo);
        Map<String, Object> map = new HashMap<String, Object>();
        EmployeeDto employee = AuditEmployeeClientHelper.getEmployeeByCustNo(custNo);
        if (employee == null) {
            map.put(ConstWeb.retCode, false);
            map.put(ConstWeb.retMsg, "员工不存在");
            return map;
        }
        password = passwordEncode.encodePassword(password, custNo);
        employee.setPassword(password);
        AuditEmployeeClientHelper.addorUpdateEmployee(employee);
        map.put(ConstWeb.retCode, true);
        map.put(ConstWeb.retMsg, "修改成功");
        return map;
	}

	@Override
	public Map<String, Object> getEmployeeInfo(String custNo) {
		logger.info(String.format("call EmployeeServiceImpl#getEmployeeInfo:[custNo=%s]", custNo));
		EmployeeDto employee = AuditEmployeeClientHelper.getEmployeeByCustNo(custNo);
        Map<String, Object> map = new HashMap<String, Object>();
        if (employee == null) {
            map.put(ConstWeb.retCode, false);
            map.put(ConstWeb.retMsg, "员工不存在");
            return map;
        }
        //获取角色id
        Employee_personaDto employee_personaDto = AuditLoginClientHelper.getData(employee.getEmployeeId());
        Long personaId =employee_personaDto.getPersonaId();
        if (personaId == null) {
            map.put(ConstWeb.retCode, false);
            map.put(ConstWeb.retMsg, "员工不存在");
            return map;
        }
        PersonaDto personaDto = AuditEmployeeClientHelper.findPersonaBypersonaId(personaId);
        if(personaDto==null){
        	map.put(ConstWeb.retCode, false);
            map.put(ConstWeb.retMsg, "角色信息不存在");
            return map;
        }
        PersonaForm per = new PersonaForm(personaDto);
        map.put("retCode", true);
        map.put("employee", employee);
        map.put("persona", per);
        return map;
	}

	@Override
	public Map<String, Object> deleteEmployee(String custNo) {
		logger.info(String.format("call EmployeeServiceImpl#deleteEmployee:[custNo=%s]", custNo));
        logger.info("删除员工custNo" + custNo);
        Map<String, Object> map = new HashMap<String, Object>();
        try {
        	EmployeeDto employee = AuditEmployeeClientHelper.getEmployeeByCustNo(custNo);
            if (employee == null) {
                map.put(ConstWeb.retCode, false);
                map.put(ConstWeb.retMsg, "员工不存在");
                return map;
            }
            // 删除员工表  删除员工-角色对象关系表
            AuditEmployeeClientHelper.deleteEmployee(employee);;
            map.put(ConstWeb.retCode, true);
            map.put(ConstWeb.retMsg, "删除成功!");
        } catch (Exception e) {
            map.put(ConstWeb.retCode, true);
            map.put(ConstWeb.retMsg, "删除失败");
            e.printStackTrace();
            throw e;
        }
        return map;
	}

	@Override
	public Map<String, Object> updateEmployee(EmployeeDto employee, Long personaId) {
		 logger.info(String.format("call EmployeeServiceImpl#updateEmployee:[employee=%s,personaId=%s]",employee,personaId));
	        Map<String, Object> map = new HashMap<String, Object>();
	        try {
	        	EmployeeDto temp_employee = AuditEmployeeClientHelper.getEmployeeByCustNo(employee.getCustNo());
	            if (temp_employee == null) {
	                map.put(ConstWeb.retCode, false);
	                map.put(ConstWeb.retMsg, "员工不存在");
	                return map;
	            }
	            if(!employee.getUsername().equals(temp_employee.getUsername())){
	            	EmployeeDto EmployeeDto = AuditEmployeeClientHelper.getEmployeeByUserName(employee.getUsername());
	            	if(EmployeeDto != null){
	            		map.put(ConstWeb.retCode, false);
	 	                map.put(ConstWeb.retMsg, "员工登录名重复");
	            	}
	            	
	            }
	            // 更新员工表
	            AuditEmployeeClientHelper.addorUpdateEmployee(employee);
	            // 更新员工角色关系表
	            Employee_personaDto employee_personaDto = AuditLoginClientHelper.getData(employee.getEmployeeId());
	            employee_personaDto.setPersonaId(personaId);
	            AuditEmployeeClientHelper.addOrUpdataEmployeePersona(employee_personaDto);
	            map.put(ConstWeb.retCode, true);
	            map.put(ConstWeb.retMsg, "更新成功");
	        } catch (Exception e) {
	            map.put(ConstWeb.retCode, true);
	            map.put(ConstWeb.retMsg, "更新失败");
	            e.printStackTrace();
	            throw e;
	        }
	        return map;
	}



}
