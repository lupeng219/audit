package com.crdloo.audit.web.common.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.web.common.enums.ExportPdfExCode;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.Pipeline;
import com.itextpdf.tool.xml.XMLWorker;
import com.itextpdf.tool.xml.XMLWorkerFontProvider;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.itextpdf.tool.xml.css.CssFile;
import com.itextpdf.tool.xml.css.StyleAttrCSSResolver;
import com.itextpdf.tool.xml.html.CssAppliers;
import com.itextpdf.tool.xml.html.CssAppliersImpl;
import com.itextpdf.tool.xml.html.Tags;
import com.itextpdf.tool.xml.parser.XMLParser;
import com.itextpdf.tool.xml.pipeline.css.CSSResolver;
import com.itextpdf.tool.xml.pipeline.css.CssResolverPipeline;
import com.itextpdf.tool.xml.pipeline.end.PdfWriterPipeline;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipeline;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;

public class PdfUtil {

	private static final Logger logger = Logger.getLogger(PdfUtil.class);
	
	private static final String cssfile = "audit.css";
	
	private static CSSResolver cssResolver = null;
	private static MyFontsProvider fontProvider = null;
	private static HtmlPipelineContext htmlContext = null;
	
	static {
		cssResolver = new StyleAttrCSSResolver();
		CssFile cssFile = null;
		if (StringUtils.isNotBlank(cssfile)) {
			InputStream cssis = PdfUtil.class.getResourceAsStream("/template/"+cssfile);
			cssFile = XMLWorkerHelper.getCSS(cssis);			
			/*
			cssFile = XMLWorkerHelper.getCSS(new ByteArrayInputStream(css.getBytes()));
			InputStream cssis = PdfUtil.class.getResourceAsStream("/template/"+cssfile);
			InputStream cssis = Thread.currentThread().getContextClassLoader().getResourceAsStream("/template/"+cssfile);            
            cssFile = XMLWorkerHelper.getCSS(cssis);
            */
		} else {
			cssFile = XMLWorkerHelper.getInstance().getDefaultCSS();
		}
		cssResolver.addCss(cssFile);
		
		fontProvider = new MyFontsProvider();
        fontProvider.addFontSubstitute("lowagie", "garamond");
        fontProvider.setUseUnicode(true);
        
        CssAppliers cssAppliers = new CssAppliersImpl(fontProvider);  
        htmlContext = new HtmlPipelineContext(cssAppliers); 
        htmlContext.setTagFactory(Tags.getHtmlTagProcessorFactory());
	}
	
	public static byte[] createPdfByHtml(String html) throws BizException{
		if(StringUtils.isBlank(html)){
			throw new BizException(ExportPdfExCode.HTML_IS_BLANK);
		}
		Document document = null;
		PdfWriter writer = null;
		ByteArrayOutputStream os = null;
		try {
			InputStream is = new ByteArrayInputStream(html.getBytes("UTF-8"));
			document = new Document();
			os = new ByteArrayOutputStream();
			writer = PdfWriter.getInstance(document, os);
			
			document.open();
//			ByteArrayInputStream cssis = new ByteArrayInputStream(cssResolver.toString().getBytes());
//			XMLWorkerHelper.getInstance().getDefaultCssResolver(true); 
//	        XMLWorkerHelper.getInstance().parseXHtml(writer, document, is, cssis, Charset.forName("UTF-8"), fontProvider);
			
			Pipeline<?> pipeline = new CssResolverPipeline(cssResolver,
					new HtmlPipeline(htmlContext, new PdfWriterPipeline(
							document, writer)));
			XMLWorker worker = new XMLWorker(pipeline, true);
			XMLParser p = new XMLParser(worker);
			p.parse(is);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new BizException(ExportPdfExCode.PDF_MAKE_ERROR);
		} finally {
			if(document!=null){
				document.close();
			}
			if(writer!=null){
				writer.close();
			}
		}
		return os.toByteArray();
	}
	
	private static class MyFontsProvider extends XMLWorkerFontProvider {
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
