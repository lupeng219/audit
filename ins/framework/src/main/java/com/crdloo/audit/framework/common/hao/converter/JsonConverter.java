package com.crdloo.audit.framework.common.hao.converter;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.codehaus.jackson.map.type.TypeFactory;

import com.crdloo.audit.framework.common.exception.HaoException;
import com.crdloo.audit.framework.common.hao.HttpDataResult;
import com.crdloo.audit.framework.common.hao.IConverter;

public class JsonConverter implements IConverter<HttpDataResult<?>> {

	private static final Logger logger = Logger.getLogger(JsonConverter.class);

	private ObjectMapper objectMapper = new ObjectMapper();

	public JsonConverter() {
		objectMapper.getSerializationConfig().setSerializationInclusion(Inclusion.NON_NULL);
		objectMapper.getDeserializationConfig().set(Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	}

	@Override
	public HttpDataResult<?> process(String data, Class<?>... classes) {
		HttpDataResult result = new HttpDataResult();
		if (StringUtils.isBlank(data)) {
			return result;
		}
		
		Class outputDataClass = classes[0];
		if (outputDataClass.equals(String.class)) {
			result.setData(data);
		} else {
			Object dataValue = null;
			try {
				if (classes.length == 1)
					dataValue = this.objectMapper.readValue(data, outputDataClass);
				else {
					Class[] paraCalss = new Class[classes.length - 1];
					System.arraycopy(classes, 1, paraCalss, 0, classes.length - 1);
					dataValue = this.objectMapper.readValue(data,
							TypeFactory.parametricType(outputDataClass, paraCalss));
				}
				result.setData(dataValue);
			} catch (Exception e) {
				throw new HaoException("json converter failure: " + e.getMessage());
			}
		}
		return result;
	}

}
