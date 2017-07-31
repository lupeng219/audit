package com.crdloo.audit.framework.common.hao;

import java.util.Map;

import com.crdloo.audit.framework.common.hao.converter.JsonConverter;

public abstract class HttpDaoSupport {

	public static final String CONTENT_TYPE_JSON = "application/json";
	public static final String CONTENT_TYPE_FORM = "application/x-www-form-urlencoded";

	private HttpTemplate httpTemplate;
	private IConverter<?> converter;

	public HttpDaoSupport() {
		String domain = getDomainUrl();
		this.httpTemplate = createHttpTemplate(domain);
		converter = new JsonConverter();
	}

	protected abstract String getDomainUrl();

	protected HttpTemplate createHttpTemplate(String serverUrl) {
		return new HttpTemplate(serverUrl);
	}

	public final HttpTemplate getHttpTemplate() {
		return this.httpTemplate;
	}

	/** 返回简单对象 **/
	protected <T> T get(String uri, Class<T> outputDataClass) {
		String value = httpTemplate.get(uri);
		HttpDataResult<T> result = (HttpDataResult<T>) converter.process(value, outputDataClass);
		return result.getData();
	}

	protected <T> T get(String uri, Map<String, Object> params, Class<T> outputDataClass) {
		String value = httpTemplate.get(uri, params);
		HttpDataResult<T> result = (HttpDataResult<T>) converter.process(value, outputDataClass);
		return result.getData();
	}

	protected <T> T get(String uri, Map<String, Object> params, Map<String, String> headers, Class<T> outputDataClass) {
		String value = httpTemplate.get(uri, params, headers);
		HttpDataResult<T> result = (HttpDataResult<T>) converter.process(value, outputDataClass);
		return result.getData();
	}

	/** 返回复杂对象 **/
	protected <T> T get(String uri, Class outputDataClass, Class elementClass) {
		String value = httpTemplate.get(uri);
		HttpDataResult<T> result = null;
		if (elementClass == null) {
			result = (HttpDataResult<T>) converter.process(value, outputDataClass);
		} else {
			result = (HttpDataResult<T>) converter.process(value, outputDataClass, elementClass);
		}
		return result.getData();
	}

	protected <T> T get(String uri, Map<String, Object> params, Class outputDataClass, Class elementClass) {
		String value = httpTemplate.get(uri, params);
		HttpDataResult<T> result = null;
		if (elementClass == null) {
			result = (HttpDataResult<T>) converter.process(value, outputDataClass);
		} else {
			result = (HttpDataResult<T>) converter.process(value, outputDataClass, elementClass);
		}
		return result.getData();
	}

	protected <T> T get(String uri, Map<String, Object> params, Map<String, String> headers, Class outputDataClass,
			Class elementClass) {
		String value = httpTemplate.get(uri, params, headers);
		HttpDataResult<T> result = null;
		if (elementClass == null) {
			result = (HttpDataResult<T>) converter.process(value, outputDataClass);
		} else {
			result = (HttpDataResult<T>) converter.process(value, outputDataClass, elementClass);
		}
		return result.getData();
	}

	/** 返回复杂对象2 **/
	protected <T> T get(String uri, Class... returnClass) {
		String value = httpTemplate.get(uri);
		HttpDataResult<T> result = (HttpDataResult<T>) converter.process(value, returnClass);
		return result.getData();
	}

	protected <T> T get(String uri, Map<String, Object> params, Class... returnClass) {
		String value = httpTemplate.get(uri, params);
		HttpDataResult<T> result = (HttpDataResult<T>) converter.process(value, returnClass);
		return result.getData();
	}

	protected <T> T get(String uri, Map<String, Object> params, Map<String, String> headers, Class... returnClass) {
		String value = httpTemplate.get(uri, params, headers);
		HttpDataResult<T> result = (HttpDataResult<T>) converter.process(value, returnClass);
		return result.getData();
	}

	/* post */
	protected <T> T post(String uri, Map<String, Object> params, Class<T> outputDataClass) {
		String value = httpTemplate.post(uri, params);
		HttpDataResult<T> result = (HttpDataResult<T>) converter.process(value, outputDataClass);
		return result.getData();
	}

	protected <T> T post(String uri, Map<String, Object> params, Map<String, String> headers,
			Class<T> outputDataClass) {
		String value = httpTemplate.post(uri, headers, params);
		HttpDataResult<T> result = (HttpDataResult<T>) converter.process(value, outputDataClass);
		return result.getData();
	}

	protected <T> T post(String uri, Map<String, Object> params, Class outputDataClass, Class elementClass) {
		String value = httpTemplate.post(uri, params);
		HttpDataResult<T> result = null;
		if (elementClass == null) {
			result = (HttpDataResult<T>) converter.process(value, outputDataClass);
		} else {
			result = (HttpDataResult<T>) converter.process(value, outputDataClass, elementClass);
		}
		return result.getData();
	}

	protected <T> T post(String uri, Map<String, Object> params, Map<String, String> headers, Class outputDataClass,
			Class elementClass) {
		String value = httpTemplate.post(uri, headers, params);
		HttpDataResult<T> result = null;
		if (elementClass == null) {
			result = (HttpDataResult<T>) converter.process(value, outputDataClass);
		} else {
			result = (HttpDataResult<T>) converter.process(value, outputDataClass, elementClass);
		}
		return result.getData();
	}

	protected <T> T post(String uri, Map<String, Object> params, Class... returnClass) {
		String value = httpTemplate.post(uri, params);
		HttpDataResult<T> result = (HttpDataResult<T>) converter.process(value, returnClass);
		return result.getData();
	}

	protected <T> T post(String uri, Map<String, Object> params, Map<String, String> headers, Class... returnClass) {
		String value = httpTemplate.post(uri, headers, params);
		HttpDataResult<T> result = (HttpDataResult<T>) converter.process(value, returnClass);
		return result.getData();
	}

}
