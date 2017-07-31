package com.crdloo.audit.framework.router.utils;

import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class SystemUtil {
	
	public static final String FILE_SEPARATOR = "file.separator";

    public static final String CATALINA_BASE = "catalina.base";

    public static final String FILENAME = "server.xml";

	public static String host2ip(String host) {
        try {
            return InetAddress.getByName(host).getHostAddress();
        } catch (UnknownHostException e) {
            throw new RuntimeException("host=" + host + " => ip NDS fail, please check it first!");
        }
    }
	
	/**
     * 获取tomcat启动端口
     * 
     * @return
     */
    public static int getConnectorPort() {
        String filepath = System.getProperty(CATALINA_BASE) + fileSeparator() + "conf" + fileSeparator() + FILENAME;

        SAXReader reader = new SAXReader();
        Document doc = null;;
        try {
            doc = reader.read(new File(filepath));
        } catch (DocumentException e) {
            throw new RuntimeException("Read " + filepath + " fail, please check it first!!");
        }

        Element root = doc.getRootElement();
        Element service = root.element("Service");
        Element connector = service.element("Connector");
        String value = connector.attributeValue("port");

        return Integer.parseInt(value);
    }
	
    public static String fileSeparator() {
        return System.getProperty(FILE_SEPARATOR);
    }
    
    public static String getRemoteIp(final HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))
			ip = request.getHeader("Proxy-Client-IP");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))
			ip = request.getHeader("WL-Proxy-Client-IP");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		} else {
			if (ip.indexOf(",") != -1) {
				String[] address = ip.split(",");
				ip = address[0];
				for (int i = 0; i < address.length; i++) {
					if (!"unknown".equalsIgnoreCase(address[i].trim())) {
						ip = address[i].trim();
						break;
					}
				}
			}
		}
		return ip;
	}
}
