package com.crdloo.audit.web.common.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.web.sys.form.EmployeeForm;
import com.crdloo.audit.web.sys.service.EmployeeService;



public class P2PUsernamePasswordAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    public static final String USERNAME = "userName";
    public static final String PASSWORD = "userPassword";

    @Autowired(required =false)
    public Md5PasswordEncoder passwordEncoder;
    @Autowired(required =false)
    public EmployeeService employeeService;

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request,
            HttpServletResponse response) throws AuthenticationException {
        if (!request.getMethod().equals("POST")) {
            throw new AuthenticationServiceException(
                    "Authentication method not supported: " + request.getMethod());
        }

        String userName = request.getParameter(USERNAME);
        String password = request.getParameter(PASSWORD);
        String temp_password = null;
        // 验证验证码是否正确
        // 1.先进行验证码的验
        // 2.员工是否存在
        EmployeeForm employee = null;
        try {
            employee = employeeService.getEmployeeByUserName(userName);
        } catch (BizException e) {
            e.printStackTrace();
        }
        if (employee == null) {
            throw new UsernameNotFoundException("用户不存在");
        } ;
        temp_password = passwordEncoder.encodePassword(password, employee.getCustNo());
        if (!temp_password.equals(employee.getPassword())) {
            throw new BadCredentialsException("用户密码不正确");
        }

        if (employee != null && "2".equals(employee.getEmpStatus())) {
            throw new DisabledException("该员工已经被禁用!");
        }

        UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(
                userName, password);

        setDetails(request, authRequest);
        return this.getAuthenticationManager().authenticate(authRequest);
        // 运行UserDetailsService的loadUserByUsername 再次封装Authentication
    }

}
