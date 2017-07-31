package com.crdloo.audit.web.common.enums;

import com.crdloo.audit.framework.common.exception.IMessageCode;

public enum GeneralExCode implements IMessageCode {

	SYS_ERROR("00000", "系统异常"),
	USER_NOT_LOGIN("00001", "用户未登录"),
	NO_QUERY_RESULTS("00002", "没有查询到结果"),
	;
	
	private String code;
    private String message;

    private GeneralExCode(String code, String message) {
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
	
    public static GeneralExCode getEnum(String code) {
        for (GeneralExCode e : GeneralExCode.values()) {
            if (e.code().equals(code)) {
                return e;
            }
        }
        return null;
    }
}
