package com.crdloo.audit.framework.common.filter;

public enum ContentType {

	DEfAULT("application/json; charset=UTF-8"),

    FROM("application/x-www-form-urlencoded"), // done
    JSON("application/json"), // done
    XMLTEXT("text/xml"), // done
    PLAINTEXT("text/plain"), XMLAPPLICATION("application/xml"), 
    MULTIPART_FORMDATA("multipart/form-data"); // done

    private String value;

    ContentType(String value) {
    	this.value = value;
    }
    
    public String getValue() {
        return value;
    }

    public static ContentType support(String contentType) {
        if (contentType == null || contentType.trim().length() == 0
                || contentType.toLowerCase().startsWith(ContentType.FROM.getValue())) {
            return FROM;
        } else if (contentType.toLowerCase().startsWith(ContentType.JSON.getValue())) {
            return JSON;
        } else if (contentType.toLowerCase().startsWith(ContentType.XMLTEXT.getValue())) {
            return XMLTEXT;
        } else if (contentType.toLowerCase().startsWith(ContentType.MULTIPART_FORMDATA.getValue())) {
            return MULTIPART_FORMDATA;
        } else {
            return null;
        }
    }
    
}
