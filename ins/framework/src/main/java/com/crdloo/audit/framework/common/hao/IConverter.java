package com.crdloo.audit.framework.common.hao;

public interface IConverter<T> {

	public T process(String data, Class<?>... classes);
	
}
