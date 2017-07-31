package com.crdloo.audit.web.common.util;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.configuration.ConfigurationUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.web.common.enums.ExportPdfExCode;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class FreemarkerUtil {

	private static final Logger logger = Logger.getLogger(FreemarkerUtil.class);
	
	private static Configuration cfg;
	
	static {
        cfg = new Configuration(Configuration.VERSION_2_3_23);

        try {
            // 获得跟路径，并作为模版路径
            String ftlPath = ConfigurationUtils.locate("template").getFile();
            // 绝对路径加载配置
            cfg.setDirectoryForTemplateLoading(new File(ftlPath));
            // 配置读取编码
            cfg.setEncoding(Locale.CHINESE, "UTF-8");
        } catch (IOException e) {
        	logger.error(e.getMessage(), e);
        }
    }
	
	public static String processAsString(String templateName, Object data) throws BizException {
		if(StringUtils.isBlank(templateName)){
			throw new BizException(ExportPdfExCode.TEMPLATE_NAME_ISNULL);
		}
		Template t = null;
		try {
			t = cfg.getTemplate(templateName);
		} catch (Exception e) {
			throw new BizException(ExportPdfExCode.TEMPLATE_NOT_FOUND);
		}
		if(t==null){
			throw new BizException(ExportPdfExCode.TEMPLATE_NOT_FOUND);
		}
		StringWriter out = new StringWriter();
		try {
            t.process(data, out);
        } catch (Exception e) {
        	logger.error("生成导出结果错误 [templateName=" + templateName + "]:" + e.getMessage(), e);
        	throw new BizException(ExportPdfExCode.HTML_PROCESS_ERROR);
        }
        return out.toString();
	}
}
