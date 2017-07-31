package com.crdloo.audit.web.login.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.crdloo.audit.client.dto.Employee_personaDto;
import com.crdloo.audit.client.dto.Persona_powerDto;
import com.crdloo.audit.client.dto.PowerDto;
import com.crdloo.audit.web.common.service.BaseService;
import com.crdloo.audit.web.common.util.SecurityUserHolder;
import com.crdloo.audit.web.login.form.Index_MenuForm;
import com.crdloo.audit.web.login.service.LoginService;
import com.crdloo.audit.web.support.helper.AuditLoginClientHelper;
import com.crdloo.audit.web.sys.form.EmployeeForm;
import com.crdloo.audit.web.sys.service.EmployeeService;

@Service("loginService")
public class LoginServiceImpl extends BaseService implements LoginService{
  
    @Autowired
    private EmployeeService employeeService;
   

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

       logger.info(String.format("Call LoginServiceImpl#loadUserByUsername:[username = %s] ",
               username));
       EmployeeForm employee = null;
       try {
           employee =  employeeService.getEmployeeByUserName(username);
       } catch (Exception e) {
           e.printStackTrace();
       }
       if (employee == null) {
           throw new UsernameNotFoundException("用户名或密码不正确!");
       }
       
       Employee_personaDto employee_personaDto = AuditLoginClientHelper.getData(employee.getEmployeeId());
       
       if (employee_personaDto == null) {
           throw new UsernameNotFoundException("查询错误！");
       }
       employee.setPersonaId(employee_personaDto.getPersonaId());
       // 超级管理添加所有的权限
       if ("1".equals(employee.getEmployeeType())) {
           List<PowerDto> list =  AuditLoginClientHelper.getPowerTwo();
         
           List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
           GrantedAuthority ga = null;
           ga = new SimpleGrantedAuthority("ROLE_INDEX");
           authorities.add(ga);
           try {
               for (PowerDto power : list) {
                   // 给员工添加权限
                   ga = new SimpleGrantedAuthority(power.getPowerName());
                   authorities.add(ga);
               }
           } catch (Exception e) {
               e.printStackTrace();
           }
           employee.setAuthorities(authorities);
       } else {
           // 普通员工
           // 员工权限集合
           List<PowerDto> powers = null;
           List<Persona_powerDto> persona_powerDto  = AuditLoginClientHelper.getPowerId(employee_personaDto.getPersonaId());
           List<Long> powerId = new ArrayList<Long>();
           List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
           GrantedAuthority ga = null;
           ga = new SimpleGrantedAuthority("ROLE_INDEX");
           authorities.add(ga);
           if (persona_powerDto != null && !persona_powerDto.isEmpty() ){
               for (Persona_powerDto p :persona_powerDto){
                   powerId.add(p.getPowerId());
               }
               powers =AuditLoginClientHelper.getPowerByPowerId(powerId);
               try {
                   for (PowerDto power : powers) {
                       // 给员工添加权限
                       ga = new SimpleGrantedAuthority(power.getPowerName());
                       authorities.add(ga);
                   }
               } catch (Exception e) {
                   e.printStackTrace();
               }
           } 
           employee.setAuthorities(authorities);
       }
       return employee;
   
   
      
    }


    @Override
    public List<Index_MenuForm> getMenus() {
        // 首页菜单实体类
        Index_MenuForm indexMenu = null;
        // 二级菜单
        PowerDto subMenu = null;
        // 首页菜单集合，返回结果集
        List<Index_MenuForm> reuslt_list = new ArrayList<Index_MenuForm>();
        // 一级菜单
        List<PowerDto> level_one = null;
        level_one = AuditLoginClientHelper.getPowerOne();//powerRepository.getLevelOne();
        
        // 二级菜单
        List<PowerDto> level_two = null;

        level_two = AuditLoginClientHelper.getPowerTwo();
        // 临时long类型
        Long temp_long = null;
        List<PowerDto> subMenu_list = null;
        // 临时二级菜单
        PowerDto classB = null;
        // 遍历一级菜单
        for (PowerDto classA : level_one) {
            indexMenu = new Index_MenuForm();
            // 一级菜单权限
            String classA_powerName = "";
            if (level_two != null && level_two.size() > 0) {
                subMenu_list = new ArrayList<PowerDto>();
                // 遍历二级菜单
                for (int i = 0; i < level_two.size(); i++) {
                    classB = level_two.get(i);
                    // 如果等于一级菜单id
                    temp_long = classB.getParentId();
                    if (temp_long.equals(classA.getPowerId())) {
                        subMenu = new PowerDto();
                        // 菜单
                        subMenu.setMenuName(classB.getMenuName());
                        // 权限路径
                        subMenu.setPowerUrl(classB.getPowerUrl());
                        // 二级菜单权限
                        subMenu.setPowerName(classB.getPowerName());
                        // 添加二级菜单
                        subMenu_list.add(subMenu);
                        classA_powerName += level_two.get(i).getPowerName() + ",";
                    }
                }
                // 一级菜单权限
                // 去掉最后的逗号
                if (classA_powerName != null && !"".equals(classA_powerName)) {
                    classA_powerName = classA_powerName.substring(0, classA_powerName.length() - 1);
                }
                // 一级菜单的二级菜单list
                indexMenu.setSubMenuName(subMenu_list);
            }
            // 一级菜单和二级菜单组装
            indexMenu.setMenuName(classA.getMenuName());
            indexMenu.setClassName(classA.getPowerName());
            indexMenu.setPowerName(classA_powerName);
            reuslt_list.add(indexMenu);
        }

        return reuslt_list;
    
    }


    @Override
    public Authentication reLoadUserPower(EmployeeForm employee) {
        logger.info(String.format("Call LoginServiceImpl#reLoadUserPower:[EmployeeId = %s] ",
                employee.getEmployeeId()));
        Employee_personaDto employee_personaDto = AuditLoginClientHelper.getData(employee.getEmployeeId());
        if (employee_personaDto == null) {
            throw new UsernameNotFoundException("查询错误！");
        }
        employee.setPersonaId(employee_personaDto.getPersonaId());
        // 超级管理添加所有的权限
        if ("1".equals(employee.getEmployeeType())) {
            List<PowerDto> list =  AuditLoginClientHelper.getPowerTwo();
          
            List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
            GrantedAuthority ga = null;
            ga = new SimpleGrantedAuthority("ROLE_INDEX");
            authorities.add(ga);
            try {
                for (PowerDto power : list) {
                    // 给员工添加权限
                    ga = new SimpleGrantedAuthority(power.getPowerName());
                    authorities.add(ga);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            employee.setAuthorities(authorities);
        } else {
            // 普通员工
            // 员工权限集合
            List<PowerDto> powers = null;
            List<Persona_powerDto> persona_powerDto  = AuditLoginClientHelper.getPowerId(employee_personaDto.getPersonaId());
            List<Long> powerId = new ArrayList<Long>();
            List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
            GrantedAuthority ga = null;
            ga = new SimpleGrantedAuthority("ROLE_INDEX");
            authorities.add(ga);
            if (persona_powerDto != null && !persona_powerDto.isEmpty() ){
                for (Persona_powerDto p :persona_powerDto){
                    powerId.add(p.getPowerId());
                }
                powers =AuditLoginClientHelper.getPowerByPowerId(powerId);
                try {
                    for (PowerDto power : powers) {
                        // 给员工添加权限
                        ga = new SimpleGrantedAuthority(power.getPowerName());
                        authorities.add(ga);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } 
            employee.setAuthorities(authorities);
        }
        Authentication authentication = SecurityUserHolder.getAuthentication();
        return authentication;
    }

}
