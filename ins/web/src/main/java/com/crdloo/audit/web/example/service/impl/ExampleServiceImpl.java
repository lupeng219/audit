package com.crdloo.audit.web.example.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import com.crdloo.audit.client.dto.ExampleDto;
import com.crdloo.audit.framework.client.PageResults;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.web.common.enums.ExampleExCode;
import com.crdloo.audit.web.common.service.BaseService;
import com.crdloo.audit.web.example.form.ExampleForm;
import com.crdloo.audit.web.example.form.PdfForm;
import com.crdloo.audit.web.example.service.IExampleService;
import com.crdloo.audit.web.support.helper.AuditExampleClientHelper;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

@Service("exampleService")
public class ExampleServiceImpl extends BaseService implements IExampleService {

	@Override
	public ExampleForm getExampleById(Long id) throws BizException {
		ExampleDto exampleDto = AuditExampleClientHelper.getData(id);
		if (exampleDto == null) {
			throw new BizException(ExampleExCode.EXAMPLE_NOT_FOUND);
		}
		logger.debug("web get example info="+exampleDto);
		ExampleForm exampleForm = new ExampleForm(exampleDto);
		return exampleForm;
	}

	@Override
	public List<ExampleForm> getExampleList(String tag, Integer pageNo, Integer pageSize) throws BizException {
		List<ExampleForm> list = Lists.newArrayList();

		List<ExampleDto> dtoList = AuditExampleClientHelper.getDataList(tag, pageNo, pageSize);
		if (CollectionUtils.isNotEmpty(dtoList)) {
			for (ExampleDto dto : dtoList) {
				list.add(new ExampleForm(dto));
			}
		}
		return list;
	}

	@Override
	public PageResults<ExampleForm> getDataPageList(String tag, Integer pageNo, Integer pageSize)
			throws BizException {
		PageResults<ExampleForm> resultForm = null;
		PageResults<ExampleDto> result = AuditExampleClientHelper.getDataPageList(tag, pageNo, pageSize);
		if (result != null) {
			List<ExampleForm> formList = Lists.newArrayList();
			List<ExampleDto> dtoList = result.getList();
			if (CollectionUtils.isNotEmpty(dtoList)) {
				for (ExampleDto dto : dtoList) {
					if (dto != null) {
						formList.add(new ExampleForm(dto));
					}
				}
			}
			long count = result.getTotalCount();
			resultForm = new PageResults<ExampleForm>(formList, pageNo, pageSize, count);
		}
		return resultForm;
	}

	@Override
	public void saveExample(ExampleForm exampleForm) throws BizException {
		ExampleDto dtoA = new ExampleDto();
		dtoA.setId(1212l);
		dtoA.setName(exampleForm.getName());
		List<String> tags = Lists.newArrayList();
		tags.add("aaa");
		dtoA.setTags(tags);
		ExampleDto dto = AuditExampleClientHelper.insertData(dtoA);
		logger.debug("web dto new_id="+dto.getId());
	}

	@Override
	public byte[] exportPdf() throws BizException {
		String templateName = "exampleTemp.ftl";
//		Map<String, Object> data = Maps.newHashMap();
//		data.put("nametd", "中文测试abc123");
//		data.put("date", "2017-01-01");
		PdfForm data = new PdfForm("中文测试abc123", "2017-01-01");
		return resultToPdf(templateName, data);
	}

	
}
