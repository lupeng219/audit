package com.crdloo.audit.web.common.enums;

import com.crdloo.audit.framework.common.exception.IMessageCode;

public enum ExampleExCode implements IMessageCode {

	EXAMPLE_NOT_FOUND("10000", "例示信息未找到"),
	CONVERT_FORM_ERR("20001" + "205", "转换form对象失败"),
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
