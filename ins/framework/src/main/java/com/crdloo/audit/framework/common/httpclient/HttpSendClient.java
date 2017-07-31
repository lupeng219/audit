package com.crdloo.audit.framework.common.httpclient;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.DeflateDecompressingEntity;
import org.apache.http.client.entity.GzipDecompressingEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import com.crdloo.audit.framework.router.utils.GzipUtil;
import com.crdloo.audit.framework.router.utils.StopWatch;

public class HttpSendClient {

	private static final Logger logger = Logger.getLogger(HttpSendClient.class);

	private CloseableHttpClient httpClient;

	private static final String AGENT = "ins-crdloo-router [" + HttpSendClient.class.getName() + "] 1.0";

	public HttpSendClient(CloseableHttpClient httpClient) {
		this.httpClient = httpClient;
	}

	/**
	 * Get 方式请求 ，并返回HTTP_STATUS_CODE码
	 * 
	 * @param String
	 *            address 请求地址
	 * @param Map<String,
	 *            Object> params 请求参数
	 * @return int
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public int getReturnHttpCode(String address, Map<String, Object> params)
			throws ClientProtocolException, IOException {
		StopWatch stopWatch = new StopWatch("HttpSendClient", true);
		String paramsStr = buildGetData(params);
		HttpGet httpGet = new HttpGet(address + paramsStr);
		CloseableHttpResponse response = null;
		try {
			httpGet.setHeader("User-Agent", AGENT);

			stopWatch.stop();
			response = httpClient.execute(httpGet);
			stopWatch.stop();
			int status = response.getStatusLine().getStatusCode();
			if (!isOK(status)) {
				logger.warn("fail to call address=" + address + ", status=" + status);
			}
			return status;
		} catch (Exception e) {
			logger.error("HttpSendClient getReturnHttpCode exception:", e);
			return -1;
		} finally {
			try {
				httpGet.releaseConnection();
				if (response != null) {
					response.close();
				}
			} catch (Exception e) {
				logger.error("HttpSendClient getReturnHttpCode exception:", e);
			}
			stopWatch.log();
		}
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

	/**
	 * 验证HTTP_STAUSE_CODE 是否成功
	 * 
	 * @param int
	 * @return boolean
	 * 
	 */
	public boolean isOK(int code) {
		return code == HttpStatus.SC_OK;
	}

	/**
	 * 关闭HTTPCLIENT
	 */
	public synchronized void shutdown() {
		try {
			httpClient.close();
		} catch (IOException e) {
		}
	}

	public String post(String address, Map<String, Object> params) throws ClientProtocolException, IOException {
		StopWatch stopWatch = new StopWatch("HttpSendClient", true);
		HttpPost httpPost = new HttpPost(address);

		String result = null;
		CloseableHttpResponse response = null;
		try {
			List<NameValuePair> data = buildPostData(params);
			httpPost.setEntity(new UrlEncodedFormEntity(data, Consts.UTF_8));
			httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
			httpPost.setHeader("User-Agent", AGENT);
			httpPost.setHeader("Accept-Encoding", "");

			stopWatch.stop();
			response = httpClient.execute(httpPost);
			stopWatch.stop();
			int status = response.getStatusLine().getStatusCode();
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				try {
					result = EntityUtils.toString(entity, Consts.UTF_8);
					// logger.debug("Response status code: " + status);
					// logger.debug("Response body: " + result);
					// if (status != HttpStatus.SC_OK){
					// throw new HaoException("network access failure");
					// }
				} finally {
					EntityUtils.consumeQuietly(entity);
				}
			}
		} catch (Exception e) {
			logger.error("HttpSendClient POST exception:", e);
		} finally {
			try {
				httpPost.releaseConnection();
				if (response != null) {
					response.close();
				}
			} catch (Exception e) {
				logger.error("HttpSendClient POST exception:", e);
			}
			stopWatch.log();
		}

		return result;
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

	public String postGzip(String address, String json) throws ClientProtocolException, IOException {
		StopWatch stopWatch = new StopWatch("HttpSendClient", true);
		HttpPost httpPost = new HttpPost(address);

		String result = null;
		CloseableHttpResponse response = null;
		try {
			httpPost.setEntity(new ByteArrayEntity(GzipUtil.compressString2byte(json)));
			httpPost.setHeader("Content-Type", "application/json; charset=UTF-8");
			httpPost.setHeader("User-Agent", AGENT);
			httpPost.setHeader("Accept-Encoding", "gzip");

			stopWatch.stop();
			response = httpClient.execute(httpPost);
			stopWatch.stop();
			int status = response.getStatusLine().getStatusCode();
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				try {
					if (!isOK(status)) {
						return null;
					}
					return uncompress(entity);
				} finally {
					EntityUtils.consumeQuietly(entity);
				}
			}
		} catch (Exception e) {
			logger.error("HttpSendClient postGzip exception:", e);
		} finally {
			try {
				httpPost.releaseConnection();
				if (response != null) {
					response.close();
				}
			} catch (Exception e) {
				logger.error("HttpSendClient postGzip exception:", e);
			}
			stopWatch.log();
		}
		return result;
	}

	private String uncompress(HttpEntity entity) throws ParseException, IOException {
		String respBody = null;
		// String charset = EntityUtils.getContentCharSet(entity);
		Charset charset = ContentType.get(entity).getCharset();
		if (charset == null) {
			charset = Consts.UTF_8;
		}

		// "Content-Encoding"
		Header contentEncodingHeader = entity.getContentEncoding();
		if (contentEncodingHeader != null) {
			String contentEncoding = contentEncodingHeader.getValue();
			if (contentEncoding.contains("gzip")) {
				respBody = EntityUtils.toString(new GzipDecompressingEntity(entity), charset);
			} else if (contentEncoding.contains("deflate")) {
				respBody = EntityUtils.toString(new DeflateDecompressingEntity(entity), charset);
			}
		} else {
			// "Content-Type"
			Header contentTypeHeader = entity.getContentType();
			if (contentTypeHeader != null) {
				String contentType = contentTypeHeader.getValue();
				if (contentType != null) {
					if (contentType.startsWith("application/x-gzip-compressed")) {
						respBody = EntityUtils.toString(new GzipDecompressingEntity(entity), charset);
					} else if (contentType.startsWith("application/x-deflate")) {
						respBody = EntityUtils.toString(new DeflateDecompressingEntity(entity), charset);
					}
				}
			}
		}
		return respBody;
	}

}
