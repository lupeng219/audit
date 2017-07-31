package com.crdloo.audit.client.dto;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import com.crdloo.audit.framework.client.IDto;

public class IdTwo_zDto implements IDto{

    private static final long serialVersionUID = 2049807569292953444L;
    private Long id;
    private String swift_number ;//流水号
    private Integer flag_idtwo_z=0;
    private String result="";
    private String guid="";
    private String message="";
    private Integer costTime=0;
    
    public IdTwo_zDto(){
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSwift_number() {
        return swift_number;
    }

    public void setSwift_number(String swift_number) {
        this.swift_number = swift_number;
    }

    public Integer getFlag_idtwo_z() {
        return flag_idtwo_z;
    }

    public void setFlag_idtwo_z(Integer flag_idtwo_z) {
        this.flag_idtwo_z = flag_idtwo_z;
    }

    

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

   
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCostTime() {
        return costTime;
    }

    public void setCostTime(Integer costTime) {
        this.costTime = costTime;
    }
    @Override
	public String toString() {
		String[] others = new String[] {};
		return ReflectionToStringBuilder.toStringExclude(this, others);
	}
    

}
