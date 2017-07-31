package com.crdloo.audit.client.dto;


import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import com.crdloo.audit.framework.client.IDto;
public class PhoneRecogDto implements IDto{

	private static final long serialVersionUID = -9175920150084760644L;
	private Long id;
	private String swift_number = "";//流水号
    
	private Integer flag_phonerecog;// 计费标识:1计费，0不计费
	
    private String status = "";//接口返回状态:0：正常；非0：错误
    
    
    private String name = "";// 商户名称:查到的电话描述信息

    private String telnum = "";// 电话号码:
    
    private String teldesc = "";// 电话描述:例：短信银行身份验证专线
    private String catnames = "";// 分类名称
    
    
    
	public PhoneRecogDto() {
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
	public Integer getFlag_phonerecog() {
		return flag_phonerecog;
	}
	public void setFlag_phonerecog(Integer flag_phonerecog) {
		this.flag_phonerecog = flag_phonerecog;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelnum() {
		return telnum;
	}
	public void setTelnum(String telnum) {
		this.telnum = telnum;
	}
	public String getTeldesc() {
		return teldesc;
	}
	public void setTeldesc(String teldesc) {
		this.teldesc = teldesc;
	}
	public String getCatnames() {
		return catnames;
	}
	public void setCatnames(String catnames) {
		this.catnames = catnames;
	}
	@Override
	public String toString() {
		String[] others = new String[] {};
		return ReflectionToStringBuilder.toStringExclude(this, others);
	}
    
}
