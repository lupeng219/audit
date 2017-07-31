package com.crdloo.audit.framework.common.filter;

public class ResultStatus {

	private static String STATUS = "status";
    private static String MESSAGE = "message";
    private static String DATA = "data";

    private final static ResultStatus OK = new ResultStatus(0, "OK");
    private final static ResultStatus UNKNOWN = new ResultStatus(-1, "ERROR");

    public static final String INPUT = "input"; // 输入请求
    public static final String OUTPUT = "output"; // 返回请求

    private int status;
    private String message;

    public ResultStatus(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("ResultStatus [status=%s, message=%s]", status, message);
    }

    public static ResultStatus ok() {
        return OK;
    }

    public static ResultStatus unknown() {
        return UNKNOWN;
    }

    public static String status() {
        return STATUS;
    }

    public static void status(String status) {
        STATUS = status;
    }

    public static String message() {
        return MESSAGE;
    }

    public static void message(String message) {
        MESSAGE = message;
    }

    public static String data() {
        return DATA;
    }

    public static void data(String data) {
        DATA = data;
    }

    public static ResultStatus unknown(String message) {
        return new ResultStatus(UNKNOWN.getStatus(), message);
    }
    
}
