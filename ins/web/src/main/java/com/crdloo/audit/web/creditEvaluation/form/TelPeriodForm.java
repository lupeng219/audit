package com.crdloo.audit.web.creditEvaluation.form;


import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class TelPeriodForm implements Serializable{
	private static final long serialVersionUID = -277285018465725630L;
	private Long id;
	private String swift_number  = "";//流水号
    
	private String flag_telperiod;// 手机在网时长—移动联通电信产品计费标识:1计费，0不计费
    
	private String result = "";// 查询结果:1：查询成功 0：查无结果 2：请求超时 3：系统异常
    private String operation = "";// 运营商类别:1：电信 2：联通 3：移动 4：其他，如170号段等
    
	private String value = "";// 手机在网时长区间—移动联通电信:空：无结果 1：[0,6) 2：[6,12) 3：[12,24) 4：[24,+) 单位：月


	public TelPeriodForm() {
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


	public String getFlag_telperiod() {
		return flag_telperiod;
	}

	public void setFlag_telperiod(String flag_telperiod) {
		this.flag_telperiod = flag_telperiod;
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
