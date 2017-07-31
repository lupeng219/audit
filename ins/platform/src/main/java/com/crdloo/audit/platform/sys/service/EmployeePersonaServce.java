package com.crdloo.audit.platform.sys.service;

import java.util.List;

import com.crdloo.audit.client.dto.Employee_personaDto;
import com.crdloo.audit.framework.common.exception.BizException;

public interface EmployeePersonaServce {

    public Employee_personaDto getEmployee_personaData(Long id) throws BizException;
    

    public List<Employee_personaDto> getEmployeeIdBypersonaId(Long personaId) throws BizException;

    public Employee_personaDto addOrUpdataEmployeePersona(Employee_personaDto dto)throws BizException;
    
    public void deleteEmployee_persona(Long empId)throws BizException;

}
