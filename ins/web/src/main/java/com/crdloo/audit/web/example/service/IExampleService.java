package com.crdloo.audit.web.example.service;

import java.util.List;

import com.crdloo.audit.framework.client.PageResults;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.web.example.form.ExampleForm;

public interface IExampleService {

	public ExampleForm getExampleById(Long id) throws BizException;
	
	public List<ExampleForm> getExampleList(String tag, Integer pageNo, Integer pageSize) throws BizException;
	
	public PageResults<ExampleForm> getDataPageList(String tag, Integer pageNo, Integer pageSize) throws BizException;
	
	public void saveExample(ExampleForm exampleForm) throws BizException;
	
	public byte[] exportPdf() throws BizException;
	
}
