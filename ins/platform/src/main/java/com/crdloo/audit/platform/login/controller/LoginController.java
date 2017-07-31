package com.crdloo.audit.platform.login.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crdloo.audit.client.dto.Employee_personaDto;
import com.crdloo.audit.client.dto.Persona_powerDto;
import com.crdloo.audit.client.dto.PowerDto;
import com.crdloo.audit.framework.common.controller.BaseController;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.framework.router.utils.StringUtil;
import com.crdloo.audit.platform.common.enums.ExampleExCode;
import com.crdloo.audit.platform.common.enums.GeneralExCode;
import com.crdloo.audit.platform.sys.service.EmployeePersonaServce;
import com.crdloo.audit.platform.sys.service.Persona_powerService;
import com.crdloo.audit.platform.sys.service.PowerService;
@Controller
@RequestMapping("/login")
public class LoginController extends BaseController{
    
    @Autowired
    private EmployeePersonaServce employeePersonaServce;
    @Autowired
    private PowerService powerService;
    @Autowired
    private Persona_powerService persona_powerService; 

    @RequestMapping("/getEmployee_personaData.json")
    public void getData(HttpServletRequest request, HttpServletResponse response) throws BizException {
        Map<String, Object> map = getMap();
        if (MapUtils.isEmpty(map)) {
            throw new BizException(GeneralExCode.PARAM_IS_NULL);
        }
        Long id = StringUtil.string2Long((String)map.get("id"), 0l);
        if (id == 0 ){
            throw new BizException(ExampleExCode.ID_IS_ONE);
        }
        logger.info("getData params:[id="+id+"]");
        Employee_personaDto employee_persona = employeePersonaServce.getEmployee_personaData(id);
        returnData(request, employee_persona);
    }
    /**
     * 二级菜单
     * @param request
     * @param response
     * @throws BizException
     */
    @RequestMapping("/getPowerTwo.json")
    public void getPowerTwo(HttpServletRequest request, HttpServletResponse response) throws BizException {
       
        List<PowerDto>  powerList = powerService.getPowerDatas();
        returnData(request,powerList);
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
    
    @RequestMapping("/getPowerByPowerId.json")
    public void getPowerByPowerId(HttpServletRequest request, HttpServletResponse response) throws BizException {
        Map<String, Object> map = getMap();
        if (MapUtils.isEmpty(map)) {
            throw new BizException(GeneralExCode.PARAM_IS_NULL);
        }
        @SuppressWarnings("unchecked")
        List<Long> powerId = getParamObj("powerId", List.class, Long.class);
        List<PowerDto>  powerList = powerService.getPowerByPowerId(powerId);
        returnData(request,powerList);
    }
   
    @RequestMapping("/getPowerId.json")
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
}
