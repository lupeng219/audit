package com.crdloo.audit.web.sys.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import com.crdloo.audit.client.dto.EmployeeDto;
import com.crdloo.audit.client.dto.Employee_personaDto;
import com.crdloo.audit.client.dto.PersonaDto;
import com.crdloo.audit.client.dto.Persona_powerDto;
import com.crdloo.audit.client.dto.PowerDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.web.common.enums.EmployeeExCode;
import com.crdloo.audit.web.common.enums.PersonaPowerExCode;
import com.crdloo.audit.web.common.service.BaseService;
import com.crdloo.audit.web.common.util.ConstWeb;
import com.crdloo.audit.web.support.helper.AuditEmployeeClientHelper;
import com.crdloo.audit.web.support.helper.AuditPersonaPowerClientHelper;
import com.crdloo.audit.web.sys.form.EmployeeForm;
import com.crdloo.audit.web.sys.form.PersonaForm;
import com.crdloo.audit.web.sys.form.PowerForm;
import com.crdloo.audit.web.sys.service.PersonaService;
import com.google.common.collect.Lists;
@Service("personaService")
public class PersonaServiceImpl extends BaseService implements PersonaService {

	@Override
	public List<PersonaForm> getAllPersonas() throws BizException {
		
		List<PersonaDto> allPersona = AuditEmployeeClientHelper.getAllPersona();
		if(allPersona == null){
			throw new BizException(EmployeeExCode.PERSONA_NOT_FOUND.code(),EmployeeExCode.PERSONA_NOT_FOUND.message());
		}
		List<PersonaForm> list = Lists.newArrayList();
		for (PersonaDto personaDto : allPersona) {
			list.add(new PersonaForm(personaDto));
		}
		return list;
	}

    @Override
    public List<PowerForm> getAllPower() throws BizException{
        List<PowerDto> PDtoList = AuditPersonaPowerClientHelper.getPowerDatas();
        List<PowerForm> pForm = Lists.newArrayList();
        if (CollectionUtils.isNotEmpty(PDtoList)){
            for (PowerDto dto : PDtoList){
                pForm.add(new PowerForm(dto));
            }
        }
        return pForm;
    }

    @Override
    public List<Employee_personaDto> getEmployeeIdBypersonaId(Long personaId) throws BizException {
        List<Employee_personaDto> epDto =  AuditPersonaPowerClientHelper.getEmployeeIdBypersonaId(personaId);
        if(epDto == null){
            throw new BizException(PersonaPowerExCode.EMPLOYEE_NOT_FOUND.code(),PersonaPowerExCode.EMPLOYEE_NOT_FOUND.message());
        }
        return epDto;
    }

    @Override
    public List<EmployeeForm> getEmployeeListByEmployeeIds(List<Long> ids) throws BizException {
        List<EmployeeDto> eDtoList = AuditPersonaPowerClientHelper.getEmployeeListByEmployeeIds(ids);
        List<EmployeeForm> eForm = Lists.newArrayList();
        if (CollectionUtils.isNotEmpty(eDtoList)){
            for (EmployeeDto eto : eDtoList){
                eForm.add(new EmployeeForm(eto));
            }
        }
        return eForm;
    }

    @Override
    public List<Long> getPowerIdByPersonaId(Long personaId) throws BizException{
        List<Persona_powerDto> pDtoList =  AuditPersonaPowerClientHelper.getPersonaPowerBypersonaId(personaId);
        List<Long> PowerIds = Lists.newArrayList();
        if (CollectionUtils.isNotEmpty(pDtoList)){
            for (Persona_powerDto pto : pDtoList){
                PowerIds.add(pto.getPowerId());
            }
        }
        return PowerIds;
    }

    @Override
    public List<PowerForm> getPowerByPowerId(List<Long> powerId) throws BizException{
        List<PowerDto> pDtoList =  AuditPersonaPowerClientHelper.getPowerByPowerId(powerId);
        List<PowerForm> pFormList = Lists.newArrayList();
        if (CollectionUtils.isNotEmpty(pDtoList)){
            for (PowerDto pto : pDtoList){
                pFormList.add(new PowerForm(pto));
            }
        }
        return pFormList;
    }

    @Override
    public PersonaForm getPersonaBypersonaId(Long personaId) throws BizException {
        PersonaDto pDto = AuditPersonaPowerClientHelper.getPersonaBypersonaId(personaId);
        PersonaForm pForm = new PersonaForm();
        if (pDto != null){
            pForm = new PersonaForm(pDto);
        }
        return pForm;
    }

    @Override
    public List<PowerForm> getPowerOne() throws BizException {
        List<PowerDto> pDtoList = AuditPersonaPowerClientHelper.getPowerOne();
        List<PowerForm> pFormList = Lists.newArrayList();
        if (CollectionUtils.isNotEmpty(pDtoList)){
            for (PowerDto pto : pDtoList){
                pFormList.add(new PowerForm(pto));
            }
        }
        return pFormList;
    }

    @Override
    public PersonaDto updateOraddPersonaPower(Long personaId, String personaDesc,
            String personaName, List<Long> powerIds) throws BizException {
        
        return AuditPersonaPowerClientHelper.updateOraddPersonaPower(personaId, personaDesc, personaName, powerIds);
    }

	@Override
	public Map<String, Object> addPowerInfo(PowerDto power) throws BizException{
		Map<String, Object> map = new HashMap<>();
		try {
			AuditPersonaPowerClientHelper.addPowerInfo(power);
			//redisCache.getOperations().delete(Const.MENU + 1);
	        map.put(ConstWeb.retCode, true);
	        map.put(ConstWeb.retMsg, "添加成功");
		} catch (Exception e) {
			map.put(ConstWeb.retCode, false);
		    map.put(ConstWeb.retMsg, "添加失败");
		}
        return map;
	}

    @Override
    public List<EmployeeForm> getEmployeeListBypersonaId(Long personaId) throws BizException {
        List<EmployeeDto> eDtoList = AuditPersonaPowerClientHelper.getEmployeeBypersonaId(personaId);
        List<EmployeeForm> eForm = Lists.newArrayList();
        if (CollectionUtils.isNotEmpty(eDtoList)){
            for (EmployeeDto eto : eDtoList){
                eForm.add(new EmployeeForm(eto));
            }
        }
        return eForm;
    }

    @Override
    public List<PowerForm> getPowerBypersonaId(Long personaId) throws BizException {
        List<PowerDto> pDtoList = AuditPersonaPowerClientHelper.getPowerBypersonaId(personaId);
        List<PowerForm> pForm = Lists.newArrayList();
        if (CollectionUtils.isNotEmpty(pDtoList)){
            for (PowerDto pDto : pDtoList){
                pForm.add(new PowerForm(pDto));
            }
        }
        return pForm;
    }

  


}
