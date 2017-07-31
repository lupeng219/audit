package com.crdloo.audit.client.dto;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import com.crdloo.audit.framework.client.IDto;

public class QueryLogDto  implements Serializable,IDto{
    
    private static final long serialVersionUID = 2351424130564663370L;
    
    private Long id;
    
    private Long employeeId = 0L;  
    
    private Integer type = 0;
    
    private Integer result = 0;
    
    private String condition = "";
    
    private String swiftnumber = "";
    
    private Integer hitcache = 0;
    
    private Date created;
    
    private Date updated;
    
    private int status = 1;
    
    public QueryLogDto(){
        
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
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
