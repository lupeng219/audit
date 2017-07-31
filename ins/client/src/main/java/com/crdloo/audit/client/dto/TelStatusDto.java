package com.crdloo.audit.client.dto;


import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import com.crdloo.audit.framework.client.IDto;
public class TelStatusDto implements IDto{
	private static final long serialVersionUID = 592642153090210966L;
    private Long id;
	private String swift_number  = "";//流水号
    
	private Integer flag_telstatus;// 手机在网状态—移动联通电信产品计费标识:1计费，0不计费
    
	private String result = "";// 查询结果:1：查询成功 0：查无结果 2：请求超时 3：系统异常
    private String operation = "";// 运营商类别:1：电信 2：联通 3：移动 4：其他，如170号段等
    
	private String value = "";// 手机在网状态—移动联通电信:空：无结果 1：正常 2：停机 3：销号 4：异常（包括预销号、不在网；联通手机号非正常状态均返回此值）

	public TelStatusDto() {
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


	public Integer getFlag_telstatus() {
		return flag_telstatus;
	}

	public void setFlag_telstatus(Integer flag_telstatus) {
		this.flag_telstatus = flag_telstatus;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		String[] others = new String[] {};
		return ReflectionToStringBuilder.toStringExclude(this, others);
	}
}
