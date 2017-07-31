package com.crdloo.audit.framework.router.handler;

public abstract class AbstractPostprocessor<T> {

	public T postprocess(String data, Class<?>... classes) {
        return (T) data;
    }
	
}
