package com.crdloo.audit.framework.common.hao;

import java.nio.charset.CodingErrorAction;

import javax.net.ssl.SSLContext;

import org.apache.http.Consts;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.MessageConstraints;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

public class HttpClientFactory {

    private static final int CON_TIMEOUT_MS = 5000;
    private static final int SO_TIMEOUT_MS = 5000;
    private static final int REQ_TIMEOUT_MS = 2000;
    private static final int MAX_TOTAL_CONNECTIONS = 100;
    private static final int MAX_PER_ROUTE = 30;

    private static volatile CloseableHttpClient  httpClient = null;
    
    private HttpClientFactory() { }
    
    public static CloseableHttpClient getHttpClient() {
        if (httpClient == null) {
            synchronized(HttpClientFactory.class) {
                if (httpClient == null){
                    SSLContext sslContext = SSLContexts.createSystemDefault();
                    Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
                        .register("http", PlainConnectionSocketFactory.INSTANCE)
                        .register("https", new SSLConnectionSocketFactory(sslContext))
                        .build();
                    
                    PoolingHttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
                    connManager.setMaxTotal(MAX_TOTAL_CONNECTIONS);
                    connManager.setDefaultMaxPerRoute(MAX_PER_ROUTE);
                    
                    // Create message constraints
                    MessageConstraints messageConstraints = MessageConstraints.custom()
                        .setMaxHeaderCount(200)
                        .setMaxLineLength(2000)
                        .build();
                    // Create connection configuration
                    ConnectionConfig connectionConfig = ConnectionConfig.custom()
                        .setMalformedInputAction(CodingErrorAction.IGNORE)
                        .setUnmappableInputAction(CodingErrorAction.IGNORE)
                        .setCharset(Consts.UTF_8)
                        .setMessageConstraints(messageConstraints)
                        .build();
                    // Create request configuration
                    RequestConfig defaultRequestConfig = RequestConfig.custom()
                        .setSocketTimeout(SO_TIMEOUT_MS)
                        .setConnectTimeout(CON_TIMEOUT_MS)
                        .setConnectionRequestTimeout(REQ_TIMEOUT_MS)
                        .setStaleConnectionCheckEnabled(true)
                        .build();
                        
                    httpClient = HttpClients.custom()
                        .setConnectionManager(connManager)
                        .setDefaultConnectionConfig(connectionConfig)
                        .setDefaultRequestConfig(defaultRequestConfig)
                        .build();
                }
            }
        }
        return httpClient;
    }
	
}
