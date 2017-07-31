package com.crdloo.audit.framework.client.router;

import java.util.Collection;
import java.util.Map;

import org.apache.log4j.Logger;

import com.crdloo.audit.framework.client.EnumConnectType;
import com.crdloo.audit.framework.client.IDto;
import com.crdloo.audit.framework.client.PlatformCode;
import com.crdloo.audit.framework.client.PlatformResult;
import com.crdloo.audit.framework.router.Router;
import com.crdloo.audit.framework.router.utils.ReflectorUtil;

public abstract class AbstractRouterService {

	private static final Logger logger = Logger.getLogger(AbstractRouterService.class);
	
	private Router router;

    public AbstractRouterService(Router router) {
        this.router = router;
    }

    public abstract String getContext();
	
    /**
     * 返回简单对象超时请求
     * 
     * @param <T>
     * @param uri
     * @param map
     * @param outputDataClass
     * @return
     */
    @SuppressWarnings("unchecked")
    public <T> PlatformResult<T> post(String uri, Map<String, Object> map, Class<T> outputDataClass) {
        return this.post(uri, map, outputDataClass, null, EnumConnectType.SHORT);
    }

    /**
     * 返回简单对象请求
     * 
     * @param <T>
     * @param uri
     * @param map
     * @param outputDataClass
     * @param type
     * @return
     */
    @SuppressWarnings("unchecked")
    public <T> PlatformResult<T> post(String uri, Map<String, Object> map, Class<T> outputDataClass,
            EnumConnectType type) {
        return this.post(uri, map, outputDataClass, null, type);
    }

    /**
     * 返回复杂对象请求
     * 
     * @param uri
     * @param data
     * @param outputDataClass
     * @param elementClass
     * @param type
     * @return
     */
    @SuppressWarnings("rawtypes")
    public PlatformResult post(String uri, Map<String, Object> data, Class outputDataClass, Class elementClass,
            EnumConnectType type) {
        return (elementClass == null) ? this.post(uri, data, type, outputDataClass) : this.post(uri, data, type,
                outputDataClass, elementClass);
    }

    /**
     * 请求
     * 
     * @param uri
     * @param data
     * @param type
     * @param returnClass
     * @return
     */
    @SuppressWarnings("rawtypes")
    public PlatformResult post(String uri, Object data, EnumConnectType type, Class... returnClass) {
        long time = System.currentTimeMillis();
        PlatformResult result = null;
        try {
            if (EnumConnectType.LONG == type) {
            	throw new RuntimeException("Long connectType Not Support !!!");
            } else {
                result = router.requestWithTimeout(getContext() + uri, data, returnClass);
            }
            return result;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            if (result != null && result.getBizCode() < 0) {
                logger.error("url=" + uri + " bizCode=" + result.getBizCode() + "  message=" + result.getMessage()
                        + " data=" + result.getData() + " time=" + (System.currentTimeMillis() - time) + "ms"
                        + getStackTraceMgr());
            }
        }
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public <T> PlatformResult<T> postGzip(String uri, Map<String, Object> data, Class<T> outputDataClass) {
        long time = System.currentTimeMillis();
        PlatformResult result = null;
        try {
            result = router.gizRequest(getContext() + uri, data, outputDataClass);
            return result;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            if (result != null && result.getBizCode() < 0) {
                logger.error("url=" + uri + " bizCode=" + result.getBizCode() + "  message=" + result.getMessage()
                        + " data=" + result.getData() + " time=" + (System.currentTimeMillis() - time) + "ms"
                        + getStackTraceMgr());
            }
        }
    }

    /**
     * 检查
     * 
     * @param <T>
     * @param map
     * @return
     */
    protected <T> PlatformResult<T> processNullMap(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {

            if (entry.getValue() == null) {
                return new PlatformResult<T>(PlatformCode.SYS_EXCPTION, entry.getKey() + " is null", null);
            }

            Object val = entry.getValue();
            if (val instanceof IDto) {
                if (!ReflectorUtil.isAllFieldsNotNull(val))
                    return new PlatformResult<T>(PlatformCode.SYS_EXCPTION, entry.getKey() + " value is null", null);
            }

            if (val instanceof Collection) {
                Collection<?> coll = (Collection<?>) val;
                for (Object obj : coll) {
                    if (obj == null)
                        return new PlatformResult<T>(PlatformCode.SYS_EXCPTION, entry.getKey() + " element is null",
                                null);

                    if (obj instanceof IDto) {
                        if (!ReflectorUtil.isAllFieldsNotNull(obj))
                            return new PlatformResult<T>(PlatformCode.SYS_EXCPTION, entry.getKey()
                                    + " element properties is null", null);
                    }
                }
            }

        }
        return null;
    }
    
    private String getStackTraceMgr() {
        StackTraceElement[] stes = Thread.currentThread().getStackTrace();
        StackTraceElement ste;
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < stes.length; i++) {
            ste = stes[i];
            sb.append("\r\n");
            sb.append("at ");
            sb.append(ste.getClassName());
            sb.append(".");
            sb.append(ste.getMethodName());
            sb.append("(");
            sb.append(ste.getFileName());
            sb.append(":");
            sb.append(ste.getLineNumber());
            sb.append(")");
        }
        return sb.toString();
    }
    
}
