package com.crdloo.audit.framework.client.router;

import java.util.Map;

import com.crdloo.audit.framework.router.handler.IPreprocessor;

public class DefaultPreprocessor implements IPreprocessor {

	public Map<String, Object> preprocess(Object param) {
		if (param == null) {
            return null;
        }
        if (param instanceof Map) {
            return (Map<String, Object>) param;
        }
        throw new RuntimeException("Only Supported Object Class For Map<String,Object>. " + param);
	}

}
