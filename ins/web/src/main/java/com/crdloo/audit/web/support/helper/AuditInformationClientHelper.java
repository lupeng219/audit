package com.crdloo.audit.web.support.helper;

import com.crdloo.audit.client.AuditClient;
import com.crdloo.audit.client.dto.BankThreeDto;
import com.crdloo.audit.client.dto.IdTwo_zDto;
import com.crdloo.audit.client.dto.KeyAttributionDto;
import com.crdloo.audit.client.dto.TelCheckDto;
import com.crdloo.audit.client.service.InformationService;
import com.crdloo.audit.framework.client.PlatformResult;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.framework.router.utils.MonitorLogger;
import com.crdloo.audit.web.common.enums.GeneralExCode;

public class AuditInformationClientHelper {
    
    private static InformationService informationService = AuditClient.getInformationService();
   
    public static BankThreeDto getBankThreeData(Long employeeId,String id,String name,String bank_id) throws BizException{
        PlatformResult<BankThreeDto> result = informationService.getBankThreeData(employeeId, id, name, bank_id);
        if (result.isOK()) {
        	BankThreeDto dto = result.getData();
			if (dto == null) {
				throw new BizException(GeneralExCode.NO_QUERY_RESULTS);
			}
			return dto;
        }
        MonitorLogger.getInstance().info("Call AuditClient.getInformationService().getBankThreeData : " + result.getMessage());
       return null;
   }
    
    public static IdTwo_zDto getIdTwo_zData(Long employeeId,String id,String name) throws BizException{
       PlatformResult<IdTwo_zDto> result = informationService.getIdTwo_zData(employeeId, id, name);
       if (result.isOK()) {
    	   IdTwo_zDto dto = result.getData();
			if (dto == null) {
				throw new BizException(GeneralExCode.NO_QUERY_RESULTS);
			}
			return dto;
       }
       MonitorLogger.getInstance().info("Call AuditClient.getInformationService().getIdTwo_zData : " + result.getMessage());
      return null;
  }
   public static KeyAttributionDto getKeyAttributionData(Long employeeId,String id, String cell,String name) throws BizException{
	   PlatformResult<KeyAttributionDto> result = informationService.getKeyAttributionData(employeeId, id, cell, name);
	   if (result.isOK()) {
		   KeyAttributionDto dto = result.getData();
			if (dto == null) {
				throw new BizException(GeneralExCode.NO_QUERY_RESULTS);
			}
			return dto;
       }
	   MonitorLogger.getInstance().info("Call AuditClient.getInformationService().getKeyAttributionData : " + result.getMessage());
       return null;
	   
   }
   public static TelCheckDto getTelCheckData(Long employeeId,String id, String cell,String name) throws BizException{
	   PlatformResult<TelCheckDto> result = informationService.getTelCheckData(employeeId, id, cell, name);
	   if (result.isOK()) {
		   TelCheckDto dto = result.getData();
			if (dto == null) {
				throw new BizException(GeneralExCode.NO_QUERY_RESULTS);
			}
			return dto;
       }
	   MonitorLogger.getInstance().info("Call AuditClient.getInformationService().getTelCheckData : " + result.getMessage());
       return null;
	   
   }
    
}
