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
import com.crdloo.audit.client.dto.Persona_powerDto;
import com.crdloo.audit.client.dto.PowerDto;
import com.crdloo.audit.framework.common.controller.BaseController;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.framework.router.utils.StringUtil;
import com.crdloo.audit.platform.common.enums.ExampleExCode;
import com.crdloo.audit.platform.common.enums.GeneralExCode;
import com.crdloo.audit.platform.sys.service.EmployeePersonaServce;
import com.crdloo.audit.platform.sys.service.EmployeeService;
import com.crdloo.audit.platform.sys.service.PersonaService;
import com.crdloo.audit.platform.sys.service.Persona_powerService;
import com.crdloo.audit.platform.sys.service.PowerService;

@Controller
@RequestMapping("personaPower")
public class PersonaPowerController extends BaseController{
    
    @Autowired
    private PowerService powerService;
    @Autowired
    private EmployeePersonaServce employeePersonaServce;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private Persona_powerService persona_powerService;
    @Autowired
    private PersonaService personaService; 
    
    
    
    @RequestMapping("/getPowerDatas.json")
    public void getAllPersona(HttpServletRequest request, HttpServletResponse response) throws BizException{
        List<PowerDto> allPersonas = powerService.getPowerDatas();
        returnData(request, allPersonas);
    }
    
    @RequestMapping("/getEmployeeIdBypersonaId.json")
    public void fingEmployeeIdBypersonaId(HttpServletRequest request, HttpServletResponse response) throws BizException{
        Map<String, Object> map = getMap();
        if (MapUtils.isEmpty(map)) {
            throw new BizException(GeneralExCode.PARAM_IS_NULL);
        }
        Long personaId = StringUtil.string2Long((String)map.get("personaId"));
        List<Employee_personaDto> allPersonas = employeePersonaServce.getEmployeeIdBypersonaId(personaId);
        returnData(request, allPersonas);
    }
    
    @RequestMapping("/getEmployeeListByEmployeeIds.json")
    public void getEmployeeListByEmployeeIds(HttpServletRequest request, HttpServletResponse response) throws BizException{
        Map<String, Object> map = getMap();
        if (MapUtils.isEmpty(map)) {
            throw new BizException(GeneralExCode.PARAM_IS_NULL);
        }
        List<Long> ids = getParamObj("ids", List.class, Long.class);
        List<EmployeeDto> allPersonas = employeeService.getEmployeeListByEmployeeIds(ids);
        returnData(request, allPersonas);
    }
    @RequestMapping("/getPersonaPowerBypersonaId.json")
    public void getPowerId(HttpServletRequest request, HttpServletResponse response) throws BizException {
        Map<String, Object> map = getMap();
        if (MapUtils.isEmpty(map)) {
            throw new BizException(GeneralExCode.PARAM_IS_NULL);
        }
        Long id = StringUtil.string2Long((String)map.get("personaId"), 0l);
        if (id == 0 ){
            throw new BizException(ExampleExCode.ID_IS_ONE);
        }
        
        List<Persona_powerDto>  powerList = persona_powerService.getPersonaPowerBypersonaId(id);
        returnData(request,powerList);
    }
    @RequestMapping("/getPowerByPowerId.json")
    public void getPowerByPowerId(HttpServletRequest request, HttpServletResponse response) throws BizException {
        Map<String, Object> map = getMap();
        if (MapUtils.isEmpty(map)) {
            throw new BizException(GeneralExCode.PARAM_IS_NULL);
        }
        List<Long> powerIds = getParamObj("powerId", List.class, Long.class);
        List<PowerDto>  powerList = powerService.getPowerByPowerId(powerIds);
        returnData(request,powerList);
    }
    @RequestMapping("/getPersonaBypersonaId.json")
    public void getPersonaBypersonaId(HttpServletRequest request, HttpServletResponse response) throws BizException{
         Map<String, Object> map = getMap();
         Long personaId = StringUtil.string2Long((String)map.get("personaId"), 0l);
         PersonaDto dto = personaService.findPersonaBypersonaId(personaId);
         returnData(request, dto);
    }
    /**
     * 一级菜单
     * @param request
     * @param response
     * @throws BizException
     */
    @RequestMapping("/getPowerOne.json")
    public void getPowerOne(HttpServletRequest request, HttpServletResponse response) throws BizException {
       
        List<PowerDto>  powerList = powerService.getLevelOne();
        returnData(request,powerList);
    }
    @RequestMapping("/addPowerInfo.json")
    public void addPowerInfo(HttpServletRequest request, HttpServletResponse response) throws BizException {
    	PowerDto dto = getParamObj("power", PowerDto.class);
    	logger.debug("platform addPowerInfo param: power="+dto);
        PowerDto addPowerInfo = powerService.addPowerInfo(dto);
        returnData(request,addPowerInfo);
    }
    
    @RequestMapping("/updateOraddPersonaPower.json")
    public void updateOraddPersonaPower(HttpServletRequest request, HttpServletResponse response) throws BizException{
         Map<String, Object> map = getMap();
         List<Long> powerIds = getParamObj("powerIds",List.class,Long.class);
         String personaDesc =(String)map.get("personaDesc");
         String personaName =(String)map.get("personaName");
         Long personaId = StringUtil.string2Long((String)map.get("personaId"));
         persona_powerService.updateOraddPersonaPower(personaId, personaDesc, personaName, powerIds);
         PersonaDto dto = new PersonaDto();
         returnData(request,dto);
    }
    
    @RequestMapping("/getEmployeeBypersonaId.json")
    public void getEmployeeBypersonaId(HttpServletRequest request, HttpServletResponse response) throws BizException{
        Map<String, Object> map = getMap();
        if (MapUtils.isEmpty(map)) {
            throw new BizException(GeneralExCode.PARAM_IS_NULL);
        }
        Long personaId = StringUtil.string2Long((String)map.get("personaId"));
        List<EmployeeDto> allPersonas = employeeService.getEmployeeBypersonaId(personaId);
        returnData(request, allPersonas);
    }
    @RequestMapping("/getPowerBypersonaId.json")
    public void getPowerBypersonaId(HttpServletRequest request, HttpServletResponse response) throws BizException{
        Map<String, Object> map = getMap();
        if (MapUtils.isEmpty(map)) {
            throw new BizException(GeneralExCode.PARAM_IS_NULL);
        }
        Long personaId = StringUtil.string2Long((String)map.get("personaId"));
        List<PowerDto> allPersonas = powerService.getPowerBypersonaId(personaId);
        returnData(request, allPersonas);
    }
}
