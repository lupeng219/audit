package com.crdloo.audit.web.creditEvaluation.enums;

public enum TelResultEnum {
    /**
     * 查询结果:1：查询成功 0：查无结果 2：请求超时 3：系统异常
     */
    SUCCESS("1","查询成功"),
    NOTFOUND("0","查无结果"),
    RETIMEOUT("2","请求超时"),
    SystemException("3","系统异常");
    private String code;
    private String name;

    private TelResultEnum(String code, String name) {
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

    public static TelResultEnum getEnum(String value) {
        for (TelResultEnum e : TelResultEnum.values()) {
            if (value.equals(e.getCode())) {
                return e;
            }
        }
        return null;
    }

}
