package com.crdloo.audit.web.support.helper;

import com.crdloo.audit.client.AuditClient;
import com.crdloo.audit.client.dto.ApplyLoanMonDto;
import com.crdloo.audit.client.dto.ApplyLoanStrDto;
import com.crdloo.audit.client.dto.ExecutionDto;
import com.crdloo.audit.client.dto.InfoRelationDto;
import com.crdloo.audit.client.dto.SpecialList_cDto;
import com.crdloo.audit.client.service.AntifraudService;
import com.crdloo.audit.framework.client.PlatformResult;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.framework.router.utils.MonitorLogger;
import com.crdloo.audit.web.common.enums.GeneralExCode;

public class AuditAntifraudClientHelper {

    private static AntifraudService antifraudService = AuditClient.getAntifraudService();
    
    public static SpecialList_cDto getSpecialList_cData(String id,String cell,String name,String linkman_cell) throws BizException{
        PlatformResult<SpecialList_cDto> result = antifraudService.getSpecialList_cData(id, cell, name, linkman_cell);
        if (result.isOK()) {
        	SpecialList_cDto dto = result.getData();
			if (dto == null) {
				throw new BizException(GeneralExCode.NO_QUERY_RESULTS);
			}
			return dto;
        }
        MonitorLogger.getInstance().info("Call AuditClient.getAntifraudService().getSpecialList_cData : " + result.getMessage());
       return null;
   }
	public static ApplyLoanMonDto getApplyLoanMonData(String id,String cell,String name,String linkman_cell) throws BizException{
		PlatformResult<ApplyLoanMonDto> result = antifraudService.getApplyLoanMonData( id, cell, name,linkman_cell);
		if (result.isOK()) {
			ApplyLoanMonDto dto = result.getData();
			if (dto == null) {
				throw new BizException(GeneralExCode.NO_QUERY_RESULTS);
			}
			return dto;
        }
		 MonitorLogger.getInstance().info("Call AuditClient.AuditAntifraudClientHelper().getApplyLoanMonData : " + result.getMessage());
		 return null;
	}
	public static ExecutionDto getExecutionData(String id,String cell,String name) throws BizException{
		PlatformResult<ExecutionDto> result = antifraudService.getExecutionData( id, cell, name);
		if (result.isOK()) {
			ExecutionDto dto = result.getData();
			if (dto == null) {
				throw new BizException(GeneralExCode.NO_QUERY_RESULTS);
			}
			return dto;
        }
		 MonitorLogger.getInstance().info("Call AuditClient.AuditAntifraudClientHelper().getExecutionData : " + result.getMessage());
		 return null;
	}
	public static InfoRelationDto getInfoRelationData(String id,String cell,String name) throws BizException{
		PlatformResult<InfoRelationDto> result = antifraudService.getInfoRelationData( id, cell, name);
		if (result.isOK()) {
			InfoRelationDto dto = result.getData();
			if (dto == null) {
				throw new BizException(GeneralExCode.NO_QUERY_RESULTS);
			}
			return dto;
        }
		 MonitorLogger.getInstance().info("Call AuditClient.AuditAntifraudClientHelper().getInfoRelationData : " + result.getMessage());
		 return null;
	}
	public static ApplyLoanStrDto getApplyLoanStrData(String id,String cell,String name) throws BizException{
        PlatformResult<ApplyLoanStrDto> result = antifraudService.getApplyLoanStrData( id, cell, name);
        if (result.isOK()) {
        	ApplyLoanStrDto dto = result.getData();
			if (dto == null) {
				throw new BizException(GeneralExCode.NO_QUERY_RESULTS);
			}
			return dto;
        }
         MonitorLogger.getInstance().info("Call AuditClient.AuditAntifraudClientHelper().getApplyLoanStrData : " + result.getMessage());
         return null;
    }
}
