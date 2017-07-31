package com.crdloo.audit.platform.log.dao.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import com.crdloo.audit.framework.common.dao.entity.BaseEntity;
@Entity
@Table(name = "opt_query_log")
public class QueryLogEntity extends BaseEntity{
    
    private static final long serialVersionUID = -6102805413682735601L;
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "employeeId", length = 20)
    private Long employeeId;  
    
    @Column(name = "querytype", length = 4)
    private Integer querytype;
    
    @Column(name = "result", length = 10)
    private String result="";
    
    @Column(name = "params", length = 300)
    private String params="";
    
    @Column(name = "swiftnumber", length = 50)
    private String swiftnumber="";
    
    @Column(name = "hitcache", length = 4)
    private Integer hitcache;
    
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    
    @Column(name = "updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated;
    
    @Column(name = "status")
    private int status;
    
    public QueryLogEntity(){
    	
    }
    
    public QueryLogEntity(Long employeeId, int type, String result, String condition, String swiftnumber, boolean hitcache){
    	this.employeeId = employeeId;
    	this.querytype = type;
    	this.result = result;
    	this.params = condition;
    	this.swiftnumber = swiftnumber == null ? "" : swiftnumber;
    	if(hitcache){
    		this.hitcache = 1;
    	}else{
    		this.hitcache = 0;
    	}
    	this.created = new Date();
    	this.updated = new Date();
    	this.status = 1;
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }
    public Integer getQuerytype() {
		return querytype;
	}
	public void setQuerytype(Integer querytype) {
		this.querytype = querytype;
	}
	public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
    public String getParams() {
		return params;
	}
	public void setParams(String params) {
		this.params = params;
	}
	public String getSwiftnumber() {
        return swiftnumber;
    }
    public void setSwiftnumber(String swiftnumber) {
        this.swiftnumber = swiftnumber;
    }
    public Integer getHitcache() {
        return hitcache;
    }
    public void setHitcache(Integer hitcache) {
        this.hitcache = hitcache;
    }
    public Date getCreated() {
        return created;
    }
    public void setCreated(Date created) {
        this.created = created;
    }
    public Date getUpdated() {
        return updated;
    }
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    @Override
    public String toString() {
        String[] others = new String[] {};
        return ReflectionToStringBuilder.toStringExclude(this, others);
    }
    
}
