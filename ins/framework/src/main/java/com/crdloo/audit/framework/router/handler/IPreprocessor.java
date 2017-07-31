package com.crdloo.audit.framework.router.handler;

import java.util.Map;

public interface IPreprocessor {

	public Map<String, Object> preprocess(final Object param);
	
}
