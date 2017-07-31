package com.crdloo.audit.framework.common.httpclient;

import java.nio.charset.CodingErrorAction;

import javax.net.ssl.SSLContext;

import org.apache.http.Consts;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.MessageConstraints;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.log4j.Logger;

public class HttpSendClientFactory {

	private static final Logger logger = Logger.getLogger(HttpSendClientFactory.class);
	
	public static final int MAX_TOTAL_CONNECTIONS_DEFAULT = 512;
    private int maxTotalConnections = MAX_TOTAL_CONNECTIONS_DEFAULT;

    public static final int MAX_PER_ROUTE_DEFAULT = 128;
    private int defaultMaxPerRoute = MAX_PER_ROUTE_DEFAULT;

    public static final int CONNECTION_TIMEOUT_DEFAULT = 2000;
    private int connectionTimeOut = CONNECTION_TIMEOUT_DEFAULT;

    public static final int SO_TIMEOUT_DEFAULT = 3000;
    private int soTimeOut = SO_TIMEOUT_DEFAULT;

    public static final int SOCKET_BUFFER_SIZE_DEFAULT = 8192;
    private int socketBufferSize = SOCKET_BUFFER_SIZE_DEFAULT;

    public static final int RETRY_COUNT_DEFAULT = 3;
    private int retryCount = RETRY_COUNT_DEFAULT;
    
    public HttpSendClient newHttpSendClient() {
    	SSLContext sslContext = SSLContexts.createSystemDefault();
        Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
            .register("http", PlainConnectionSocketFactory.INSTANCE)
            .register("https", new SSLConnectionSocketFactory(sslContext))
            .build();
        
        PoolingHttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
        connManager.setMaxTotal(getMaxTotalConnections());
        connManager.setDefaultMaxPerRoute(getDefaultMaxPerRoute());
        
        SocketConfig socketConfig = SocketConfig.custom()
        		.setTcpNoDelay(true).build();
        
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
            .setBufferSize(getSocketBufferSize())
            .build();
        // Create request configuration
        RequestConfig defaultRequestConfig = RequestConfig.custom()
            .setSocketTimeout(getSoTimeOut())
            .setConnectTimeout(getConnectionTimeOut())
//            .setConnectionRequestTimeout(REQ_TIMEOUT_MS)
            .setStaleConnectionCheckEnabled(true)
            .build();
        
        HttpRequestRetryHandler retryHandler = new DefaultHttpRequestRetryHandler(getRetryCount(), false);
            
        CloseableHttpClient httpClient = HttpClients.custom()
        	.setDefaultSocketConfig(socketConfig)
            .setConnectionManager(connManager)
            .setDefaultConnectionConfig(connectionConfig)
            .setDefaultRequestConfig(defaultRequestConfig)
            .setRetryHandler(retryHandler)
            .build();
        return new HttpSendClient(httpClient);
    }
	
    /*
    public HttpSendClient newHttpSendClient() {
        HttpParams params = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(params, getConnectionTimeOut());
        HttpConnectionParams.setSoTimeout(params, getSoTimeOut());
        // HttpConnectionParams.setLinger(params, 1);

        HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(params, HTTP.UTF_8);
        // 解释: 握手的目的，是为了允许客户端在发送请求内容之前，判断源服务器是否愿意接受请求（基于请求头部）。
        // Expect:100-Continue握手需谨慎使用，因为遇到不支持HTTP/1.1协议的服务器或者代理时会引起问题。
        // 默认开启
        // HttpProtocolParams.setUseExpectContinue(params, false);
        HttpConnectionParams.setTcpNoDelay(params, true);
        HttpConnectionParams.setSocketBufferSize(params, getSocketBufferSize());

        ThreadSafeClientConnManager threadSafeClientConnManager = new ThreadSafeClientConnManager();
        threadSafeClientConnManager.setMaxTotal(getMaxTotalConnections());
        threadSafeClientConnManager.setDefaultMaxPerRoute(getDefaultMaxPerRoute());

        DefaultHttpRequestRetryHandler retryHandler = new DefaultHttpRequestRetryHandler(getRetryCount(), false);

        DefaultHttpClient httpClient = new DefaultHttpClient(threadSafeClientConnManager, params);
        httpClient.setHttpRequestRetryHandler(retryHandler);

        return new HttpSendClient(httpClient);
    }
    */
    
    public int getDefaultMaxPerRoute() {
        return defaultMaxPerRoute;
    }

    /**
     * 设置每个路由链接数默认值 default 32
     * 
     * @param int
     */
    public void setDefaultMaxPerRoute(int defaultMaxPerRoute) {
        this.defaultMaxPerRoute = defaultMaxPerRoute;
    }

    public int getConnectionTimeOut() {
        return connectionTimeOut;
    }

    /**
     * 设置连接超时时间 default 2000
     * 
     * @param int
     */
    public void setConnectionTimeOut(int connectionTimeOut) {
        this.connectionTimeOut = connectionTimeOut;
    }

    public int getSoTimeOut() {
        return soTimeOut;
    }

    public void setSoTimeOut(int soTimeOut) {
        this.soTimeOut = soTimeOut;
    }

    public int getSocketBufferSize() {
        return socketBufferSize;
    }

    public void setSocketBufferSize(int socketBufferSize) {
        this.socketBufferSize = socketBufferSize;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    public int getMaxTotalConnections() {
        return maxTotalConnections;
    }

    public void setMaxTotalConnections(int maxTotalConnections) {
        this.maxTotalConnections = maxTotalConnections;
    }
}
