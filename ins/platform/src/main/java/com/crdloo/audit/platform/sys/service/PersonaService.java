package com.crdloo.audit.platform.sys.service;

import java.util.List;

import com.crdloo.audit.client.dto.PersonaDto;
import com.crdloo.audit.framework.common.exception.BizException;

public interface PersonaService {
	 public List<PersonaDto> getAllPersonas() throws BizException;
	 
	 public PersonaDto findPersonaBypersonaId(Long personaId)throws BizException;
	 
	 public List<PersonaDto> findPersonaBypersonaName(String name)throws BizException;
}
