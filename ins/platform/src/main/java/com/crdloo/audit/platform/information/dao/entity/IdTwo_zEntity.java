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
@Table(name = "bfd_idTwo_z")
public class IdTwo_zEntity  extends BaseEntity{
    
    private static final long serialVersionUID = -8007410425303311331L;
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="swift_number",length=50)
    private String swift_number ;//流水号
    
    @Column(name="flag_idtwo_z",length=50)
    private Integer flag_idtwo_z;
    
    @Column(name="result",length=50)
    private String result="";
    
    @Column(name="guid",length=50)
    private String guid="";
    
    @Column(name="message",length=50)
    private String message="";
    
    @Column(name="costTime",length=50)
    private Integer costTime=0;
    
    public IdTwo_zEntity() {
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

    public Integer getFlag_idtwo_z() {
        return flag_idtwo_z;
    }

    public void setFlag_idtwo_z(Integer flag_idtwo_z) {
        this.flag_idtwo_z = flag_idtwo_z;
    }

   

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

   

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
