package com.crdloo.audit.client.dto;


import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import com.crdloo.audit.framework.client.IDto;
public class InfoRelationDto implements IDto{
	private static final long serialVersionUID = 1539202476469256985L;
	private Long id;
	private String swift_number = "";//流水号
	private Integer flag_inforelation;// 计费标识:1计费，0不计费
	private String ir_id_x_cell_cnt = "";
	private String ir_id_x_mail_cnt = "";
	private String ir_cell_x_id_cnt = "";
	private String ir_cell_x_mail_cnt = "";
	private String ir_id_inlistwith_cell = "";
	private String ir_cell_inlistwith_id = "";
	private String ir_allmatch_days = "";
	private String ir_id_x_cell_notmat_days = "";
	private String ir_cell_x_id_notmat_days = "";
	private String ir_id_x_cell_lastchg_days = "";
	private String ir_cell_x_id_lastchg_days = "";
	private String ir_m1_id_x_cell_cnt = "";
	private String ir_m1_id_x_mail_cnt = "";
	private String ir_m1_cell_x_id_cnt = "";
	private String ir_m1_cell_x_mail_cnt = "";
	private String ir_m3_id_x_cell_cnt = "";
	private String ir_m3_id_x_mail_cnt = "";
	private String ir_m3_cell_x_id_cnt = "";
	private String ir_m3_cell_x_mail_cnt = "";
	private String ir_m6_id_x_cell_cnt = "";
	private String ir_m6_id_x_mail_cnt = "";
	private String ir_m6_cell_x_id_cnt = "";
	private String ir_m6_cell_x_mail_cnt = "";
	private String ir_m12_id_x_cell_cnt = "";
	private String ir_m12_id_x_mail_cnt = "";
	private String ir_m12_cell_x_id_cnt = "";
	private String ir_m12_cell_x_mail_cnt = "";

	public InfoRelationDto() {
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

	public Integer getFlag_inforelation() {
		return flag_inforelation;
	}

	public void setFlag_inforelation(Integer flag_inforelation) {
		this.flag_inforelation = flag_inforelation;
	}

	public String getIr_id_x_cell_cnt() {
		return ir_id_x_cell_cnt;
	}

	public void setIr_id_x_cell_cnt(String ir_id_x_cell_cnt) {
		this.ir_id_x_cell_cnt = ir_id_x_cell_cnt;
	}

	public String getIr_id_x_mail_cnt() {
		return ir_id_x_mail_cnt;
	}

	public void setIr_id_x_mail_cnt(String ir_id_x_mail_cnt) {
		this.ir_id_x_mail_cnt = ir_id_x_mail_cnt;
	}

	public String getIr_cell_x_id_cnt() {
		return ir_cell_x_id_cnt;
	}

	public void setIr_cell_x_id_cnt(String ir_cell_x_id_cnt) {
		this.ir_cell_x_id_cnt = ir_cell_x_id_cnt;
	}

	public String getIr_cell_x_mail_cnt() {
		return ir_cell_x_mail_cnt;
	}

	public void setIr_cell_x_mail_cnt(String ir_cell_x_mail_cnt) {
		this.ir_cell_x_mail_cnt = ir_cell_x_mail_cnt;
	}

	public String getIr_id_inlistwith_cell() {
		return ir_id_inlistwith_cell;
	}

	public void setIr_id_inlistwith_cell(String ir_id_inlistwith_cell) {
		this.ir_id_inlistwith_cell = ir_id_inlistwith_cell;
	}

	public String getIr_cell_inlistwith_id() {
		return ir_cell_inlistwith_id;
	}

	public void setIr_cell_inlistwith_id(String ir_cell_inlistwith_id) {
		this.ir_cell_inlistwith_id = ir_cell_inlistwith_id;
	}

	public String getIr_allmatch_days() {
		return ir_allmatch_days;
	}

	public void setIr_allmatch_days(String ir_allmatch_days) {
		this.ir_allmatch_days = ir_allmatch_days;
	}

	public String getIr_id_x_cell_notmat_days() {
		return ir_id_x_cell_notmat_days;
	}

	public void setIr_id_x_cell_notmat_days(String ir_id_x_cell_notmat_days) {
		this.ir_id_x_cell_notmat_days = ir_id_x_cell_notmat_days;
	}

	public String getIr_cell_x_id_notmat_days() {
		return ir_cell_x_id_notmat_days;
	}

	public void setIr_cell_x_id_notmat_days(String ir_cell_x_id_notmat_days) {
		this.ir_cell_x_id_notmat_days = ir_cell_x_id_notmat_days;
	}

	public String getIr_id_x_cell_lastchg_days() {
		return ir_id_x_cell_lastchg_days;
	}

	public void setIr_id_x_cell_lastchg_days(String ir_id_x_cell_lastchg_days) {
		this.ir_id_x_cell_lastchg_days = ir_id_x_cell_lastchg_days;
	}

	public String getIr_cell_x_id_lastchg_days() {
		return ir_cell_x_id_lastchg_days;
	}

	public void setIr_cell_x_id_lastchg_days(String ir_cell_x_id_lastchg_days) {
		this.ir_cell_x_id_lastchg_days = ir_cell_x_id_lastchg_days;
	}

	public String getIr_m1_id_x_cell_cnt() {
		return ir_m1_id_x_cell_cnt;
	}

	public void setIr_m1_id_x_cell_cnt(String ir_m1_id_x_cell_cnt) {
		this.ir_m1_id_x_cell_cnt = ir_m1_id_x_cell_cnt;
	}

	public String getIr_m1_id_x_mail_cnt() {
		return ir_m1_id_x_mail_cnt;
	}

	public void setIr_m1_id_x_mail_cnt(String ir_m1_id_x_mail_cnt) {
		this.ir_m1_id_x_mail_cnt = ir_m1_id_x_mail_cnt;
	}

	public String getIr_m1_cell_x_id_cnt() {
		return ir_m1_cell_x_id_cnt;
	}

	public void setIr_m1_cell_x_id_cnt(String ir_m1_cell_x_id_cnt) {
		this.ir_m1_cell_x_id_cnt = ir_m1_cell_x_id_cnt;
	}

	public String getIr_m1_cell_x_mail_cnt() {
		return ir_m1_cell_x_mail_cnt;
	}

	public void setIr_m1_cell_x_mail_cnt(String ir_m1_cell_x_mail_cnt) {
		this.ir_m1_cell_x_mail_cnt = ir_m1_cell_x_mail_cnt;
	}

	public String getIr_m3_id_x_cell_cnt() {
		return ir_m3_id_x_cell_cnt;
	}

	public void setIr_m3_id_x_cell_cnt(String ir_m3_id_x_cell_cnt) {
		this.ir_m3_id_x_cell_cnt = ir_m3_id_x_cell_cnt;
	}

	public String getIr_m3_id_x_mail_cnt() {
		return ir_m3_id_x_mail_cnt;
	}

	public void setIr_m3_id_x_mail_cnt(String ir_m3_id_x_mail_cnt) {
		this.ir_m3_id_x_mail_cnt = ir_m3_id_x_mail_cnt;
	}

	public String getIr_m3_cell_x_id_cnt() {
		return ir_m3_cell_x_id_cnt;
	}

	public void setIr_m3_cell_x_id_cnt(String ir_m3_cell_x_id_cnt) {
		this.ir_m3_cell_x_id_cnt = ir_m3_cell_x_id_cnt;
	}

	public String getIr_m3_cell_x_mail_cnt() {
		return ir_m3_cell_x_mail_cnt;
	}

	public void setIr_m3_cell_x_mail_cnt(String ir_m3_cell_x_mail_cnt) {
		this.ir_m3_cell_x_mail_cnt = ir_m3_cell_x_mail_cnt;
	}

	public String getIr_m6_id_x_cell_cnt() {
		return ir_m6_id_x_cell_cnt;
	}

	public void setIr_m6_id_x_cell_cnt(String ir_m6_id_x_cell_cnt) {
		this.ir_m6_id_x_cell_cnt = ir_m6_id_x_cell_cnt;
	}

	public String getIr_m6_id_x_mail_cnt() {
		return ir_m6_id_x_mail_cnt;
	}

	public void setIr_m6_id_x_mail_cnt(String ir_m6_id_x_mail_cnt) {
		this.ir_m6_id_x_mail_cnt = ir_m6_id_x_mail_cnt;
	}

	public String getIr_m6_cell_x_id_cnt() {
		return ir_m6_cell_x_id_cnt;
	}

	public void setIr_m6_cell_x_id_cnt(String ir_m6_cell_x_id_cnt) {
		this.ir_m6_cell_x_id_cnt = ir_m6_cell_x_id_cnt;
	}

	public String getIr_m6_cell_x_mail_cnt() {
		return ir_m6_cell_x_mail_cnt;
	}

	public void setIr_m6_cell_x_mail_cnt(String ir_m6_cell_x_mail_cnt) {
		this.ir_m6_cell_x_mail_cnt = ir_m6_cell_x_mail_cnt;
	}

	public String getIr_m12_id_x_cell_cnt() {
		return ir_m12_id_x_cell_cnt;
	}

	public void setIr_m12_id_x_cell_cnt(String ir_m12_id_x_cell_cnt) {
		this.ir_m12_id_x_cell_cnt = ir_m12_id_x_cell_cnt;
	}

	public String getIr_m12_id_x_mail_cnt() {
		return ir_m12_id_x_mail_cnt;
	}

	public void setIr_m12_id_x_mail_cnt(String ir_m12_id_x_mail_cnt) {
		this.ir_m12_id_x_mail_cnt = ir_m12_id_x_mail_cnt;
	}

	public String getIr_m12_cell_x_id_cnt() {
		return ir_m12_cell_x_id_cnt;
	}

	public void setIr_m12_cell_x_id_cnt(String ir_m12_cell_x_id_cnt) {
		this.ir_m12_cell_x_id_cnt = ir_m12_cell_x_id_cnt;
	}

	public String getIr_m12_cell_x_mail_cnt() {
		return ir_m12_cell_x_mail_cnt;
	}

	public void setIr_m12_cell_x_mail_cnt(String ir_m12_cell_x_mail_cnt) {
		this.ir_m12_cell_x_mail_cnt = ir_m12_cell_x_mail_cnt;
	}

	@Override
	public String toString() {
		String[] others = new String[] {};
		return ReflectionToStringBuilder.toStringExclude(this, others);
	}
}
