package com.crdloo.audit.web.information.enums;

public enum TelCheckResultEnum {
    /**
     * 三要素验证结果:0：查无此号或手机非实名认证；1：均一致；2：均不一致；3、手机号与姓名一致，与身份证号不一致
     */
    FIRST("0","查无此号或手机非实名认证"),
    SECOND("1","均一致"),
    THIRD("2","均不一致"),
    FOURTH("3","手机号与姓名一致，与身份证号不一致");

    private String code;
    private String name;

    private TelCheckResultEnum(String code, String name) {
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

    public static TelCheckResultEnum getEnum(String value) {
        for (TelCheckResultEnum e : TelCheckResultEnum.values()) {
            if (value.equals(e.getCode())) {
                return e;
            }
        }
        return null;
    }

}
