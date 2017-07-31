package com.crdloo.audit.web.sys.service;

import java.util.List;
import java.util.Map;

import com.crdloo.audit.client.dto.Employee_personaDto;
import com.crdloo.audit.client.dto.PersonaDto;
import com.crdloo.audit.client.dto.PowerDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.web.sys.form.EmployeeForm;
import com.crdloo.audit.web.sys.form.PersonaForm;
import com.crdloo.audit.web.sys.form.PowerForm;

public interface PersonaService{
	 /**
     * 查询的角色列表
     * 
     * @return
     */
    public List<PersonaForm> getAllPersonas() throws BizException;
    /**
     * 得到所有的权限
     * 
     * @return
     */
    public List<PowerForm> getAllPower() throws BizException;
    
    public List<Employee_personaDto> getEmployeeIdBypersonaId(Long personaId) throws BizException;
    
    public List<EmployeeForm> getEmployeeListByEmployeeIds(List<Long> ids) throws BizException;
    
    /**
     * 根据角色id查询权限id
     */
    public List<Long> getPowerIdByPersonaId(Long personaId) throws BizException;
    
    /**
     * 根据powerid查询权限
     */
    public List<PowerForm> getPowerByPowerId(List<Long> powerId) throws BizException;
    
    public PersonaForm getPersonaBypersonaId(Long personaId) throws BizException;
    
    public List<PowerForm> getPowerOne() throws BizException;
 
    
    public PersonaDto updateOraddPersonaPower(Long personaId,String personaDesc,String personaName, List<Long> powerIds) throws BizException;

    /**
     * 添加菜单
     * 
     * @param power
     * @return
     */
    public Map<String, Object> addPowerInfo(PowerDto power) throws BizException;
    
    public List<EmployeeForm> getEmployeeListBypersonaId(Long personaId) throws BizException;
    
    public List<PowerForm> getPowerBypersonaId(Long personaId) throws BizException;
    
}


