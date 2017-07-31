package com.crdloo.audit.platform.sys.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.crdloo.audit.framework.common.dao.entity.BaseEntity;


@Entity
@Table(name = "sys_persona")
public class PersonaEntity extends BaseEntity{

   
    private static final long serialVersionUID = -4172836835141151875L;
    
    @Id
    @Column(name = "personaId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personaId; // 角色id
    
    @Column(name = "personaName", length = 50)
    private String personaName; // 角色名
    
    @Column(name = "personaDesc", length = 50)
    private String personaDesc;// 角色描述
    
    @Column(name = "personaEnable", length = 2)
    private String personaEnable;// 角色是否启用

    public Long getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Long personaId) {
        this.personaId = personaId;
    }

    public String getPersonaName() {
        return personaName;
    }

    public void setPersonaName(String personaName) {
        this.personaName = personaName;
    }

    public String getPersonaDesc() {
        return personaDesc;
    }

    public void setPersonaDesc(String personaDesc) {
        this.personaDesc = personaDesc;
    }

    public String getPersonaEnable() {
        return personaEnable;
    }

    public void setPersonaEnable(String personaEnable) {
        this.personaEnable = personaEnable;
    }

}
