package com.crdloo.audit.web.common.enums;

import com.crdloo.audit.framework.common.exception.IMessageCode;

public enum ExportPdfExCode implements IMessageCode {

	TEMPLATE_NAME_ISNULL("90001", "模版文件名为空"),
	TEMPLATE_NOT_FOUND("90002", "模版文件未找到"),
	HTML_PROCESS_ERROR("90003", "HTML生成失败"),
	HTML_IS_BLANK("90004", "HTML内容为空"),
	PDF_MAKE_ERROR("90005", "PDF生成失败"),
	;
	
	private String code;
    private String message;

    private ExportPdfExCode(String code, String message) {
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
