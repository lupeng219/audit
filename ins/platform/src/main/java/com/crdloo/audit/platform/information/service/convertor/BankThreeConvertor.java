package com.crdloo.audit.platform.information.service.convertor;

import org.springframework.stereotype.Component;

import com.crdloo.audit.client.dto.BankThreeDto;
import com.crdloo.audit.framework.common.service.convertor.AbstractConvertor;
import com.crdloo.audit.platform.information.dao.entity.BankThreeEntity;
import com.crdloo.audit.platform.information.service.vo.BankThreeVo;
@Component   
public class BankThreeConvertor extends AbstractConvertor<BankThreeDto,BankThreeEntity>{
    
    @Override
    public BankThreeEntity vo2Entity(Object vo) {
        BankThreeVo bVo =(BankThreeVo)vo;
        BankThreeEntity entity = new BankThreeEntity();
        
        entity.setSwift_number(bVo.getSwift_number());
        entity.setFlag_bankthree(bVo.getFlag().getFlag_bankthree());
        entity.setRespCode(bVo.getProduct().getRespCode());
        entity.setRespMsg(bVo.getProduct().getRespMsg());
        return entity;
    }
}
