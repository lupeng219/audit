package com.crdloo.audit.framework.router.cluster;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.crdloo.audit.framework.constant.Const;
import com.crdloo.audit.framework.router.utils.SystemUtil;

public class Address {
	
	private static Pattern ipPattern = Pattern.compile(Const.IP_REGEX);

	private String ip;
    private int port;
    
    public Address(){
    	
    }
    
    public Address(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
    
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ip == null) ? 0 : ip.hashCode());
        result = prime * result + port;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Address other = (Address) obj;
        if (ip == null) {
            if (other.ip != null)
                return false;
        } else if (!ip.equals(other.ip))
            return false;
        if (port != other.port)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Address [ip=" + ip + ", port=" + port + "]";
    }

    public String uri() {
        return "http://" + ip + ":" + port;
    }

    /**
     * 判断ip格式是否正确
     * 
     * @param ip
     * @return
     */
    public static boolean ipValid(String ip) {
        Matcher m = ipPattern.matcher(ip);
        return m.matches();
    }

    /**
     * 查找地址
     * 
     * @param host
     * @param port
     * @return
     */
    public static Address found(String host, int port) {
        String ip = (ipValid(host)) ? host : SystemUtil.host2ip(host);
        return new Address(ip, port);
    }

    /**
     * 查找地址
     * 
     * @param server
     * @return
     */
    public static Address found(String server) {
        String[] array = server.split(":");
        return found(array[0], Integer.parseInt(array[1]));
    }
    
}
