package com.crdloo.audit.platform.common.hao.bfd;

import java.io.Serializable;

public class BfdResult<T> implements Serializable {

	private static final long serialVersionUID = -1953933916465402948L;

	private String code;
	private String swift_number;
    private T data;
    
    public BfdResult() {
    }
    
    public BfdResult(String code, String swift_number, T data) {
    	this.code = code;
    	this.swift_number = swift_number;
    	this.data = data;
    }

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSwift_number() {
		return swift_number;
	}

	public void setSwift_number(String swift_number) {
		this.swift_number = swift_number;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
    
	@Override
    public String toString() {
        return "PlatformResult [code=" + code + ", swift_number=" + swift_number + ", data=" + data + "]";
    }
	
}
