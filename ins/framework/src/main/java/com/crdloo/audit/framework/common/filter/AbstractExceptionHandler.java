package com.crdloo.audit.framework.common.filter;

import org.apache.log4j.Logger;

public abstract class AbstractExceptionHandler {

	private final static Logger logger = Logger.getLogger(AbstractExceptionHandler.class);

    /**
     * 异常处理方法 各个平台可以根据自己定义的Excepiton覆盖此方法，实现自己的Exception处理. 默认返回UNKNOWN
     * 
     * @param Exception e
     * @return ResultStatus
     */
    public ResultStatus handle(Exception e) {
        logger.error(e.getMessage(), e);
        return ResultStatus.unknown(e.getMessage());
    }
    
}
