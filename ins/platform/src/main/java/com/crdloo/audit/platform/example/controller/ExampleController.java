package com.crdloo.audit.platform.example.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crdloo.audit.client.dto.ExampleDto;
import com.crdloo.audit.framework.client.PageResults;
import com.crdloo.audit.framework.common.controller.BaseController;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.framework.router.utils.StringUtil;
import com.crdloo.audit.platform.common.enums.ExampleExCode;
import com.crdloo.audit.platform.common.enums.GeneralExCode;
import com.crdloo.audit.platform.example.service.IExampleService;
import com.google.common.collect.Lists;

@Controller
@RequestMapping("/example")
public class ExampleController extends BaseController {

	@Autowired
	private IExampleService exampleService;

	@RequestMapping("/getdata.json")
	public void getData(HttpServletRequest request, HttpServletResponse response) throws BizException {
//		Map<String, Object> map = getMap(request);
		Map<String, Object> map = getMap();
		if (MapUtils.isEmpty(map)) {
			throw new BizException(GeneralExCode.PARAM_IS_NULL);
		}
		Long id = StringUtil.string2Long((String)map.get("id"), 0l);
		String tag = (String) map.get("name");
		if (id == null) {
			throw new BizException(ExampleExCode.ID_IS_NULL);
		}
		if(id==1){
			throw new BizException(ExampleExCode.ID_IS_ONE);
		}
		logger.info("getData params:[id="+id+", name="+tag+"]");

		ExampleDto example = exampleService.getExampleData(id);
		logger.info("pt getData:[example="+example+"]");
		
		returnData(request, example);
	}

	@RequestMapping("/getdatalist.json")
	public void getDataList(HttpServletRequest request, HttpServletResponse response) throws BizException {
		Map<String, Object> map = getMap();
		if (MapUtils.isEmpty(map)) {
			throw new BizException(GeneralExCode.PARAM_IS_NULL);
		}
		Integer pageSize = getPageSize();
		Integer pageNo = getCurrentPage();
		
//		String tag = (String) map.get("tag");
		String tag = getParam("tag");
		if (StringUtils.isBlank(tag)) {
			throw new BizException(ExampleExCode.TAG_IS_NULL);
		}

		List<ExampleDto> exampleList = exampleService.getExampleDatas(tag, pageNo, pageSize);
		
		returnData(request, exampleList);
	}
	
	@RequestMapping("/getdatapagelist.json")
	public void getDataPageList(HttpServletRequest request, HttpServletResponse response) throws BizException {
		Map<String, Object> map = getMap(request);
		if (MapUtils.isEmpty(map)) {
			throw new BizException(GeneralExCode.PARAM_IS_NULL);
		}
		Integer pageSize = getPageSize(map);
		Integer pageNo = getCurrentPage(map);
		String tag = (String) map.get("tag");
		if (StringUtils.isBlank(tag)) {
			throw new BizException(ExampleExCode.TAG_IS_NULL);
		}
		
		PageResults<ExampleDto> pageResult = exampleService.getExampleList(tag, pageNo, pageSize);
		pageResult.setList(null);
		returnData(request, pageResult);
	}
	
	@RequestMapping("/insertdata.json")
	public void insertData(HttpServletRequest request, HttpServletResponse response) throws BizException {
		ExampleDto exampleDto = getParamObj("exampleDto", ExampleDto.class);
		logger.debug("platform insertData param: name="+exampleDto);
		ExampleDto dto = exampleService.insertData(exampleDto.getName());
		returnData(request, dto);
	}
	@RequestMapping("/insertdatas.json")
    public void insertDatas(HttpServletRequest request, HttpServletResponse response) throws BizException {
       
        exampleService.insertDatas();
//        returnData(request, dto);
    }
}
