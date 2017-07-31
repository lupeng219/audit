package com.crdloo.audit.web.information.form;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;


public class TelCheckForm implements Serializable{
	private static final long serialVersionUID = -7563679327011073895L;
	private Long id;
	private String swift_number  = "";//流水号
    
	private String flag_telCheck;// 计费标识:1计费，0不计费
	
    private String operation = "";// 运营商类别:1：电信 2：联通 3：移动 4：其他，如170号段等
    
    private String result = "";// 三要素验证结果:0：查无此号或手机非实名认证；1：均一致；2：均不一致；3、手机号与姓名一致，与身份证号不一致
    

	public TelCheckForm() {
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


	public String getFlag_telCheck() {
		return flag_telCheck;
	}

	public void setFlag_telCheck(String flag_telCheck) {
		this.flag_telCheck = flag_telCheck;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		String[] others = new String[] {};
		return ReflectionToStringBuilder.toStringExclude(this, others);
	}
    
}
