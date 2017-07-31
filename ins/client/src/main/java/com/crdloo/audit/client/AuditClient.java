package com.crdloo.audit.client;


import com.crdloo.audit.client.service.AntifraudService;
import com.crdloo.audit.client.service.CreditEvaluationService;
import com.crdloo.audit.client.service.EmployeeService;
import com.crdloo.audit.client.service.ExampleService;
import com.crdloo.audit.client.service.InformationService;
import com.crdloo.audit.client.service.LoginService;
import com.crdloo.audit.client.service.PersonaPowerService;
import com.crdloo.audit.client.service.RuleService;
import com.crdloo.audit.framework.client.router.RouterHelper;
import com.crdloo.audit.framework.router.Router;

public class AuditClient {

	private static final String PROJECT_NAME = "ins-audit-platform";
	
	private static ExampleService exampleService = null;
	
	private static EmployeeService employeeService = null;
	
	private static LoginService loginService = null;
	
	private static PersonaPowerService personaPowerService = null;
	
	private static RuleService  ruleService = null;

	private static InformationService informationService = null;

	private static CreditEvaluationService creditEvaluationService = null;
	
	private static AntifraudService antifraudService = null;
	

	static
    {
        final Router router = RouterHelper.getInstance(PROJECT_NAME);
        exampleService = new ExampleService(router);
        employeeService =new EmployeeService(router);
        loginService = new LoginService(router);
        personaPowerService = new PersonaPowerService(router);
        ruleService = new RuleService(router);
        informationService = new InformationService(router);
        creditEvaluationService = new CreditEvaluationService(router);
        antifraudService = new AntifraudService(router);
    }
	public static CreditEvaluationService getCreditEvaluationService(){
		return creditEvaluationService;
	}
	
	public static ExampleService getExampleService() {
		return exampleService;
	}
	public static EmployeeService getEmployeeService(){
		return employeeService;
	}
	public static LoginService getLoginService(){
	    return loginService;
	}
	public static PersonaPowerService getPersonaPowerService(){
        return personaPowerService;
    }
	public static RuleService getRuleService(){
        return ruleService;
    }
	public static InformationService getInformationService(){
	    return informationService;
	}
	public static AntifraudService getAntifraudService(){
        return antifraudService;
    }
}
