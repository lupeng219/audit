package com.crdloo.audit.platform.common.enums;

import com.crdloo.audit.framework.common.exception.IMessageCode;

public enum ExampleExCode implements IMessageCode {

	ID_IS_NULL("20001" + "101", "id参数为空"),
	TAG_IS_NULL("20001" + "102", "tag参数为空"),
	ID_IS_ONE("20001" + "103", "ID参数为1"),
	;
	
	private String code;
    private String message;

    private ExampleExCode(String code, String message) {
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
