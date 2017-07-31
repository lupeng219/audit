package com.crdloo.audit.web.information.enums;

public enum BankThreeRespCodeEnum {


    
    MATCHING("00", "验证匹配"), NOMATCHING("01", "验证不匹配"),FORMATERROR("10","要素格式错误"),
    BANKPROBLEM("11","银行卡问题(比如挂失、冻结、失效等)"),NOSUPPORT("20","银行卡不支持验证");

    private String code;
    private String name;

    private BankThreeRespCodeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static BankThreeRespCodeEnum getEnum(String value) {
        for (BankThreeRespCodeEnum e : BankThreeRespCodeEnum.values()) {
            if (value.equals(e.getCode())) {
                return e;
            }
        }
        return null;
    }


}
