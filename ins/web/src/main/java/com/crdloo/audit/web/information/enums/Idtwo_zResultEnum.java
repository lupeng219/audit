package com.crdloo.audit.web.information.enums;

public enum Idtwo_zResultEnum {

    
    AGREEMENT("1", "一致"), NOAGREEMENT("2", "不一致"),NOVERIFICATION("3","无法验证"),NONSTANDARD("-1","请求参数不标准");
    

    private String code;
    private String name;

    private Idtwo_zResultEnum(String code, String name) {
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

    public static Idtwo_zResultEnum getEnum(String value) {
        for (Idtwo_zResultEnum e : Idtwo_zResultEnum.values()) {
            if (value.equals(e.getCode())) {
                return e;
            }
        }
        return null;
    }


    
}
