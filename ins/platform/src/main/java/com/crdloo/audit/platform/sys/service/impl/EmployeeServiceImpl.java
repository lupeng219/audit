package com.crdloo.audit.platform.sys.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crdloo.audit.client.dto.EmployeeDto;
import com.crdloo.audit.client.dto.Employee_personaDto;
import com.crdloo.audit.framework.client.PageResults;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.framework.common.service.AbstractEntityService;
import com.crdloo.audit.platform.sys.dao.EmployeeDao;
import com.crdloo.audit.platform.sys.dao.entity.EmployeeEntity;
import com.crdloo.audit.platform.sys.service.EmployeePersonaServce;
import com.crdloo.audit.platform.sys.service.EmployeeService;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
@Service("com.crdloo.audit.platform.sys.service.impl.EmployeeServiceImpl")
public class EmployeeServiceImpl extends AbstractEntityService<EmployeeDto, EmployeeEntity> implements EmployeeService{
	@Resource
	private EmployeeDao employeeDao ;
	@Autowired
	private EmployeePersonaServce employeePersonaServce;
	
	@Override
	public PageResults<EmployeeDto> getEmployeeList(Integer pageNo, Integer pageSize) throws BizException {
		monitorLog.info("ExampleSerivceImpl-getExampleDatas: [ pageNo="+pageNo+", pageSize="+pageSize+"]");
		String hql = "from EmployeeEntity e order by e.id asc";
		PageResults<EmployeeDto> result = listPage(hql, null, pageNo, pageSize);
		return result;
	}

    @Override
    public EmployeeDto getEmployeeByUserName(String userName) throws BizException {
        monitorLog.info("EmployeeServiceImpl-getEmployeeByUserName:  [userName="+userName+"]");
        String hql = "from EmployeeEntity e where  e.username=:userName";
        Map<String, Object> params = Maps.newHashMap();
        params.put("userName", userName);
        List<EmployeeDto> result =  listDtos(hql, params);
        EmployeeDto emp = null;
        if (result!=null && !result.isEmpty()){
            emp = result.get(0);
        }
        return emp;
    }
	@Override
	public EmployeeDto getEmployeeByCustNo(String custNo) throws BizException {
		monitorLog.info("EmployeeServiceImpl-getEmployeeByCustNo:  [custNo="+custNo+"]");
        String hql = "from EmployeeEntity e where  e.custNo=:custNo";
        Map<String, Object> params = Maps.newHashMap();
        params.put("custNo", custNo);
        List<EmployeeDto> result =  listDtos(hql, params);
        EmployeeDto emp = null;
        if (result!=null && !result.isEmpty()){
            emp = result.get(0);
        }
        return emp;
	}

	@Override
	public EmployeeDto addorUpdateEmployee(EmployeeDto employeeDto) throws BizException {
		monitorLog.info("EmployeeServiceImpl-addEmployee:  [EmployeeDto="+employeeDto+"]");
		EmployeeDto dto = save(employeeDto);
		return dto;
	}

	@Override
	public void deleteEmployee(EmployeeDto employeeDto) throws BizException {
		monitorLog.info("EmployeeServiceImpl-deleteEmployee:  [EmployeeDto="+employeeDto+"]");
		deleteDto(employeeDto);
	}

    @Override
    public List<EmployeeDto> getEmployeeListByEmployeeIds(List<Long> ids) throws BizException {
        monitorLog.info("EmployeeServiceImpl-getEmployeeListByEmployeeIds:  [ids="+ids+"]");
        if (CollectionUtils.isNotEmpty(ids)){
            List<EmployeeDto> employeeDtoList = listDtos(ids);
            return employeeDtoList;
        }
        return null;
    }

    @Override
    public List<EmployeeDto> getEmployeeBypersonaId(Long personaId) throws BizException {
        monitorLog.info("EmployeeServiceImpl-getEmployeeBypersonaId:  [personaId="+personaId+"]");
        List<Employee_personaDto> epDtoList = employeePersonaServce.getEmployeeIdBypersonaId(personaId);
        List<Long> employeeIds = Lists.newArrayList();
        if (CollectionUtils.isNotEmpty(epDtoList)){
            for (Employee_personaDto epDto : epDtoList){
                employeeIds.add(epDto.getEmployeeId());
          }
            List<EmployeeDto> employeeDtoList = listDtos(employeeIds);
            return employeeDtoList;
        }
        return null;
    }


}
