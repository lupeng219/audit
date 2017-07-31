package com.crdloo.audit.client.dto;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import com.crdloo.audit.framework.client.IDto;

public class BankThreeDto implements IDto {
    private static final long serialVersionUID = 8305831930044485910L;
    private Long id;
    
    private String swift_number;//流水号
    
    private Integer flag_bankthree = 10;
    
    private String respCode = "";
    
    private String respMsg = "";
    
    private Integer costTime = 0;
    
    public BankThreeDto(){
        
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

    public Integer getFlag_bankthree() {
        return flag_bankthree;
    }

    public void setFlag_bankthree(Integer flag_bankthree) {
        this.flag_bankthree = flag_bankthree;
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
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
