package com.crdloo.audit.framework.common.filter;

import org.apache.log4j.Logger;

import com.crdloo.audit.framework.router.utils.ThreadLocalMessageFormat;

public abstract class AbstractIOLogger {

	private final static Logger logger = Logger.getLogger(AbstractIOLogger.class);
	
	protected static final int MAXCHARS = 512;
	
	private static final String pattern = "status={0}, eclipse={1}ms, servletPath={2}, clientIP={3}, input={4}, output={5}";

    private static ThreadLocalMessageFormat messageFormat = new ThreadLocalMessageFormat(pattern);
	
    public final void log(ResultStatus rs, EventInfo eventInfo, String inputStr, String outputStr) {
        String info = messageFormat.get().format(getVars(rs, eventInfo, inputStr, outputStr));
        logger.info(info);
    }
	
    protected String getTemplate() {
        return pattern;
    }
    
    protected Object[] getVars(ResultStatus rs, EventInfo eventInfo, String inputStr, String outputStr) {
        return new Object[] { rs.getStatus(), eventInfo.getEclipse(), eventInfo.getActionPath(),
                eventInfo.getClientIP(), getChars(inputStr, MAXCHARS), getChars(outputStr, MAXCHARS) };
    }
	
    protected final String getChars(String chars, int max) {
    	if (chars == null) {
            return "";
        } else {
            int ignoredChars = chars.length() - max;
            if (ignoredChars > 0) {
                String output = chars.substring(0, max);
                return output + "(... more " + ignoredChars + " chars ignored)";
            } else {
                return chars;
            }
        }
    }
    
}
