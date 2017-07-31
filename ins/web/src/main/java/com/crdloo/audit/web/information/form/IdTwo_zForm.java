package com.crdloo.audit.web.information.form;

import java.io.Serializable;

import com.crdloo.audit.client.dto.IdTwo_zDto;
import com.crdloo.audit.web.information.enums.BankThreeFlagEnum;

public class IdTwo_zForm implements Serializable{

    private static final long serialVersionUID = 5506211775481949020L;
    
    private String flag_idtwo_z;
    private String RESULT;
    private String MESSAGE;
    
    
    public IdTwo_zForm(IdTwo_zDto dto ) {
        if (dto != null){
            this.flag_idtwo_z = BankThreeFlagEnum.getEnum(dto.getFlag_idtwo_z()).getName();
            this.RESULT=dto.getResult();
            this.MESSAGE =dto.getMessage();
        }
       
    }
    
    public String getFlag_idtwo_z() {
        return flag_idtwo_z;
    }
    public void setFlag_idtwo_z(String flag_idtwo_z) {
        this.flag_idtwo_z = flag_idtwo_z;
    }
    public String getRESULT() {
        return RESULT;
    }
    public void setRESULT(String rESULT) {
        RESULT = rESULT;
    }
    public String getMESSAGE() {
        return MESSAGE;
    }
    public void setMESSAGE(String mESSAGE) {
        MESSAGE = mESSAGE;
    }
    
    
}
