package com.crdloo.audit.platform.sys.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crdloo.audit.client.dto.Persona_powerDto;
import com.crdloo.audit.client.dto.PowerDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.framework.common.service.AbstractEntityService;
import com.crdloo.audit.platform.sys.dao.PowerDao;
import com.crdloo.audit.platform.sys.dao.entity.PowerEntity;
import com.crdloo.audit.platform.sys.service.Persona_powerService;
import com.crdloo.audit.platform.sys.service.PowerService;
import com.crdloo.audit.platform.sys.service.convertor.PowerConvertor;
import com.google.common.collect.Lists;
@Service("com.crdloo.audit.platform.sys.service.impl.PowerServiceImpl")
public class PowerServiceImpl extends AbstractEntityService<PowerDto, PowerEntity> implements PowerService{

    @Autowired
    private PowerDao powerDao;
    @Autowired
    private Persona_powerService persona_powerService;
     
    @Override
    public List<PowerDto> getPowerDatas() throws BizException {
        monitorLog.info("PowerServiceImpl-getPowerDatas: ");
        List<PowerEntity> en =  powerDao.getPowerDatas();
        List<PowerDto> dto = new ArrayList<PowerDto>();
        PowerConvertor p =new PowerConvertor();
        for (PowerEntity e :en){
            dto.add(p.entity2Dto(e));
        }
        return dto;
    }

    @Override
    public List<PowerDto> getLevelOne() throws BizException {
        monitorLog.info("PowerServiceImpl-getLevelOne");
        List<PowerEntity> en =  powerDao.getLevelOne();
        List<PowerDto> dto = new ArrayList<PowerDto>();
        PowerConvertor p =new PowerConvertor();
        for (PowerEntity e :en){
            dto.add(p.entity2Dto(e));
        }
        return dto;
    }

    @Override
    public List<PowerDto> getPowerByPowerId(List<Long> powerId) throws BizException {
        monitorLog.info("PowerServiceImpl-getPowerByPowerId: ["+"powerId"+powerId+"]");
        List<PowerDto> power =  listDtos(powerId);
        return power;
    }

	@Override
	public PowerDto addPowerInfo(PowerDto dto) throws BizException {
		monitorLog.info("PowerServiceImpl-addPowerInfo:  [PowerDto="+dto+"]");
		PowerDto powerDto = save(dto);
		return powerDto;
	}

    @Override
    public List<PowerDto> getPowerBypersonaId(Long personaId) throws BizException {
        monitorLog.info("PowerServiceImpl-getPowerBypersonaId:  [PowerDto="+personaId+"]");
        List<Persona_powerDto> pDtoList = persona_powerService.getPersonaPowerBypersonaId(personaId);
        List<Long> powerIds = Lists.newArrayList();
        if (CollectionUtils.isNotEmpty(pDtoList)){
            for (Persona_powerDto epDto : pDtoList){
                powerIds.add(epDto.getPowerId());
          }
            List<PowerDto> powerDtoList = listDtos(powerIds);
            return powerDtoList;
        }
        return null;
    }


    
    
}
