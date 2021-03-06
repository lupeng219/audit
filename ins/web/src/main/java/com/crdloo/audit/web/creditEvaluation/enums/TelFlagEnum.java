package com.crdloo.audit.web.creditEvaluation.enums;

public enum TelFlagEnum {
    
    FREE(0, "不收费"), CHARGE(1, "收费");

    private int code;
    private String name;

    private TelFlagEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static TelFlagEnum getEnum(int value) {
        for (TelFlagEnum e : TelFlagEnum.values()) {
            if (value == e.getCode()) {
                return e;
            }
        }
        return null;
    }

}
