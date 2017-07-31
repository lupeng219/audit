package com.crdloo.audit.web.common.enums;

import com.crdloo.audit.framework.common.exception.IMessageCode;

public enum PersonaPowerExCode implements IMessageCode{
   EMPLOYEE_NOT_FOUND("11000", "根据角色id查询员工为空")
    ;

    private String code;
    private String message;
    
    private PersonaPowerExCode(String code, String message){
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
