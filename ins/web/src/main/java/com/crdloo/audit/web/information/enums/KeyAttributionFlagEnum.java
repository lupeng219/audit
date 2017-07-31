package com.crdloo.audit.web.information.enums;

public enum KeyAttributionFlagEnum {
    /**
     * 身份证号手机号归属地产品输出标志:1(输出成功),0(未匹配上无输出),98(用户输入信息不足),99(系统异常)
     */
    FIRST("1","输出成功"),
    SECOND("0","未匹配上无输出"),
    THIRD("98","用户输入信息不足"),
    FOURTH("99","系统异常");

    private String code;
    private String name;

    private KeyAttributionFlagEnum(String code, String name) {
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

    public static KeyAttributionFlagEnum getEnum(String value) {
        for (KeyAttributionFlagEnum e : KeyAttributionFlagEnum.values()) {
            if (value.equals(e.getCode())) {
                return e;
            }
        }
        return null;
    }

}
