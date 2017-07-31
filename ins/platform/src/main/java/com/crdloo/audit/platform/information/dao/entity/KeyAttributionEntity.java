package com.crdloo.audit.platform.information.dao.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import com.crdloo.audit.framework.common.dao.entity.BaseEntity;

/**
 * 身份证号手机号归属地

 * @author hs
 *
 * @date 2017年7月20日
 */
@Entity
@Table(name = "bfd_keyAttribution")
public class KeyAttributionEntity extends BaseEntity{

	private static final long serialVersionUID = -4191666360078085537L;

	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(name="swift_number",length=50)
	private String swift_number ;//流水号
    
	@Column(name = "flag_keyattribution", length = 10)
	private String flag_keyattribution="";// 身份证号手机号归属地产品输出标志:1(输出成功),0(未匹配上无输出),98(用户输入信息不足),99(系统异常)
	
    @Column(name = "ka_id_province", length = 100)
    private String ka_id_province="";// 身份证号归属省:例：陕西省
    
    @Column(name = "ka_id_city", length = 100)
    private String ka_id_city="";// 身份证号归属市
    
    @Column(name = "ka_cell_province", length = 100)
    private String ka_cell_province="";// 手机所属省
    
    @Column(name = "ka_cell_city", length = 100)
    private String ka_cell_city="";// 手机所属城市
    
    @Column(name = "ka_cell_card_type", length = 100)
    private String ka_cell_card_type="";// 手机卡类型:例：移动神州行卡
    
    
	public KeyAttributionEntity() {
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

	public String getSwift_number() {
		return swift_number;
	}

	public void setSwift_number(String swift_number) {
		this.swift_number = swift_number;
	}
	@Override
    public String toString() {
        String[] others = new String[] {};
        return ReflectionToStringBuilder.toStringExclude(this, others);
    }
}
