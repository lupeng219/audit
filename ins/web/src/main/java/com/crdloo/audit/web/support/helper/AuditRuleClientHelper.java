package com.crdloo.audit.web.support.helper;

import com.crdloo.audit.client.AuditClient;
import com.crdloo.audit.client.dto.RuleDto;
import com.crdloo.audit.client.service.RuleService;
import com.crdloo.audit.framework.client.PlatformResult;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.framework.router.utils.MonitorLogger;
import com.crdloo.audit.web.common.enums.GeneralExCode;

public class AuditRuleClientHelper {

    private static RuleService ruleService = AuditClient.getRuleService();
    
    public static RuleDto getRuleData(Long employeeId,String id,String cell,String name) throws BizException{
        PlatformResult<RuleDto> result = ruleService.getRuleData(employeeId, id,cell,name);
        if (result.isOK()) {
        	RuleDto dto = result.getData();
			if (dto == null) {
				throw new BizException(GeneralExCode.NO_QUERY_RESULTS);
			}
			return dto;
        }
        MonitorLogger.getInstance().info("Call AuditClient.getRuleService().getRuleData : " + result.getMessage());
       return null;
   }
}
