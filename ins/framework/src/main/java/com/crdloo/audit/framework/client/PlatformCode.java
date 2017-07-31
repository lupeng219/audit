package com.crdloo.audit.framework.client;

import java.io.Serializable;

public interface PlatformCode extends Serializable {

	// 成功
	public static final Integer OK = 0;
	// 技术型异常
	public static final Integer SYS_EXCPTION = -1;
	// 连接超时
	public static final Integer SYS_TIMEOUT = -2;
	// 校检异常
	public static final Integer VALIDAT_EXCPTION = -3;

}
