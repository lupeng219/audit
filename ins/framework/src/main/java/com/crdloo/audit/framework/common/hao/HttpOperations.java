package com.crdloo.audit.framework.common.hao;

import java.util.Map;

import com.crdloo.audit.framework.common.exception.HaoException;

public interface HttpOperations {

	public String get(String uri) throws HaoException;
	
	public String get(String uri, Map<String, Object> params) throws HaoException;

	public String get(String uri, Map<String, Object> params, Map<String, String> headers) throws HaoException;

	public String post(String uri, Map<String, Object> params) throws HaoException;

	public String post(String uri, Map<String, String> headers, Map<String, Object> params) throws HaoException;

	public String post(String uri, Map<String, String> headers, String body, String contentType) throws HaoException;
	
	public String post(String uri, Map<String, String> headers, Map<String, Object> params, String body, String contentType) throws HaoException;

}
