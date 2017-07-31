package com.crdloo.audit.web.support.helper;

import java.util.List;

import com.crdloo.audit.client.AuditClient;
import com.crdloo.audit.client.dto.ExampleDto;
import com.crdloo.audit.client.service.ExampleService;
import com.crdloo.audit.framework.client.PageResults;
import com.crdloo.audit.framework.client.PlatformResult;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.framework.router.utils.MonitorLogger;
import com.crdloo.audit.web.common.enums.GeneralExCode;

public class AuditExampleClientHelper {

	private static ExampleService exampleService = AuditClient.getExampleService();

	public static ExampleDto getData(Long id) throws BizException {
		PlatformResult<ExampleDto> result = exampleService.getData(id);
		if (result.isOK()) {
			ExampleDto dto = result.getData();
			if (dto == null) {
				throw new BizException(GeneralExCode.NO_QUERY_RESULTS);
			}
			return dto;
		}
		MonitorLogger.getInstance().info("Call AuditClient.getExampleService().getData : " + result.getMessage());
		return null;
	}

	public static List<ExampleDto> getDataList(String tag, Integer pageNo, Integer pageSize) {
		PlatformResult<List<ExampleDto>> result = exampleService.getDataList(tag, pageNo, pageSize);
		if (result.isOK()) {
			return result.getData();
		}
		MonitorLogger.getInstance().info("Call AuditClient.getExampleService().getDataList : " + result.getMessage());
		return null;
	}

	public static PageResults<ExampleDto> getDataPageList(String tag, Integer pageNo, Integer pageSize) {
		PlatformResult<PageResults<ExampleDto>> result = exampleService.getdatapagelist(tag, pageNo, pageSize);
		if (result.isOK()) {
			return result.getData();
		}
		MonitorLogger.getInstance().info("Call AuditClient.getExampleService().getDataList : " + result.getMessage());
		return null;
	}

	public static ExampleDto insertData(ExampleDto dto) {
		PlatformResult<ExampleDto> result = exampleService.insertData(dto);
		if (result.isOK()) {
			return result.getData();
		}
		MonitorLogger.getInstance().info("Call AuditClient.getExampleService().insertData : " + result.getMessage());
		return null;
	}

	public static ExampleDto insertDatas() {
		PlatformResult<ExampleDto> result = exampleService.insertDatas();
		if (result.isOK()) {
			return result.getData();
		}
		MonitorLogger.getInstance().info("Call AuditClient.getExampleService().insertData : " + result.getMessage());
		return null;
	}
}
