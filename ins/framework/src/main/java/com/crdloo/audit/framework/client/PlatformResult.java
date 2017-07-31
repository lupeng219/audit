package com.crdloo.audit.framework.client;

import java.io.Serializable;

public class PlatformResult<T> implements Serializable {

	private static final long serialVersionUID = 727653569350417303L;

	private Integer bizCode = PlatformCode.OK;
    private String message;
    private T data;

    public PlatformResult() {
    }

    public PlatformResult(int bizCode, String message) {
        this(bizCode, message, null);
    }

    public PlatformResult(Integer bizCode, String message, T data) {
        this.bizCode = bizCode;
        this.message = message;
        this.data = data;
    }

	public Integer getBizCode() {
		return bizCode;
	}

	public void setBizCode(Integer bizCode) {
		this.bizCode = bizCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
    
	public boolean isOK() {
        return PlatformCode.OK.equals(bizCode);
    }

    @Override
    public String toString() {
        return "PlatformResult [bizCode=" + bizCode + ", message=" + message + ", data=" + data + "]";
    }
}
