package com.crdloo.audit.platform.common.enums;

import com.crdloo.audit.framework.common.exception.IMessageCode;

public enum BfdExCode implements IMessageCode {

	TOKEN_ID_ERR("20001" + "201", "获得token失败"),
	QUERY_DATA_ERR("20001" + "202", "查询数据失败"),
	EMPLOYEDID_IS_NULL("20001" + "203", "employeeId is null"),
	PARAMS_IS_EMPTY("20001" + "204", "调用百融接口入参为Empty"),
	CONVERT_DTO_ERR("20001" + "205", "转换DTO对象失败"),
	;
	
	private String code;
    private String message;

    private BfdExCode(String code, String message) {
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
