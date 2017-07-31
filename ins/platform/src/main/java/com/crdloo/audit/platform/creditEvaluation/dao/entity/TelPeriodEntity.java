package com.crdloo.audit.platform.creditEvaluation.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import com.crdloo.audit.framework.common.dao.entity.BaseEntity;
@Entity
@Table(name = "bfd_telPeriod")
public class TelPeriodEntity extends BaseEntity{

	private static final long serialVersionUID = -4408357213104672551L;
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(name="swift_number",length=50)
	private String swift_number ;//流水号
    
	@Column(name = "flag_telperiod", length = 10)
	private Integer flag_telperiod=10;// 手机在网时长—移动联通电信产品计费标识:1计费，0不计费
    
	@Column(name = "result", length = 10)
	private String result="";// 查询结果:1：查询成功 0：查无结果 2：请求超时 3：系统异常
	@Column(name = "operation", length = 10)
    private String operation="";// 运营商类别:1：电信 2：联通 3：移动 4：其他，如170号段等
    
	@Column(name = "value", length = 10)
	private String value="";// 手机在网时长区间—移动联通电信:空：无结果 1：[0,6) 2：[6,12) 3：[12,24) 4：[24,+) 单位：月


	public TelPeriodEntity() {
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

	public Integer getFlag_telperiod() {
		return flag_telperiod;
	}

	public void setFlag_telperiod(Integer flag_telperiod) {
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
