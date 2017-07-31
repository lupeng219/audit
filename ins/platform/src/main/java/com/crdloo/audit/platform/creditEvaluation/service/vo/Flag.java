package com.crdloo.audit.platform.creditEvaluation.service.vo;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class Flag {
	
	private Integer flag_telstatus ;
	private Integer flag_telperiod ;

	public Integer getFlag_telstatus() {
		return flag_telstatus;
	}
	public void setFlag_telstatus(Integer flag_telstatus) {
		this.flag_telstatus = flag_telstatus;
	}
	public Integer getFlag_telperiod() {
		return flag_telperiod;
	}
	public void setFlag_telperiod(Integer flag_telperiod) {
		this.flag_telperiod = flag_telperiod;
	}
	public Flag() {
	}
	@Override
	public String toString() {
		String[] others = new String[] {};
		return ReflectionToStringBuilder.toStringExclude(this, others);
	}

}
