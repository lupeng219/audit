package com.crdloo.audit.platform.sys.service;

import java.util.List;

import com.crdloo.audit.client.dto.EmployeeDto;
import com.crdloo.audit.framework.client.PageResults;
import com.crdloo.audit.framework.common.exception.BizException;

public interface EmployeeService {
	public PageResults<EmployeeDto> getEmployeeList(Integer pageNo, Integer pageSize) throws BizException;
	
	public EmployeeDto getEmployeeByUserName(String userName) throws BizException;
	
	public EmployeeDto getEmployeeByCustNo(String custNo) throws BizException;
	
	public EmployeeDto addorUpdateEmployee(EmployeeDto employeeDto) throws BizException;
	 
	public void deleteEmployee(EmployeeDto employeeDto) throws BizException;
	
	public List<EmployeeDto> getEmployeeListByEmployeeIds(List<Long> ids) throws BizException;
	
	public List<EmployeeDto> getEmployeeBypersonaId(Long personaId) throws BizException;
}
