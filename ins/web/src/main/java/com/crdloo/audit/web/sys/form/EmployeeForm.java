package com.crdloo.audit.web.sys.form;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.crdloo.audit.client.dto.EmployeeDto;
public class EmployeeForm implements Serializable , UserDetails {

    private static final long serialVersionUID = 1L;
    private Long employeeId;// 员工id
    private String custNo;// 员工号
    private String username;// 员工登录账号
    private String password;// 员工登录密码
    private String realName;// 员工姓名
    private String qq;// 员工QQ
    private String telephone;// 员工办公电话
    private String position;// 员工职位
    private String sex;// 员工性别
    private String email;// 员工邮箱
    private String phone;// 员工手机号
    private String employIDCardNum;// 员工身份证
    private Date empRegTime;// 注册时间
    private Date lastLoginTime;// 最后登录时间
    private String empStatus;// 员工账号状态
    private String employeeType;// 主要用于区别admin

    private Long personaId;// 临时角色id字段

    private boolean enabled = true;// 默认注册成功后可用
    private boolean accountNonExpired = true;// 用户是否过期
    private boolean accountNonLocked = true;// 用户是否锁定
    private boolean credentialsNonExpired = true;// 用户证书是否有效
    private Collection<GrantedAuthority> authorities;// 用户证书是否有效

    public EmployeeForm(){
        
    }
    public EmployeeForm(EmployeeDto dto) {
          this.employeeId = dto.getEmployeeId();
          this.custNo = dto.getCustNo();
          this.username = dto.getUsername();
          this.password = dto.getPassword();
          this.realName = dto.getRealName();
          this.qq = dto.getQq();
          this.telephone = dto.getTelephone();
          this.position = dto.getPosition();
          this.sex = dto.getSex();
          this.email = dto.getEmail();
          this.phone = dto.getPhone();
          this.employIDCardNum = dto.getEmployIDCardNum();
          this.empRegTime = dto.getEmpRegTime();
          this.lastLoginTime = dto.getLastLoginTime();
          this.empStatus = dto.getEmpStatus();
          this.employeeType = dto.getEmployeeType();
      }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        if ("1".equals(empStatus)) {
            return true;
        }
        return false;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmployIDCardNum() {
        return employIDCardNum;
    }

    public void setEmployIDCardNum(String employIDCardNum) {
        this.employIDCardNum = employIDCardNum;
    }

    public Date getEmpRegTime() {
        return empRegTime;
    }

    public void setEmpRegTime(Date empRegTime) {
        this.empRegTime = empRegTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(String empStatus) {
        this.empStatus = empStatus;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public void setAuthorities(Collection<GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public Long getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Long personaId) {
        this.personaId = personaId;
    }

    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof EmployeeForm) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.custNo.hashCode() + 29 * 100;
    }
}
