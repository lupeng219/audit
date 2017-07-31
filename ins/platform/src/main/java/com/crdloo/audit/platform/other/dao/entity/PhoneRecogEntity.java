package com.crdloo.audit.platform.other.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.crdloo.audit.framework.common.dao.entity.BaseEntity;
@Entity
@Table(name = "bfd_phoneRecog")
public class PhoneRecogEntity extends BaseEntity{

	private static final long serialVersionUID = -3037258557364649114L;
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(name="swift_number",length=50)
	private String swift_number ;//流水号
    
	@Column(name = "flag_phonerecog", length = 1)
	private Integer flag_phonerecog;// 计费标识:1计费，0不计费
	
    @Column(name = "status", length = 10)
    private String status;//接口返回状态:0：正常；非0：错误
    
    
    @Column(name = "name", length = 10)
    private String name;// 商户名称:查到的电话描述信息

    @Column(name = "telnum", length = 10)
    private String telnum;// 电话号码:
    
    @Column(name = "teldesc", length = 10)
    private String teldesc;// 电话描述:例：短信银行身份验证专线
    @Column(name = "catnames", length = 10)
    private String catnames;// 分类名称
    
    
    
	public PhoneRecogEntity() {
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
	public Integer getFlag_phonerecog() {
		return flag_phonerecog;
	}
	public void setFlag_phonerecog(Integer flag_phonerecog) {
		this.flag_phonerecog = flag_phonerecog;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelnum() {
		return telnum;
	}
	public void setTelnum(String telnum) {
		this.telnum = telnum;
	}
	public String getTeldesc() {
		return teldesc;
	}
	public void setTeldesc(String teldesc) {
		this.teldesc = teldesc;
	}
	public String getCatnames() {
		return catnames;
	}
	public void setCatnames(String catnames) {
		this.catnames = catnames;
	}
    
}
