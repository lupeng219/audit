package com.crdloo.audit.platform.sys.service.convertor;

import org.springframework.stereotype.Component;

import com.crdloo.audit.client.dto.PowerDto;
import com.crdloo.audit.framework.common.service.convertor.AbstractConvertor;
import com.crdloo.audit.platform.sys.dao.entity.PowerEntity;
@Component
public class PowerConvertor  extends AbstractConvertor<PowerDto, PowerEntity>{

    @Override
    public PowerDto entity2Dto(PowerEntity entity) {
        if (entity == null) {
            return null;
        }
        PowerDto dto =new PowerDto();
        dto.setMenuName(entity.getMenuName());
        dto.setParentId(entity.getParentId());
        dto.setPowerId(entity.getPowerId());
        dto.setPowerName(entity.getPowerName());
        dto.setPowerUrl(entity.getPowerUrl());
        return dto;
    }

    @Override
    public PowerEntity dto2Entity(PowerDto dto) {
        if (dto == null) {
            return null;
        }
        PowerEntity en = new PowerEntity();
        en.setMenuName(dto.getMenuName());
        en.setParentId(dto.getParentId());
        en.setPowerId(dto.getPowerId());
        en.setPowerName(dto.getPowerName());
        en.setPowerUrl(dto.getPowerUrl());
        return en;
    }

}
