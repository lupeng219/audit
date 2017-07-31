package com.crdloo.audit.web.support.helper;

import com.crdloo.audit.client.AuditClient;
import com.crdloo.audit.client.dto.TelPeriodDto;
import com.crdloo.audit.client.dto.TelStatusDto;
import com.crdloo.audit.client.service.CreditEvaluationService;
import com.crdloo.audit.framework.client.PlatformResult;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.framework.router.utils.MonitorLogger;
import com.crdloo.audit.web.common.enums.GeneralExCode;

public class AuditCreditEvaluationClientHelper {
	private static CreditEvaluationService creditEvaluationServicen = AuditClient.getCreditEvaluationService();
    
	
	public static TelPeriodDto getTelPeriodData(Long employeeId,String id,String cell,String name) throws BizException{
		PlatformResult<TelPeriodDto> result = creditEvaluationServicen.getTelPeriodData(employeeId, id, cell, name);
		if (result.isOK()) {
			TelPeriodDto dto = result.getData();
			if (dto == null) {
				throw new BizException(GeneralExCode.NO_QUERY_RESULTS);
			}
			return dto;
        }
		 MonitorLogger.getInstance().info("Call AuditClient.AuditCreditEvaluationClientHelper().getTelPeriodData : " + result.getMessage());
		 return null;
	}
	
	public static TelStatusDto getTelStatusData(Long employeeId,String id,String cell,String name) throws BizException{
		PlatformResult<TelStatusDto> result = creditEvaluationServicen.getTelStatusData(employeeId, id, cell, name);
		if (result.isOK()) {
			TelStatusDto dto = result.getData();
			if (dto == null) {
				throw new BizException(GeneralExCode.NO_QUERY_RESULTS);
			}
			return dto;
        }
		 MonitorLogger.getInstance().info("Call AuditClient.AuditCreditEvaluationClientHelper().getTelStatusData : " + result.getMessage());
		 return null;
	}
}
