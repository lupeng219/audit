package com.crdloo.audit.platform.creditEvaluation.service.vo;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class Data {
	private String value = "";

	public Data() {
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
