package com.crdloo.audit.web.common.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;

import com.crdloo.audit.framework.router.conf.ClusterConfig;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerFontProvider;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.itextpdf.tool.xml.css.CssFile;
import com.itextpdf.tool.xml.css.StyleAttrCSSResolver;
import com.itextpdf.tool.xml.html.CssAppliers;
import com.itextpdf.tool.xml.html.CssAppliersImpl;
import com.itextpdf.tool.xml.html.Tags;
import com.itextpdf.tool.xml.pipeline.css.CSSResolver;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;

public class TestHtml2pdf {

	public static void main(String[] args) throws Exception {
		String html = "/Users/kasim/workdoc/hh.html";
		String pdf = "/Users/kasim/workdoc/newhh.pdf";
		String css = "";

		File file = new File(html);
		String htmlContent = FileUtils.readFileToString(file);
		InputStream is = new ByteArrayInputStream(htmlContent.getBytes("UTF-8"));

		Document document = new Document();
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		PdfWriter writer = PdfWriter.getInstance(document, os);

		document.open();

		CSSResolver cssResolver = new StyleAttrCSSResolver();
		CssFile cssFile = null;
		if (StringUtils.isNotBlank(css)) {
			cssFile = XMLWorkerHelper.getCSS(new ByteArrayInputStream(css.getBytes()));
			/**
			 * TestHtml2pdf.class.getResourceAsStream("/template/"+cssfile);
			InputStream csspathtest = Thread.currentThread().getContextClassLoader().getResourceAsStream("export.css");            
            CssFile cssfiletest = XMLWorkerHelper.getCSS(csspathtest);
            cssResolver.addCss(cssfiletest);
            */
		} else {
			cssFile = XMLWorkerHelper.getInstance().getDefaultCSS();
		}
		cssResolver.addCss(cssFile);

		MyFontsProvider fontProvider = new MyFontsProvider();  
        fontProvider.addFontSubstitute("lowagie", "garamond");
        fontProvider.setUseUnicode(true);
        CssAppliers cssAppliers = new CssAppliersImpl(fontProvider);  
        HtmlPipelineContext htmlContext = new HtmlPipelineContext(cssAppliers); 
        htmlContext.setTagFactory(Tags.getHtmlTagProcessorFactory());
//        HtmlPipeline htmlPipeline = new HtmlPipeline(htmlContext, new PdfWriterPipeline(document, writer));
//        Pipeline<?> pipeline = new CssResolverPipeline(cssResolver, htmlPipeline);
//        XMLParser p = new XMLParser(true, new XMLWorker(pipeline, true));
//        p.parse(is);
//        ByteArrayInputStream cssis = new ByteArrayInputStream(cssResolver.toString().getBytes());
        XMLWorkerHelper.getInstance().getDefaultCssResolver(true); 
        XMLWorkerHelper.getInstance().parseXHtml(writer, document, is, null, Charset.forName("UTF-8"), fontProvider);
        
        document.close();  
        writer.close();  
        
        byte[] cc = os.toByteArray();
        FileOutputStream imageOutput = new FileOutputStream(new File(pdf));
        imageOutput.write(cc, 0, cc.length);
        imageOutput.close();
        System.out.println("pdf success");
	}

	public static class MyFontsProvider extends XMLWorkerFontProvider {

		public MyFontsProvider() {
			super(null, null);
		}

		@Override
		public Font getFont(final String fontname, String encoding, float size, final int style) {
			if (fontname == null) {
                try {
                    final BaseFont baseFont = BaseFont.createFont("STSongStd-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
                    return new Font(baseFont, size, style);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            return super.getFont(fontname, encoding, size, style);
		}
	}
}
