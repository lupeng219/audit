package com.crdloo.audit.platform.sys.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crdloo.audit.client.dto.Employee_personaDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.framework.common.service.AbstractEntityService;
import com.crdloo.audit.platform.common.enums.ExampleExCode;
import com.crdloo.audit.platform.sys.dao.Employee_personaDao;
import com.crdloo.audit.platform.sys.dao.entity.Employee_personaEntity;
import com.crdloo.audit.platform.sys.service.EmployeePersonaServce;
import com.google.common.collect.Maps;
@Service("com.crdloo.audit.platform.login.service.impl.EmployeePersonaServceImpl")
public class EmployeePersonaServceImpl extends AbstractEntityService<Employee_personaDto, Employee_personaEntity> implements EmployeePersonaServce{

    @Resource
    private Employee_personaDao employee_personaDao;
    @Override
    public Employee_personaDto getEmployee_personaData(Long id) throws BizException {
        monitorLog.info("EmployeePersonaServceImpl-getEmployee_personaData: [id="+id+"]");
        if(id==null){
            throw new BizException(ExampleExCode.ID_IS_NULL);
        }
        Employee_personaDto dto = getDtoById(id);
        
        return dto;
    }

    @Override
    public List<Employee_personaDto> getEmployeeIdBypersonaId(Long personaId) throws BizException {
        String hql = "from Employee_personaEntity p where  p.personaId=:personaId";
        Map<String, Object> params = Maps.newHashMap();
        params.put("personaId", personaId);
        List<Employee_personaDto> result =  listDtos(hql, params);
        return result;
    }

	@Override
	public Employee_personaDto addOrUpdataEmployeePersona(Employee_personaDto dto) throws BizException {
		monitorLog.info("EmployeePersonaServceImpl-addOrUpdataEmployeePersona: [dto="+dto+"]");
		if(dto.getEmployeeId() == null || dto.getPersonaId() == null){
			throw new BizException(ExampleExCode.ID_IS_NULL);
		}
		Employee_personaDto employee_personaDto = save(dto);
		return employee_personaDto;
	}
	@Override
	public void deleteEmployee_persona(Long empId) throws BizException {
		monitorLog.info("EmployeePersonaServceImpl-deleteEmployee_persona: [empId="+empId+"]");
		if(empId == null){
			throw new BizException(ExampleExCode.ID_IS_NULL);
		}
		deleteByPK(empId);
	}


    
}
