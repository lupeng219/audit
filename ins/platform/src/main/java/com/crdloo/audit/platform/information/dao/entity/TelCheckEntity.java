package com.crdloo.audit.platform.information.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import com.crdloo.audit.framework.common.dao.entity.BaseEntity;
@Entity
@Table(name = "bfd_telCheck")
public class TelCheckEntity extends BaseEntity{
	private static final long serialVersionUID = 4065294738168332768L;

	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(name="swift_number",length=50)
	private String swift_number ;//流水号
    
	@Column(name = "flag_telCheck", length = 10)
	private Integer flag_telCheck=10;// 手机三要素—移动联通电信产品计费标识:1计费，0不计费
	
    @Column(name = "operation", length = 10)
    private String operation="";// 运营商类别:1：电信 2：联通 3：移动 4：其他，如170号段等
    
    @Column(name = "result", length = 10)
    private String result="";// 三要素验证结果:0：查无此号或手机非实名认证；1：均一致；2：均不一致；3、手机号与姓名一致，与身份证号不一致
    

	public TelCheckEntity() {
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

	public Integer getFlag_telCheck() {
		return flag_telCheck;
	}

	public void setFlag_telCheck(Integer flag_telCheck) {
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
