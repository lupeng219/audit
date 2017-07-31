package com.crdloo.audit.web.creditEvaluation.enums;

public enum TelPerValueEnum {
    /**
     * 手机在网时长区间:空：无结果 1：[0,6) 2：[6,12) 3：[12,24) 4：[24,+) 单位：月
     */
    NULL("","无结果"),
    FIRST("1","0~6个月"),
    SECOND("2","6~12个月"),
    THIRD("3","12~24个月"),
    FOURTH("4","24个月以上");
    private String code;
    private String name;

    private TelPerValueEnum(String code, String name) {
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

    public static TelPerValueEnum getEnum(String value) {
        for (TelPerValueEnum e : TelPerValueEnum.values()) {
            if (value.equals(e.getCode())) {
                return e;
            }
        }
        return null;
    }

}
