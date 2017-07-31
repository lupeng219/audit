package com.crdloo.audit.web.creditEvaluation.enums;

public enum TelOperationEnum {
	/**
	 * 运营商类型:1：电信；2：联通；3：移动；4：其他运营商，如170
	 */
    DIANXIN("1","电信"),
    LIANTONG("2","联通"),
    YIDONG("3","移动"),
    OTHERS("4","其他运营商");
    private String code;
    private String name;

    private TelOperationEnum(String code, String name) {
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

    public static TelOperationEnum getEnum(String value) {
        for (TelOperationEnum e : TelOperationEnum.values()) {
            if (value.equals(e.getCode())) {
                return e;
            }
        }
        return null;
    }

}
