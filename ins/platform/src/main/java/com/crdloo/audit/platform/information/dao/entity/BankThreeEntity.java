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
@Table(name = "bfd_bankThree")
public class BankThreeEntity extends BaseEntity{
    private static final long serialVersionUID = 596139209348713108L;
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="swift_number",length=50)
    private String swift_number ;//流水号
    
    @Column(name="flag_bankthree",length=50)
    private Integer flag_bankthree=10;
    
    @Column(name="respCode",length=50)
    private String respCode="";
    
    @Column(name="respMsg",length=50)
    private String respMsg="";
    
    @Column(name="costTime",length=50)
    private Integer costTime=0;
    
    public BankThreeEntity() {
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
    public Integer getFlag_bankthree() {
        return flag_bankthree;
    }
    public void setFlag_bankthree(Integer flag_bankthree) {
        this.flag_bankthree = flag_bankthree;
    }
    public String getRespCode() {
        return respCode;
    }
    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }
    public String getRespMsg() {
        return respMsg;
    }
    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }
    public Integer getCostTime() {
        return costTime;
    }
    public void setCostTime(Integer costTime) {
        this.costTime = costTime;
    }
    @Override
    public String toString() {
        String[] others = new String[] {};
        return ReflectionToStringBuilder.toStringExclude(this, others);
    }

}
