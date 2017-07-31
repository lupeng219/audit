package com.crdloo.audit.platform.sys.service;

import java.util.List;

import com.crdloo.audit.client.dto.Persona_powerDto;
import com.crdloo.audit.framework.common.exception.BizException;

public interface Persona_powerService {

    public List<Persona_powerDto> getPersonaPowerBypersonaId(long personaId)  throws BizException;
    
   
    public void updateOraddPersonaPower(Long personaId,String personaDesc,String personaName, List<Long> powerIds) throws BizException;
}
