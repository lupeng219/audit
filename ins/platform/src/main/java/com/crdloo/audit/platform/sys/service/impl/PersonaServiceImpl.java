package com.crdloo.audit.platform.sys.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.crdloo.audit.client.dto.PersonaDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.framework.common.service.AbstractEntityService;
import com.crdloo.audit.platform.sys.dao.PersonaDao;
import com.crdloo.audit.platform.sys.dao.entity.PersonaEntity;
import com.crdloo.audit.platform.sys.service.PersonaService;
import com.google.common.collect.Maps;
@Service("com.crdloo.audit.platform.sys.service.impl.PersonaServiceImpl")
public class PersonaServiceImpl extends AbstractEntityService<PersonaDto, PersonaEntity> implements PersonaService{

	@Resource
	private PersonaDao personaDao;

	@Override
	public List<PersonaDto> getAllPersonas() throws BizException {
		monitorLog.info("PersonaServiceImpl-getAllPersonas: ");
		String hql = "from PersonaEntity p";
        List<PersonaDto> result =  listDtos(hql, null);
		return result;
	}

	@Override
	public PersonaDto findPersonaBypersonaId(Long personaId) throws BizException {
		monitorLog.info("PersonaServiceImpl-findPersonaBypersonaId: personaId"+personaId);
		String hql = "from PersonaEntity p where  p.personaId=:personaId";
		Map<String, Object> params = Maps.newHashMap();
        params.put("personaId", personaId);
        List<PersonaDto> listDtos = listDtos(hql, params);
        PersonaDto dto = null;
        if (listDtos!=null && !listDtos.isEmpty()){
        	dto = listDtos.get(0);
        }
		return dto;
	}

    @Override
    public List<PersonaDto> findPersonaBypersonaName(String personaName) throws BizException {
        String hql = "from PersonaEntity p where  p.personaName=:personaName";
        Map<String, Object> params = Maps.newHashMap();
        params.put("personaName", personaName);
        List<PersonaDto> result =  listDtos(hql, params);
        return result;
    }
}
