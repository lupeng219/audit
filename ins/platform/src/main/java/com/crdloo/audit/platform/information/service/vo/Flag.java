package com.crdloo.audit.platform.information.service.vo;

public class Flag {
    
    private Integer flag_bankthree;//银行卡三要素
    
    private Integer flag_idtwo_z;//身份证二要素验证
    private Integer flag_telCheck;
    
    public Integer getFlag_telCheck() {
		return flag_telCheck;
	}

	public void setFlag_telCheck(Integer flag_telCheck) {
		this.flag_telCheck = flag_telCheck;
	}

	public Integer getFlag_bankthree() {
        return flag_bankthree;
    }

    public void setFlag_bankthree(Integer flag_bankthree) {
        this.flag_bankthree = flag_bankthree;
    }

    public Integer getFlag_idtwo_z() {
        return flag_idtwo_z;
    }

    public void setFlag_idtwo_z(Integer flag_idtwo_z) {
        this.flag_idtwo_z = flag_idtwo_z;
    }
    
    
}
