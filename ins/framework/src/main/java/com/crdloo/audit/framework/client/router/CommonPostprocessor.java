package com.crdloo.audit.framework.client.router;

import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.codehaus.jackson.map.type.TypeFactory;

import com.crdloo.audit.framework.client.PlatformCode;
import com.crdloo.audit.framework.client.PlatformResult;
import com.crdloo.audit.framework.common.filter.ResultStatus;
import com.crdloo.audit.framework.router.handler.AbstractPostprocessor;
import com.crdloo.audit.framework.router.utils.JsonUtil;

public class CommonPostprocessor extends AbstractPostprocessor<PlatformResult<?>> {

	private static final Logger logger = Logger.getLogger(CommonPostprocessor.class);

    private ObjectMapper objectMapper = new ObjectMapper();

    public CommonPostprocessor() {
        objectMapper.getSerializationConfig().setSerializationInclusion(Inclusion.NON_NULL);
        objectMapper.getDeserializationConfig().set(Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

	@Override
	public PlatformResult<?> postprocess(String json, Class<?>... returnClass) {
		if (!StringUtils.isNotBlank(json)) {
            return new PlatformResult(PlatformCode.SYS_EXCPTION, "httpclient post result is error, json is null", null);
        }

        Map<String, String> map = JsonUtil.getRootJson(json);
        if (map == null) {
            return new PlatformResult(PlatformCode.SYS_EXCPTION, "httpclient post map is null json:" + json, null);
        }

        String status = map.get(ResultStatus.status());
        String message = map.get(ResultStatus.message());
        String data = map.get(ResultStatus.data());

        PlatformResult result = new PlatformResult();
        result.setBizCode(Integer.parseInt(status));
        result.setMessage(message);

        if ("{}".equals(data)) {
            return result;
        }

        Class outputDataClass = returnClass[0];
        if (outputDataClass.equals(String.class)) {
            result.setData(data);
        } else {
            Object dataValue = null;
            try {
                if (outputDataClass.isEnum()) {
                    dataValue = this.objectMapper.readValue("\"" + data + "\"", outputDataClass);
                    if (dataValue == null) {
                        logger.error("枚举值为空 服务端JSON值为" + json);
                    }
                } else {
                    if (returnClass.length == 1)
                        dataValue = this.objectMapper.readValue(data, outputDataClass);
                    else {
                        Class[] paraCalss = new Class[returnClass.length - 1];
                        System.arraycopy(returnClass, 1, paraCalss, 0, returnClass.length - 1);
                        dataValue = this.objectMapper.readValue(data,
                                TypeFactory.parametricType(outputDataClass, paraCalss));
                    }
                }
                result.setData(dataValue);
            } catch (Exception e) {
            	logger.error(e.getMessage(), e);
                return new PlatformResult(PlatformCode.SYS_EXCPTION, e.getMessage(), null);
            }
        }
        return result;
	}
    
    
}
