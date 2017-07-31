package com.crdloo.audit.framework.common.exception;

public enum SystemMessageCode implements IMessageCode {

	SYS_00000("10000", "系统错误!"),
	
	BIZ_00000("20000", "平台错误!"),
	BIZ_00001("20001", "服务层convertor is null"),
	
	SCE_00000("30000", "状态错误!"),
	SCE_00001("30001", "请求参数为空"),
	SCE_00002("30002", "缺少view_id"),
	SCE_00003("30003", "缺少client_id"),
	SCE_00004("30004", "缺少data"),
	;
	
	private String code;
    private String message;

    private SystemMessageCode(String code, String message) {
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
