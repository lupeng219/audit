package com.crdloo.audit.framework.router.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GzipUtil {

	/**
     * GZIP 压缩字符串（utf-8）
     * 
     * @param String str
     * @param String charsetName
     * @return byte[]
     * @throws IOException
     */
    public static byte[] compressString2byte(String str) throws IOException {
        return compressString2byte(str, "UTF-8");
    }
    
    public static byte[] compressString2byte(String str, String charsetName) throws IOException {
        if (str == null || str.trim().length() == 0) {
            return null;
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        GZIPOutputStream gzip = new GZIPOutputStream(out);
        gzip.write(str.getBytes(charsetName));
        gzip.close();
        return out.toByteArray();
    }
    
    public static String uncompress(InputStream inputStream) throws IOException {
        return uncompress(inputStream, "UTF-8");
    }
    
    public static String uncompress(InputStream inputStream, String charsetName) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        GZIPInputStream gunzip = new GZIPInputStream(inputStream);
        byte[] buffer = new byte[1024];
        int offset = -1;
        while ((offset = gunzip.read(buffer)) != -1) {
            out.write(buffer, 0, offset);
        }
        gunzip.close();
        return out.toString(charsetName);
    }
    
}
