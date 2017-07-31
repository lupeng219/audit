package com.crdloo.audit.framework.common.filter;

import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

import javax.servlet.http.HttpServletResponse;

public class JsonFilter extends AbstractFilter {

	@Override
    protected String getRespContentType() {
        return ContentType.DEfAULT.getValue();
    }

    @Override
    protected String render(Object output, ResultStatus rs) throws Exception {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put(ResultStatus.status(), rs.getStatus());
        map.put(ResultStatus.message(), rs.getMessage());
        map.put(ResultStatus.data(), output != null ? output : EMPTY_MAP);
        return OBJECT_MAPPER.writeValueAsString(map);
    }

    @Override
    protected void export(HttpServletResponse resp, String outputStr, boolean compress) throws Exception {
        if (compress) {
            resp.addHeader("Content-Encoding", "gzip");
            GZIPOutputStream gzipos = new GZIPOutputStream(resp.getOutputStream());
            gzipos.write(outputStr.getBytes(CHARSET_UTF_8));
            gzipos.flush();
            gzipos.close();
        } else {
            PrintWriter writer = resp.getWriter();
            // 返回结果
            writer.print(outputStr);
            writer.flush();
        }
    }
	
}
