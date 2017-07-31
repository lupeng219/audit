package com.crdloo.audit.platform.example.service;

import java.util.List;

import com.crdloo.audit.client.dto.ExampleDto;
import com.crdloo.audit.framework.client.PageResults;
import com.crdloo.audit.framework.common.exception.BizException;

public interface IExampleService {

	public ExampleDto getExampleData(Long id) throws BizException;
	
	public List<ExampleDto> getExampleDatas(String tag, Integer pageNo, Integer pageSize) throws BizException;
	
	public PageResults<ExampleDto> getExampleList(String tag, Integer pageNo, Integer pageSize) throws BizException;
	
	public ExampleDto insertData(String name) throws BizException;
	
	public void insertDatas() throws BizException;
}
