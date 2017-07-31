package com.crdloo.audit.platform.information.service.convertor;

import org.springframework.stereotype.Component;

import com.crdloo.audit.client.dto.IdTwo_zDto;
import com.crdloo.audit.framework.common.service.convertor.AbstractConvertor;
import com.crdloo.audit.platform.information.dao.entity.IdTwo_zEntity;
import com.crdloo.audit.platform.information.service.vo.IdTwo_zVo;
@Component   
public class IdTwo_zConvertor extends AbstractConvertor<IdTwo_zDto,IdTwo_zEntity>{
    @Override
    public IdTwo_zEntity vo2Entity(Object vo) {
        
        IdTwo_zVo zVo =(IdTwo_zVo)vo;
        IdTwo_zEntity entity = new IdTwo_zEntity();
        
        entity.setFlag_idtwo_z(zVo.getFlag().getFlag_idtwo_z());
        entity.setSwift_number(zVo.getSwift_number());
        entity.setGuid(zVo.getProduct().getGuid());
        entity.setMessage(zVo.getProduct().getMessage());
        entity.setResult(zVo.getProduct().getResult());
        return entity;
    }
}
