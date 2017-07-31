package com.crdloo.audit.web.common.enums;

import com.crdloo.audit.framework.common.exception.IMessageCode;

public enum EmployeeExCode implements IMessageCode{
    EMPLOYEE_NOT_FOUND("10000", "用户未找到"),
    PERSONA_NOT_FOUND("10002","角色信息未找到"),
	EMPLOYEE_ADD_FAIL("10003","添加员工失败");
    ;

    private String code;
    private String message;
    
    private EmployeeExCode(String code, String message){
        this.code = code;
        this.message = message;
    }
    @Override
    public String code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }

}
