package com.crdloo.audit.platform.sys.service.convertor;

import org.springframework.stereotype.Component;

import com.crdloo.audit.client.dto.Persona_powerDto;
import com.crdloo.audit.framework.common.service.convertor.AbstractConvertor;
import com.crdloo.audit.platform.sys.dao.entity.Persona_powerEntity;
@Component   
public class Persona_powerConvertor extends AbstractConvertor<Persona_powerDto, Persona_powerEntity>{

    @Override
    public Persona_powerDto entity2Dto(Persona_powerEntity entity) {
        if (entity == null) {
            return null;
        }
        Persona_powerDto dto = new Persona_powerDto();
        dto.setId(entity.getId());
        dto.setPersonaId(entity.getPersonaId());
        dto.setPowerId(entity.getPowerId());
        return dto;
    }

    @Override
    public Persona_powerEntity dto2Entity(Persona_powerDto dto) {
        if (dto == null) {
            return null;
        }
        Persona_powerEntity en = new Persona_powerEntity();
        en.setId(dto.getId());
        en.setPersonaId(dto.getPersonaId());
        en.setPowerId(dto.getPowerId());
        return en;
    }

}
