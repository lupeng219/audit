package com.crdloo.audit.web.creditEvaluation.enums;

public enum TelStuValueEnum {
    /**
     * 手机在网状态:空：无结果 1：正常 2：停机 3：销号 4：异常（包括预销号、不在网；联通手机号非正常状态均返回此值）
     */
    NULL("","无结果"),
    NORMAL("1","正常"),
    STOP("2","停机"),
    CANCEL("3","销号"),
	Exception("4","异常");
    private String code;
    private String name;

    private TelStuValueEnum(String code, String name) {
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

    public static TelStuValueEnum getEnum(String value) {
        for (TelStuValueEnum e : TelStuValueEnum.values()) {
            if (value.equals(e.getCode())) {
                return e;
            }
        }
        return null;
    }

}
