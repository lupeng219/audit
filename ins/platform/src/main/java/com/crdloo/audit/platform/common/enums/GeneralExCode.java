package com.crdloo.audit.platform.common.enums;

import com.crdloo.audit.framework.common.exception.IMessageCode;

public enum GeneralExCode implements IMessageCode {

	PARAM_IS_NULL("-1", "参数map为空"),
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
    
}
