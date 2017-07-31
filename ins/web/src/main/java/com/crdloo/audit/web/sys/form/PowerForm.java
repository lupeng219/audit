package com.crdloo.audit.web.sys.form;

import java.io.Serializable;

import com.crdloo.audit.client.dto.PowerDto;

public class PowerForm   implements Serializable  {

    private static final long serialVersionUID = 366572916709354601L;
    
    private Long powerId;
    
    private String powerUrl;// 权限路径
    
    private String menuName;// 菜单名称
    
    private Long parentId;// 父类菜单id
    
    private String powerName;// 权限名称
    
    private String tempStr;// 临时标志

    
    public PowerForm(){
        
    }
    public PowerForm(PowerDto dto){
        this.powerId = dto.getPowerId();
        this.powerUrl = dto.getPowerUrl();
        this.menuName = dto.getMenuName();
        this.parentId = dto.getParentId();
        this.powerName = dto.getPowerName();
    }

    public Long getPowerId() {
        return powerId;
    }

    public void setPowerId(Long powerId) {
        this.powerId = powerId;
    }

    public String getPowerUrl() {
        return powerUrl;
    }

    public void setPowerUrl(String powerUrl) {
        this.powerUrl = powerUrl;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }
    public String getTempStr() {
        return tempStr;
    }
    public void setTempStr(String tempStr) {
        this.tempStr = tempStr;
    }
    
   
}
