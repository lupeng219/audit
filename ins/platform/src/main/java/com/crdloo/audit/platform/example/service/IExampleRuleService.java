package com.crdloo.audit.platform.example.service;

import com.crdloo.audit.client.dto.RuleDto;
import com.crdloo.audit.framework.common.exception.BizException;

public interface IExampleRuleService {

	public RuleDto bfdQueryRuleData() throws BizException;
	
}
