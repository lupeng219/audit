package com.crdloo.audit.framework.common.filter;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.crdloo.audit.framework.common.exception.StatusCodeException;
import com.crdloo.audit.framework.router.utils.GzipUtil;
import com.crdloo.audit.framework.router.utils.JsonUtil;

public abstract class AbstractFilter implements Filter {

	private static final Logger logger = Logger.getLogger(AbstractFilter.class);
	
	public static final String CHARSET_UTF_8 = "UTF-8";
    protected static ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    protected static final Map<?, ?> EMPTY_MAP = Collections.EMPTY_MAP;
//    public static final String HTTP_HEADER_IP = "X-lietou-Client-IP";
//    public static final String HTTP_HEADER_MODE = "X-lietou-MODE";
    private static final Set<String> paramKeys = new LinkedHashSet<String>();
    
    private AbstractExceptionHandler exceptionHandler = new AbstractExceptionHandler() {};
    private AbstractPreprocessor preprocessor = new AbstractPreprocessor() {};
    private AbstractPostprocessor postprocessor = new AbstractPostprocessor() {};
    private AbstractIOLogger ioLogger = new AbstractIOLogger() {};
    
    protected boolean ignoreCompress = false;
    
	static {
        OBJECT_MAPPER.getSerializationConfig().setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        OBJECT_MAPPER.getSerializationConfig().setSerializationInclusion(Inclusion.NON_NULL);

        paramKeys.add(InterfaceReq.VIEW_ID);
        paramKeys.add(InterfaceReq.CLIENT_ID);
    }
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		logger.info("AbstractFilter init -->" + filterConfig.toString());
	}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain)
			throws IOException, ServletException {
        Map<String, Object> inputMap = null;
        Object output = null;
        ResultStatus rs = ResultStatus.ok();
        EventInfo eventInfo = new EventInfo();
        
        try {
	        // 日志信息
	        eventInfo(eventInfo, (HttpServletRequest) req);
	        // 参数map
	        inputMap = getInput((HttpServletRequest) req);
	        // 预处理
	        preprocessor.preprocess(inputMap, (HttpServletRequest) req);
	        
	        // 放入参数map
	        req.setAttribute(ResultStatus.INPUT, inputMap);
	
	        // 执行
	        filterChain.doFilter(req, resp);
	
	        // 返回结果
	        output = req.getAttribute(ResultStatus.OUTPUT);
        } catch (StatusCodeException e) {
            logger.warn(e.message(), e);
            rs = new ResultStatus(Integer.parseInt(e.code()), e.message());
            return;
        } catch (Exception e) {
        	logger.error(e.getMessage(), e);
            try {
                rs = exceptionHandler.handle(e);
            } catch (Exception ee) {
                logger.error(ee.getMessage(), ee);
                rs = ResultStatus.unknown(ee.getMessage());
            }
        } catch (Error e) {
            logger.error(e.getMessage(), e);
            rs = ResultStatus.unknown(e.getMessage());
        } finally {
        	postprocessor.postprocess((HttpServletRequest) req);
            output((HttpServletResponse) resp, inputMap, output, isSupportGzip((HttpServletRequest) req), rs,
                    eventInfo);
            inputMap = null;
            output = null;
        }
	}
	
	protected abstract String render(Object output, ResultStatus rs) throws Exception;

    protected abstract String getRespContentType();

    protected abstract void export(HttpServletResponse resp, String outputStr, boolean compress) throws Exception;
	
	@Override
	public void destroy() {
		logger.info("AbstractFilter destroy.");
	}
	
	private void eventInfo(final EventInfo info, HttpServletRequest request) {
		info.setStart(System.currentTimeMillis());
        info.setClientIP(getClientIp(request));
        info.setActionPath(request.getServletPath());
    }
	
	private String getClientIp(HttpServletRequest request) {
		return request.getRemoteAddr();
    }
	
	protected Map<String, Object> getInput(HttpServletRequest req) throws Exception {
        Map<String, Object> input = null;
        ContentType contentType = ContentType.support(req.getContentType());
        if (contentType == null) {
            throw new Exception("unsupported Content-Type:" + req.getContentType());
        }
        // 判断压缩
        if (!ignoreCompress && isSupportGzip(req)) {
            if (!isInvalid(req)) {
                String content = GzipUtil.uncompress(req.getInputStream());
                if (content != null && content.trim().length() != 0) {
                    if (ContentType.JSON == contentType) {
                        input = JsonUtil.json2map(content);
                    } else if (ContentType.XMLTEXT == contentType) {
                        input = getXml(new ByteArrayInputStream(content.getBytes(CHARSET_UTF_8)));
                    }
                }
            }
        } else {
            if (ContentType.FROM == contentType) {
                input = getForm(req);
            } else if (ContentType.JSON == contentType) {
                input = getJson(req.getInputStream());
            } else if (ContentType.XMLTEXT == contentType) {
                input = getXml(req.getInputStream());
            } else if (ContentType.MULTIPART_FORMDATA == contentType) {
                input = getForm(req);
            }
        }
        return sortInputParams(input);
    }
	
	protected boolean isSupportGzip(HttpServletRequest req) {
        String header = req.getHeader("accept-encoding");
        if (header != null && (header.toLowerCase().indexOf("gzip") != -1)) {
            return true;
        }
        return false;
    }
	
	protected boolean isInvalid(HttpServletRequest req) {
        String value = req.getHeader("content-length");
        if (value == null || "0".equals(value.trim())) {
            return true;
        }
        return false;
    }
	
	protected Map<String, Object> getXml(InputStream inputStream) throws Exception {
        Map<String, Object> inputMap = new HashMap<String, Object>();
        SAXReader reader = new SAXReader();
        Document doc = reader.read(inputStream);
        Element rootElement = doc.getRootElement();

        List<?> elements = rootElement.elements();
        for (Object obj : elements) {
            Element element = (Element) obj;
            inputMap.put(element.getName(), element.getTextTrim());
        }
        return inputMap;
    }
	
	@SuppressWarnings("unchecked")
    protected Map<String, Object> getForm(HttpServletRequest req) throws Exception {
        Set<Entry<String, String[]>> set = req.getParameterMap().entrySet();
        Map<String, Object> inputMap = new HashMap<String, Object>();
        for (Entry<String, String[]> entry : set) {
            String key = entry.getKey();
            String[] value = entry.getValue();
            if (value == null || value.length == 0) {
                logger.debug("get(" + key + ") is null or empty.");
            } else {
                if (value.length == 1) {
                    inputMap.put(key, value[0]);
                } else {
                    inputMap.put(key, Arrays.asList(value));
                }
            }
        }
        return inputMap;
    }
	
	protected Map<String, Object> getJson(InputStream inputStream) throws Exception {
        try {
            return getMap(OBJECT_MAPPER.readTree(inputStream));
        } catch (JsonParseException e) {
        	logger.info(ContentType.JSON + " getJson fail", e);
            return null;
        }
    }
	
	protected Map<String, Object> getMap(JsonNode node) {
        Map<String, Object> inputMap = new HashMap<String, Object>();
        Iterator<String> fieldNames = node.getFieldNames();
        while (fieldNames.hasNext()) {
            String fieldName = fieldNames.next();
            JsonNode child = node.get(fieldName);
            if (child.isValueNode()) {
                inputMap.put(fieldName, child.getValueAsText());
            } else {
                inputMap.put(fieldName, child);
            }
        }
        return inputMap;
    }
	
	protected Map<String, Object> sortInputParams(Map<String, Object> map) {
        Map<String, Object> sortMap = new LinkedHashMap<String, Object>();
        if (map != null && map.size() > 0) {
            for (String key : paramKeys) {
                Object value = map.get(key);
                if (value != null) {
                    sortMap.put(key, value);
                }
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (paramKeys.contains(entry.getKey())) {
                    continue;
                }
                sortMap.put(entry.getKey(), entry.getValue());
            }
        }
        return sortMap;
    }
	
	private void output(HttpServletResponse resp, Map<String, Object> inputMap, Object output, boolean compress,
            ResultStatus rs, EventInfo eventInfo) {
        resp.setCharacterEncoding(CHARSET_UTF_8);
        resp.setContentType(getRespContentType());
        String inputStr = null;
        String outputStr = null;

        try {
            // 输入格式化
            inputStr = OBJECT_MAPPER.writeValueAsString(inputMap);
            // 输出格式化
            outputStr = render(output, rs);
            // 返回响应
            export(resp, outputStr, !ignoreCompress && compress);
        } catch (Exception e) {
            logger.warn(e.getMessage(), e);
            rs = ResultStatus.unknown(e.getMessage());
        }
        eventInfo.setEclipse(System.currentTimeMillis() - eventInfo.getStart());
        // 记录日志
        ioLogger.log(rs, eventInfo, inputStr, outputStr);
    }

	public void setExceptionHandler(AbstractExceptionHandler exceptionHandler) {
        this.exceptionHandler = exceptionHandler;
    }

    public void setPreprocessor(AbstractPreprocessor preprocessor) {
        this.preprocessor = preprocessor;
    }

    public void setIoLogger(AbstractIOLogger ioLogger) {
        this.ioLogger = ioLogger;
    }

    public void setIgnoreCompress(boolean ignoreCompress) {
        this.ignoreCompress = ignoreCompress;
    }

    public void setPostprocessor(AbstractPostprocessor postprocessor) {
        this.postprocessor = postprocessor;
    }
    
}
