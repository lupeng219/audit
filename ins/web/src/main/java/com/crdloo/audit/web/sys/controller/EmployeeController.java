package com.crdloo.audit.web.sys.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crdloo.audit.client.dto.EmployeeDto;
import com.crdloo.audit.framework.client.PageResults;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.web.common.controller.BaseController;
import com.crdloo.audit.web.common.util.ConstWeb;
import com.crdloo.audit.web.common.util.GetUniqueNoUtil;
import com.crdloo.audit.web.common.util.PageUtil;
import com.crdloo.audit.web.sys.form.EmployeeForm;
import com.crdloo.audit.web.sys.form.PersonaForm;
import com.crdloo.audit.web.sys.service.EmployeeService;
import com.crdloo.audit.web.sys.service.PersonaService;

@Controller
@RequestMapping("/employee")
public class EmployeeController extends BaseController{
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private PersonaService personaService;
	 /**
     * 获得员工列表
     * 
     * @param model
     * @param pageNumber
     * @param pageSize
     * @param personaName
     * @param parameName
     * @return
	 * @throws BizException 
     */
    @RequestMapping("/getAllEmployees")
    public String getAllEmployees(Model model, Integer pageNumber, Integer pageSize,
            String personaName, String parameName) throws BizException {
    	logger.info("employee [get]: pageNumber=" + pageNumber + ", pageSize=" + pageSize);
    	if (pageNumber == null) {
            pageNumber = 0;
        } else {
            pageNumber--;
        }
        if (pageSize == null) {
            pageSize = 10;
        }
        PageUtil pageUtil = new PageUtil(pageSize);
        pageUtil.setPageIndex(pageNumber + 1);
        PageResults<EmployeeForm> employeePageList = employeeService.getEmployeePageList(personaName, parameName, pageNumber, pageSize);
        model.addAttribute("employeeList", employeePageList.getList());
        pageUtil.setTotalCount((int) employeePageList.getTotalCount());
        model.addAttribute("page", pageUtil);
        List<EmployeeForm> list = employeePageList.getList();
        List<PersonaForm> personas = personaService.getAllPersonas();
        model.addAttribute("personas", personas);
        return "employee/getAllEmployees";
    }
    /**
     * 添加员工
     * 
     * @param request
     * @param response
     * @param employee
     * @return
     * @throws BizException 
     */
    @RequestMapping("/addEmployee")
    @ResponseBody
    public Map<String, Object> addEmployee(HttpServletRequest request,
            @RequestParam(value = "username") String username,
            @RequestParam(value = "password") String password,
            @RequestParam(value = "realName") String realName,
            @RequestParam(value = "employIDCardNum") String employIDCardNum,
            @RequestParam(value = "phone") String phone,
            @RequestParam(value = "personaId") Long personaId) throws BizException {
        Map<String, Object> map = new HashMap<String, Object>();
        if (StringUtils.isEmpty(username) && StringUtils.isEmpty(realName)) {
            map.put(ConstWeb.retCode, false);
            map.put(ConstWeb.retMsg, "登录名或真实姓名不能为空");
            return map;
        }
        EmployeeDto employee = new EmployeeDto();
        Long result = null;
        String custNo = GetUniqueNoUtil.getCustNo();
        employee.setUsername(username);
        employee.setPassword(password);
        employee.setRealName(realName);
        employee.setEmployIDCardNum(employIDCardNum);
        employee.setPhone(phone);
        employee.setEmpRegTime(new Date());
        // 可用
        employee.setEmpStatus("1");
        // 普通员工
        employee.setEmployeeType("2");
        employee.setCustNo(custNo);
        result = employeeService.addEmployee(employee, personaId);
        if (result.equals(0l)) {
            map.put(ConstWeb.retCode, Boolean.FALSE);
            map.put(ConstWeb.retMsg, "该员工已经存在!");
            return map;
        }
        map.put(ConstWeb.retCode, Boolean.TRUE);
        map.put(ConstWeb.retMsg, "添加成功!");
        return map;
    }
    /**
     * 更新员工状态
     * 
     * @param request
     * @param empStatus
     * @param custNo
     * @return
     * @throws BizException 
     */
    @RequestMapping("/updateEmpState")
    @ResponseBody
    public Map<String, Object> updateEmpState(HttpServletRequest request,
            @RequestParam(value = "empStatus") String empStatus,
            @RequestParam(value = "custNo") String custNo) throws BizException {
        Map<String, Object> map = new HashMap<String, Object>();
        map = employeeService.updateEnable(empStatus, custNo);
        return map;
    }
    /**
     * 更新密码
     * 
     * @param request
     * @param password
     * @param custNo
     * @return
     * @throws BizException 
     */
    @RequestMapping("/updatePassword")
    @ResponseBody
    public Map<String, Object> updatePassword(HttpServletRequest request,
            @RequestParam(value = "password") String password,
            @RequestParam(value = "repassword") String repassword,
            @RequestParam(value = "custNo") String custNo) throws BizException {
        Map<String, Object> map = new HashMap<String, Object>();
        if (StringUtils.isEmpty(password)) {
            map.put(ConstWeb.retCode, false);
            map.put(ConstWeb.retMsg, "新密码不能为空!");
            return map;
        } ;
        if (password.length() < 4 || password.length() > 16) {
            map.put(ConstWeb.retCode, false);
            map.put(ConstWeb.retMsg, "密码在4-16位之间!");
            return map;
        } ;
        if (StringUtils.isEmpty(repassword)) {
            map.put(ConstWeb.retCode, false);
            map.put(ConstWeb.retMsg, "重复密码不能为空!");
            return map;
        } ;
        if (!password.equals(repassword)) {
            map.put("retCode", false);
            map.put("retMsg", "两次密码不相等!");
            return map;
        } ;
        return employeeService.updatePassword(repassword, custNo);

    }
    /**
     * 删除员工
     * 
     * @param custNo
     * @return
     */
    @RequestMapping("/deleteEmployee")
    @ResponseBody
    public Map<String, Object> deleteEmployee(String custNo) {
        return employeeService.deleteEmployee(custNo);
    }
    
    /**
     * 得到管理员的详细信息
     * 
     * @param custNo
     * @return
     */
    @RequestMapping("/getEmployeeInfo")
    @ResponseBody
    public Map<String, Object> getEmployeeInfo(String custNo) {
        return employeeService.getEmployeeInfo(custNo);
    }
    
    /**
     * 更新员工
     * 
     * @param request
     * @param username
     * @param password
     * @param realName
     * @param employIDCardNum
     * @param phone
     * @param personaId
     * @return
     */
    @RequestMapping("/updateEmployee")
    @ResponseBody
    public Map<String, Object> updateEmployee(HttpServletRequest request,
            @RequestParam(value = "username") String username,
            @RequestParam(value = "realName") String realName,
            @RequestParam(value = "employIDCardNum") String employIDCardNum,
            @RequestParam(value = "phone") String phone,
            @RequestParam(value = "personaId") Long personaId,
            @RequestParam(value = "employeeId") Long employeeId,
            //添加入参
    		@RequestParam(value = "custNo") String custNo) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (StringUtils.isEmpty(username) && StringUtils.isEmpty(realName)) {
            map.put(ConstWeb.retCode, false);
            map.put(ConstWeb.retMsg, "登录名或真实姓名不能为空");
            return map;
        }
        if(custNo == null){
        	map.put(ConstWeb.retCode, false);
            map.put(ConstWeb.retMsg, "custNo参数不能为空");
            return map;
        }
        EmployeeDto employee = new EmployeeDto();
        employee.setCustNo(custNo);
        employee.setUsername(username);
        employee.setRealName(realName);
        employee.setEmployIDCardNum(employIDCardNum);
        employee.setPhone(phone);
        employee.setEmployeeId(employeeId);
        if (personaId == 1) {
            employee.setEmployeeType("1");
        } else {
            employee.setEmployeeType("2");
        }
        return employeeService.updateEmployee(employee, personaId);

    }
	
	
}
