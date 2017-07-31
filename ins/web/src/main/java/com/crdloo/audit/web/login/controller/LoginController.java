package com.crdloo.audit.web.login.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.web.authentication.session.SessionAuthenticationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crdloo.audit.web.common.controller.BaseController;
import com.crdloo.audit.web.common.util.Const;
import com.crdloo.audit.web.common.util.SecurityUserHolder;
import com.crdloo.audit.web.login.form.Index_MenuForm;
import com.crdloo.audit.web.login.service.LoginService;
import com.crdloo.audit.web.sys.form.EmployeeForm;
@Controller
@RequestMapping("/login")
public class LoginController extends BaseController{

    
    @Autowired
    private LoginService loginService;
    
    @Resource(name = "redisTemplate")
    protected ValueOperations<String, List<Index_MenuForm>> Index_MenuCache;
    @Resource(name = "redisTemplate")
    protected ValueOperations<String, String> redis;
    @RequestMapping("/toLogin")
    public String logs(HttpServletRequest request) {
        return "login/login";

    }
    /**
     * 登陆成功进行处理的方法
     * 
     * @param request
     * @return
     */
    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        return "login/index";

    }
    /**
     * 登陆成功进行处理的方法
     * 
     * @param request
     * @return
     */
    @RequestMapping("/loginSucc")
    @ResponseBody
    public Map<String, Object> loginSucc(HttpServletRequest request) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("retCode", true);
        result.put("retMsg", "\u767b\u5f55\u6210\u529f");
        HttpSession session = request.getSession();
        EmployeeForm employee = SecurityUserHolder.getCurrentUser();
        session.setAttribute("currentUser", employee);
        return result;
    }
    /**
     * 登陆成功进行处理的方法
     * 
     * @param request
     * @return
     */
    @RequestMapping("/menu")
    public String menu(HttpServletRequest request,Model model) {
        // 查询所有的员工权限
        EmployeeForm employee = SecurityUserHolder.getCurrentUser();
        List<Index_MenuForm> result = null;
//        Index_MenuCache.getOperations().delete(Const.MENU + employee.getPersonaId());
        result = Index_MenuCache.get(Const.MENU + employee.getPersonaId());
        if (result == null) {
            result = loginService.getMenus();
            Index_MenuCache.set(Const.MENU + employee.getPersonaId(), result,7,TimeUnit.DAYS);
        }
        model.addAttribute("result", result);
        return "common/menu";
    }

    @RequestMapping("/loginFail")
    @ResponseBody
    public Map<String, Object> loginFail(HttpServletRequest request) {
        Map<String, Object> result = new HashMap<String, Object>();
        HttpSession session = request.getSession();
        Exception exception = (Exception) session.getAttribute("SPRING_SECURITY_LAST_EXCEPTION");
        String msg = null;
        if (exception != null) {
            msg = exception.getMessage();
            // 只能有一个账户进行登陆
            if (exception instanceof SessionAuthenticationException) {
                // 您已经登录，不能重复登录
                msg = "\u60a8\u5df2\u7ecf\u767b\u5f55\uff0c\u4e0d\u80fd\u91cd\u590d\u767b\u5f55";
            } else if (exception instanceof LockedException) {
                // 您的账户已被冻结，请联系平台客服
                msg = "\u60a8\u7684\u8d26\u6237\u5df2\u88ab\u51bb\u7ed3\uff0c\u8bf7\u8054\u7cfb\u5e73\u53f0\u5ba2\u670d";
            }
        } else {
            // 用户名或密码错误
            msg = "\u7528\u6237\u540d\u6216\u5bc6\u7801\u9519\u8bef";
        }
        result.put("retCode", false);
        result.put("retMsg", msg);
        return result;
    }

    /**
     * 未登录
     * 
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("/unSecurity")
    public String unSecurity(HttpServletRequest request, HttpServletResponse response,
            ModelMap model) {
        String isAjax = request.getParameter("isAjax");
        if (isAjax != null ) {
            Map<String, Object> result = new HashMap<String, Object>();
            result.put("msg", "0000");
            result.put("success", "您还没有登陆");
            try {
                writeMessageUtf8(response, result);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            return "/login/login";
        }
        return "/login/login";
    }
}
