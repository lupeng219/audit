package com.crdloo.audit.framework.common.exception;

public class StatusCodeException extends Exception implements IMessageCode {

	private static final long serialVersionUID = -3829539059709808191L;
	
	private static final String DEFAULT_ERRCODE = "30000";

	private String errCode;
	
	public StatusCodeException(IMessageCode messageCode) {
        super(messageCode.message());
        setErrCode(messageCode);
    }

    public StatusCodeException(IMessageCode messageCode, Throwable cause) {
        super(messageCode.message(), cause);
        setErrCode(messageCode);
    }

    public StatusCodeException(String code, String message) {
        super(message);
        setErrCode(code);
    }

    public StatusCodeException(String message) {
        super(message);
        setErrCode(DEFAULT_ERRCODE);
    }
	
    private void setErrCode(IMessageCode messageCode) {
        setErrCode(messageCode.code());
    }

    private void setErrCode(String code) {
        this.errCode = code;
    }
    
    @Override
    public String code() {
        return errCode;
    }

    @Override
    public String message() {
        return getMessage();
    }
    
    @Override
    public String toString() {
        return "StatusCodeException [statusCode=" + errCode + ", errorMessage=" + message() + "]";
    }

}
