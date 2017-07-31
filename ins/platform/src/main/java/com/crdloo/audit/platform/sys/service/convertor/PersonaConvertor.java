package com.crdloo.audit.platform.sys.service.convertor;

import org.springframework.stereotype.Component;

import com.crdloo.audit.client.dto.PersonaDto;
import com.crdloo.audit.framework.common.service.convertor.AbstractConvertor;
import com.crdloo.audit.platform.sys.dao.entity.PersonaEntity;
@Component   
public class PersonaConvertor extends AbstractConvertor<PersonaDto, PersonaEntity>{

    @Override
    public PersonaDto entity2Dto(PersonaEntity entity) {
        
        if (entity == null) {
            return null;
        }
        PersonaDto dto = new PersonaDto();
        dto.setPersonaDesc(entity.getPersonaDesc());
        dto.setPersonaEnable(entity.getPersonaEnable());
        dto.setPersonaId(entity.getPersonaId());
        dto.setPersonaName(entity.getPersonaName());
        return dto;
    }

    @Override
    public PersonaEntity dto2Entity(PersonaDto dto) {
        
        if (dto == null) {
            return null;
        }
        PersonaEntity ne =new PersonaEntity();
        ne.setPersonaDesc(dto.getPersonaDesc());
        ne.setPersonaEnable(dto.getPersonaEnable());
        ne.setPersonaId(dto.getPersonaId());
        ne.setPersonaName(dto.getPersonaName());
        return ne;
    }

}
