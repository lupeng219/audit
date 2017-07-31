package com.crdloo.audit.web.login.form;

import java.io.Serializable;
import java.util.List;

import com.crdloo.audit.client.dto.PowerDto;

/**
 * 首页菜单实体类
 * 
 * @author Administrator
 *
 */
public class Index_MenuForm implements Serializable {

    private static final long serialVersionUID = 1L;

    // 菜单名称
    private String menuName;

    // 菜单类名
    private String className;

    // 二级菜单
    private List<PowerDto> subMenuName;

    // 权限名称
    private String powerName;

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<PowerDto> getSubMenuName() {
        return subMenuName;
    }

    public void setSubMenuName(List<PowerDto> subMenuName) {
        this.subMenuName = subMenuName;
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }
}
