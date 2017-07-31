package com.crdloo.audit.web.login.service;

import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.crdloo.audit.web.login.form.Index_MenuForm;
import com.crdloo.audit.web.sys.form.EmployeeForm;

public interface LoginService extends UserDetailsService{
    /**
     * 得到员工可以展示的页面
     * 
     * @param custNo
     * @return
     */
    public List<Index_MenuForm> getMenus();
    

    /**
     * 从新加载权限
     */
    public Authentication reLoadUserPower(EmployeeForm employee);

}
