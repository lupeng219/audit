package com.crdloo.audit.framework.router.cluster;

import org.apache.log4j.Logger;

import com.crdloo.audit.framework.common.httpclient.HttpSendClient;
import com.crdloo.audit.framework.common.httpclient.HttpSendClientFactory;

public class HttpHealthChecker extends AbstractHealthChecker<Address> {
	
	private static final Logger logger = Logger.getLogger(HttpHealthChecker.class);

	private HttpSendClient httpClient;

    private String url;

    public HttpHealthChecker(String url) {
        this(url, SWITCH_THRESHOLD);
    }

    public HttpHealthChecker(String url, int threshold) {
        this.url = url;
        setFallCount(threshold);
        setRiseCount(threshold);
        HttpSendClientFactory factory = new HttpSendClientFactory();
        factory.setConnectionTimeOut(1000);
        factory.setSoTimeOut(500);
        this.httpClient = factory.newHttpSendClient();
    }

    @Override
    public Boolean check(Address t) {
        String uri = t.uri() + this.url + "?" + System.currentTimeMillis();
        try {
            int code = httpClient.getReturnHttpCode(uri, null);
            if (httpClient.isOK(code)) {
                return Boolean.TRUE;
            }
            logger.info("http heartbeat check uri=" + uri + " code=" + code);
        } catch (Exception e) {
        	logger.info("http heartbeat check uri=" + uri + " is invalidate, " + e.getMessage());
        }
        return Boolean.FALSE;
    }

}
