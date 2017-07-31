package com.crdloo.audit.framework.client;

public enum EnumConnectType {

	SHORT("1", "短连接"), LONG("2", "长连接");
    
	 
    private String code;
    private String name;
    
    private EnumConnectType(String code, String name)
    {
        this.code = code;
        this.name = name;
    }
    
    public String getCode()
    {
        return code;
    }

    public String getName()
    {
        return name;
    }

}
