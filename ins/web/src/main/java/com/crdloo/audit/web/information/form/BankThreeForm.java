package com.crdloo.audit.web.information.form;

import java.io.Serializable;

import com.crdloo.audit.client.dto.BankThreeDto;
import com.crdloo.audit.web.information.enums.BankThreeFlagEnum;

public class BankThreeForm implements Serializable{
    private static final long serialVersionUID = 4160367936604956858L;

    private String  flag_bankthree;
    
    private String respCode;
    
    private String respMsg;

    public BankThreeForm(BankThreeDto dto){
        if (dto != null){
            this.flag_bankthree = BankThreeFlagEnum.getEnum(dto.getFlag_bankthree()).getName();
            this.respCode = dto.getRespCode();
            this.respMsg = dto.getRespMsg();
        }
       
    }
    
    public String getFlag_bankthree() {
        return flag_bankthree;
    }

    public void setFlag_bankthree(String flag_bankthree) {
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
    
    
}
