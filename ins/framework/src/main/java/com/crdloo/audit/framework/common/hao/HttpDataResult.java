package com.crdloo.audit.framework.common.hao;

import java.io.Serializable;

public class HttpDataResult<T> implements Serializable {

	private static final long serialVersionUID = -2588044664013408725L;

	private T data;
	
	public HttpDataResult(){
		this.data = null;
	}
	
	public HttpDataResult(T data){
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	@Override
    public String toString() {
        return "HttpDataResult [data=" + data + "]";
    }
}
