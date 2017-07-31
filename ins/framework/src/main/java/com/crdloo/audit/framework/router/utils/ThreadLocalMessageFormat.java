package com.crdloo.audit.framework.router.utils;

import java.text.MessageFormat;

public class ThreadLocalMessageFormat extends ThreadLocal<MessageFormat> {

	private MessageFormat messageFormat;

    public ThreadLocalMessageFormat(String pattern) {
        super();
        messageFormat = new MessageFormat(pattern);
    }

	@Override
	protected MessageFormat initialValue() {
		return (MessageFormat) messageFormat.clone();
	}

}
