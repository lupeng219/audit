package com.crdloo.audit.web.sys.service;

import java.util.Map;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.crdloo.audit.client.dto.EmployeeDto;
import com.crdloo.audit.framework.client.PageResults;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.web.sys.form.EmployeeForm;

public interface EmployeeService  extends UserDetailsService{
	public PageResults<EmployeeForm> getEmployeePageList(String personaName, String parameName,
			Integer pageNumber, Integer pageSize) throws BizException;
	public EmployeeForm getEmployeeByUserName(String userName) throws BizException;
	
	public Long addEmployee(EmployeeDto employee, Long personaId) throws BizException;
	
	 public Map<String, Object> updateEnable(String empStatus, String custNo) throws BizException;
	 /**
     * 更改员工密码
     * 
     * @param custNo
     * @return
     */
	 public Map<String, Object> updatePassword(String password, String custNo) throws BizException;
	 /**
     * 得到员工详细信息
     * 
     * @param custNo
     * @return
     */
    public Map<String, Object> getEmployeeInfo(String custNo);
    /**
     * 删除员工
     * 
     * @param custNo
     * @return
     */
    public Map<String, Object> deleteEmployee(String custNo);
	 
    /**
     * 更新员工信息
     * 
     * @param custNo
     * @return
     */
    public Map<String, Object> updateEmployee(EmployeeDto employee, Long personaId); 
	 
	 
}


