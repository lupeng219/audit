package com.crdloo.audit.client.dto;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import com.crdloo.audit.framework.client.IDto;

/**
 * 身份证号手机号归属地

 * @author hs
 *
 * @date 2017年7月20日
 */
public class KeyAttributionDto implements IDto {

	private static final long serialVersionUID = -980474957844638660L;

    private Long id;
    private String swift_number = "";//流水号
    private String flag_keyattribution = "";// 身份证号手机号归属地产品输出标志:1(输出成功),0(未匹配上无输出),98(用户输入信息不足),99(系统异常)
    
    private String ka_id_province = "";// 身份证号归属省:例：陕西省
    
    private String ka_id_city = "";// 身份证号归属市
    
    private String ka_cell_province = "";// 手机所属省
    
    private String ka_cell_city = "";// 手机所属城市
    
    private String ka_cell_card_type = "";// 手机卡类型:例：移动神州行卡
    

	public KeyAttributionDto() {
	}

	public String getSwift_number() {
		return swift_number;
	}

	public void setSwift_number(String swift_number) {
		this.swift_number = swift_number;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKa_id_province() {
		return ka_id_province;
	}

	public void setKa_id_province(String ka_id_province) {
		this.ka_id_province = ka_id_province;
	}

	public String getKa_id_city() {
		return ka_id_city;
	}

	public void setKa_id_city(String ka_id_city) {
		this.ka_id_city = ka_id_city;
	}

	public String getKa_cell_province() {
		return ka_cell_province;
	}

	public void setKa_cell_province(String ka_cell_province) {
		this.ka_cell_province = ka_cell_province;
	}

	public String getKa_cell_city() {
		return ka_cell_city;
	}

	public void setKa_cell_city(String ka_cell_city) {
		this.ka_cell_city = ka_cell_city;
	}

	public String getKa_cell_card_type() {
		return ka_cell_card_type;
	}

	public void setKa_cell_card_type(String ka_cell_card_type) {
		this.ka_cell_card_type = ka_cell_card_type;
	}

	public String getFlag_keyattribution() {
		return flag_keyattribution;
	}

	public void setFlag_keyattribution(String flag_keyattribution) {
		this.flag_keyattribution = flag_keyattribution;
	}
	@Override
	public String toString() {
		String[] others = new String[] {};
		return ReflectionToStringBuilder.toStringExclude(this, others);
	}
}
