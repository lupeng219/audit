package com.crdloo.audit.platform.creditEvaluation.service.vo;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class Product {
	private String result="";
    private String operation="";
	private Data data;
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
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public Product() {
	}
	@Override
	public String toString() {
		String[] others = new String[] {};
		return ReflectionToStringBuilder.toStringExclude(this, others);
	}
}
