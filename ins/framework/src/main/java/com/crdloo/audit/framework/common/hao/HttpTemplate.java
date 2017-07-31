package com.crdloo.audit.framework.common.hao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import com.crdloo.audit.framework.common.exception.HaoException;

public class HttpTemplate implements HttpOperations {
	
	private static final Logger logger = Logger.getLogger(HttpTemplate.class);
	
	private String domainUrl;
	private CloseableHttpClient httpClient = null;
	
	public HttpTemplate(){
		this("");
	}
	
	public HttpTemplate(String domainUrl) {
		this.domainUrl = domainUrl;
		this.httpClient = HttpClientFactory.getHttpClient();
	}

	@Override
	public String get(String uri) throws HaoException {
		return this.get(uri, null);
	}

	@Override
	public String get(String uri, Map<String, Object> params) throws HaoException {
		return this.get(uri, params, null);
	}

	@Override
	public String get(String uri, Map<String, Object> params, Map<String, String> headers) throws HaoException {
        String paramsStr = "";
        if(MapUtils.isNotEmpty(params)){
        	paramsStr = buildGetData(params);
        }
        uri = this.buildFullUri(uri) + paramsStr;
        logger.info("HttpClient get-Method: [uri=" + uri + "]");
        HttpGet httpGet = new HttpGet(uri);
        
        if (MapUtils.isNotEmpty(headers)) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                httpGet.addHeader(entry.getKey(), entry.getValue());
            }
        }
        
        String result = null;
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(httpGet); 
            int status = response.getStatusLine().getStatusCode();
            HttpEntity entity = response.getEntity();
            if(entity != null){
                try {
                    result = EntityUtils.toString(entity, Consts.UTF_8);
                    logger.debug("Response status code: " + status);
                    logger.debug("Response body: " + result);
                    if (status != HttpStatus.SC_OK){
                        throw new HaoException("network access failure");
                    }
                } finally {
                    EntityUtils.consumeQuietly(entity);
                }
            }
        } catch (Exception e) {
        	logger.error("HttpTemplate GET exception:", e);
        	throw new HaoException(e.getMessage());
        } finally {
            try {
                httpGet.releaseConnection();
                if(response != null){
                    response.close();
                }
            } catch (Exception e) {
                logger.error("HttpTemplate GET exception:", e);
            }
        }
        
        return result;
	}

	@Override
	public String post(String uri, Map<String, Object> params) throws HaoException {
		return post(uri, null, params, null, null);
	}

	@Override
	public String post(String uri, Map<String, String> headers, Map<String, Object> params) throws HaoException {
		return post(uri, headers, params, null, null);
	}

	@Override
	public String post(String uri, Map<String, String> headers, String body, String contentType) throws HaoException {
		return post(uri, headers, null, body, contentType);
	}
	
	@Override
	public String post(String uri, Map<String, String> headers, Map<String, Object> params, String body, String contentType) throws HaoException{
	        uri = this.buildFullUri(uri);
	        logger.info("HttpClient post-Method: [uri=" + uri + "]");
	        HttpPost httpPost = new HttpPost(uri);

	        String result = null;
	        CloseableHttpResponse response = null;
	        try {
	        	if (MapUtils.isNotEmpty(headers)) {
		            for (Map.Entry<String, String> entry : headers.entrySet()) {
		            	httpPost.addHeader(entry.getKey(), entry.getValue());
		            }
		        }
		        if(MapUtils.isNotEmpty(params)){
		        	List<NameValuePair> data = buildPostData(params);
		            httpPost.setEntity(new UrlEncodedFormEntity(data, Consts.UTF_8));
		        }
		        if(StringUtils.isNotBlank(body)){
		        	StringEntity bodyEntity = new StringEntity(body, Consts.UTF_8);
		        	bodyEntity.setContentType(contentType);
		            httpPost.setEntity(bodyEntity);
		        }
		        
	            response = httpClient.execute(httpPost);
	            int status = response.getStatusLine().getStatusCode();
	            HttpEntity entity = response.getEntity();
	            if(entity != null){
	                try {
	                    result = EntityUtils.toString(entity, Consts.UTF_8);
	                    logger.debug("Response status code: " + status);
	                    logger.debug("Response body: " + result);
	                    if (status != HttpStatus.SC_OK){
	                        throw new HaoException("network access failure");
	                    }
	                } finally {
	                    EntityUtils.consumeQuietly(entity);
	                }
	            }
	        } catch (Exception e) {
	        	logger.error("HttpTemplate POST exception:", e);
	        	throw new HaoException(e.getMessage());
	        } finally {
	            try {
	                httpPost.releaseConnection();
	                if(response != null){
	                    response.close();
	                }
	            } catch (Exception e) {
	            	logger.error("HttpTemplate POST exception:", e);
	            }
	        }
	        
	        return result;
	}

	private String buildFullUri(String uri) {
        if (StringUtils.isEmpty(uri)) {
            return domainUrl;
        }
        String lcUri = uri.toLowerCase();
        if (lcUri.startsWith("http://") || lcUri.startsWith("https://")) {
            return uri;
        }
        if(StringUtils.isEmpty(domainUrl)){
        	return uri;
        }
        return domainUrl + uri;
    }
	
	private String buildGetData(Map<String, Object> params) {
        StringBuilder builder = new StringBuilder();
        if (params != null && params.size() != 0) {
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (key == null || key.trim().length() == 0 || value == null) {
                    continue;
                }
                if (builder.length() > 0) {
                    builder.append("&");
                } else {
                    builder.append("?");
                }
                builder.append(key).append("=").append(value);
            }
        }
        return builder.toString();
    }
	
	private List<NameValuePair> buildPostData(Map<String, Object> params) {
        if (params == null || params.size() == 0) {
            return new ArrayList<NameValuePair>(0);
        }
        List<NameValuePair> ret = new ArrayList<NameValuePair>(params.size());
        for (String key : params.keySet()) {
            Object p = params.get(key);
            if (key != null && p != null) {
                NameValuePair np = new BasicNameValuePair(key, p.toString());
                ret.add(np);
            }
        }
        return ret;
    }
}
