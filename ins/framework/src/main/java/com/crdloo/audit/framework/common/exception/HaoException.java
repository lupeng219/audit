package com.crdloo.audit.framework.common.exception;

public class HaoException extends RuntimeException implements IMessageCode {

	private static final long serialVersionUID = 8753445030871314956L;

	private static final String DEFAULT_ERRCODE = "10000";
	
	private String errCode;
	
	public HaoException(IMessageCode messageCode) {
        super(messageCode.message());
        setErrCode(messageCode);
    }
	
	public HaoException(String message) {
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
	
}
