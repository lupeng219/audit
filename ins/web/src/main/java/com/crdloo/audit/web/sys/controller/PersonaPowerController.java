package com.crdloo.audit.web.sys.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crdloo.audit.client.dto.PowerDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.web.common.controller.BaseController;
import com.crdloo.audit.web.common.util.Const;
import com.crdloo.audit.web.common.util.SecurityUserHolder;
import com.crdloo.audit.web.login.form.Index_MenuForm;
import com.crdloo.audit.web.login.service.LoginService;
import com.crdloo.audit.web.sys.form.EmployeeForm;
import com.crdloo.audit.web.sys.form.PersonaForm;
import com.crdloo.audit.web.sys.form.PowerForm;
import com.crdloo.audit.web.sys.service.PersonaService;
@Controller
@RequestMapping("/persona")
public class PersonaPowerController  extends BaseController{
    
    @Autowired
    private PersonaService personaService;
    @Autowired
    private LoginService loginService;
    
    @Resource(name = "redisTemplate")
    protected ValueOperations<String, List<Index_MenuForm>> Index_MenuCache;

    /**
     * 角色权限详情
     * 
     * @param request
     * @param personaId
     * @return
     */
    @RequestMapping("/getPersonaDetails")
    public String getPersonaDetails(HttpServletRequest request,
            @RequestParam(value = "personaId", required = false) Long personaId) throws BizException{
        
        logger.info(String.format(" call getPersonaDetails +++#personaId :  %s]", personaId));
        List<PersonaForm>  allPersonas = personaService.getAllPersonas();
        request.setAttribute("allPersonas", allPersonas);
        // 角色成员列表
        List<EmployeeForm> allEmployee = null;
        // 角色对应的权限
        List<PowerForm> persona_powers = null;
        // 所有权限查询
        List<PowerForm> allPowers = new ArrayList<>();
        // 角色信息
        PersonaForm p2p_persona = null;
        // 得到所有的权限
        allPowers = personaService.getAllPower();
        if (personaId != null) {
        allEmployee = personaService.getEmployeeListBypersonaId(personaId);
        request.setAttribute("allEmployee", allEmployee);
        persona_powers = personaService.getPowerBypersonaId(personaId);
        request.setAttribute("persona_powers", persona_powers);
        p2p_persona = personaService.getPersonaBypersonaId(personaId);
        request.setAttribute("p2p_persona", p2p_persona);
        }
        List<PowerForm> list1 = personaService.getPowerOne();
        // 查询所有权限信息
        // 一级权限放入list1,二级权限放入list2
        allPowers = getNewList(allPowers, persona_powers);
        request.setAttribute("allPowers", allPowers);
        request.setAttribute("list1", list1);
        request.setAttribute("personaId", personaId);
        return "power/toPowerIndex";
    
    }
    public List<PowerForm> getNewList(List<PowerForm> allPowers, List<PowerForm> persona_powers) {
        List<PowerForm> result = new ArrayList<PowerForm>();
        Long powerId = null;
        for (PowerForm powerA : allPowers) {
            powerId = powerA.getPowerId();
            if (persona_powers != null) {
                for (PowerForm powerB : persona_powers) {
                    if (powerId.equals(powerB.getPowerId())) {
                        powerA.setTempStr("1");
                        break;
                    }
                }
            }
            result.add(powerA);
        }
        return result;
    }
    /**
     * 添加或者保存角色
     * 
     * @param request
     * @param personId
     * @param powerIds
     * @param personaName
     * @param personaDesc
     * @return
     */
    @RequestMapping("/savaOrUpdatePersona")
    @ResponseBody
    public Map<String, Object> savaOrUpdatePersona(HttpServletRequest request,
            @RequestParam(value = "personId", required = false) Long personId,
            @RequestParam(value = "powerIds[]", required = false)  List<Long> powerIds,
            @RequestParam(value = "personaName", required = false) String personaName,
            @RequestParam(value = "personaDesc", required = false) String personaDesc) throws BizException {


        Map<String, Object> map = new HashMap<String, Object>();
        map.put("retCode", true);
        if (personaName == null ) {
            map.put(Const.retCode, false);
            map.put(Const.retMsg, "角色名称不能为空");
            return map;
        }
        if (personId != null && personId == 1) {
            return map;
        } else {
            if (personId != null){
                // 更新用户权限
                List<Index_MenuForm> result = null;
                result = Index_MenuCache.get(Const.MENU + personId);
                if (result != null) {
                    Index_MenuCache.getOperations().delete(Const.MENU + personId);
                }
            }
            personaService.updateOraddPersonaPower(personId, personaDesc, personaName, powerIds);
            EmployeeForm employeeData = SecurityUserHolder.getCurrentUser();
            if (personId != null) {
                if (personId.equals(employeeData.getPersonaId())) {
                    SecurityUserHolder
                            .setAuthentication(loginService.reLoadUserPower(employeeData));
                }
            }
        }
        return map;
    }
    
    
    /**
     * 添加菜单
     * @throws BizException 
     */
    @RequestMapping("addPower")
    public String addPower(HttpServletRequest request) throws BizException {
    	List<PowerForm> list1 = personaService.getPowerOne();
        request.setAttribute("power", list1);
        return "power/addPower";
    }
    /**
     * 保存添加菜单信息
     * @throws BizException 
     */
    @RequestMapping("addPowerInfoTwo")
    @ResponseBody
    public Map<String, Object> addPowerInfoTwo(HttpServletRequest request, String powerUrl,
            String powerName, String menuName, Long powerId) throws BizException {
    	PowerDto power = new PowerDto();
        power.setMenuName(menuName);
        power.setParentId(powerId);
        power.setPowerName(powerName);
        power.setPowerUrl(powerUrl);
        return personaService.addPowerInfo(power);
    }

    /**
     * 保存添加菜单信息
     * @throws BizException 
     */
    @RequestMapping("addPowerInfo")
    @ResponseBody
    public Map<String, Object> addPowerInfo(HttpServletRequest request, String powerName,
            String menuName) throws BizException {
    	PowerDto power = new PowerDto();
        power.setMenuName(menuName);
        power.setPowerName(powerName);
        return personaService.addPowerInfo(power);
    }
    
    
    
}
