package com.crdloo.audit.platform.sys.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crdloo.audit.client.dto.PersonaDto;
import com.crdloo.audit.client.dto.Persona_powerDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.framework.common.service.AbstractEntityService;
import com.crdloo.audit.platform.common.enums.PersonaExCode;
import com.crdloo.audit.platform.sys.dao.PersonaDao;
import com.crdloo.audit.platform.sys.dao.Persona_powerDao;
import com.crdloo.audit.platform.sys.dao.entity.PersonaEntity;
import com.crdloo.audit.platform.sys.dao.entity.Persona_powerEntity;
import com.crdloo.audit.platform.sys.service.PersonaService;
import com.crdloo.audit.platform.sys.service.Persona_powerService;
import com.google.common.collect.Maps;
@Service("com.crdloo.audit.platform.sys.service.impl.Persona_powerServiceImpl")
public class Persona_powerServiceImpl extends AbstractEntityService<Persona_powerDto,Persona_powerEntity> implements  Persona_powerService  {
    
    @Autowired
    private Persona_powerDao persona_powerDao;
    @Autowired
    private PersonaDao personaDao;
    @Autowired
    private PersonaService personaService;
    
    @Override
    public List<Persona_powerDto> getPersonaPowerBypersonaId(long personaId) throws BizException{

        monitorLog.info("Persona_powerServiceImpl-findPowerId:  [personaId="+personaId+"]");
        String hql = "from Persona_powerEntity p where  p.personaId=:personaId";
        Map<String, Object> params = Maps.newHashMap();
        params.put("personaId", personaId);
        List<Persona_powerDto> result =  listDtos(hql, params);
        return result;
    
    }

    @Override
    public void updateOraddPersonaPower(Long personaId,String personaDesc,String personaName, List<Long> powerIds) throws BizException {
        //根据角色id查询是否是添加和修改
        if (personaId != null){//更新
            List<Persona_powerEntity> pe = persona_powerDao.getEntityByPersonaId(personaId);
            if (CollectionUtils.isNotEmpty(pe)){
                deleteBatch(pe);
            }
        } else {//添加
            List<PersonaDto> result =  personaService.findPersonaBypersonaName(personaName);
            if (CollectionUtils.isNotEmpty(result)){
                throw new BizException(PersonaExCode.PERSONA_ISEXIST);
            }
            PersonaEntity pEntity = new PersonaEntity();
            pEntity.setPersonaDesc(personaDesc);
            pEntity.setPersonaEnable("1");
            pEntity.setPersonaName(personaName);
            pEntity = personaDao.save(pEntity);
            personaId = pEntity.getPersonaId();
        }
        // 重新添加权限
        if (CollectionUtils.isNotEmpty(powerIds)) {
            for (Long tempLong : powerIds) {
                Persona_powerEntity personapower = new Persona_powerEntity();
                personapower.setPersonaId(personaId);
                personapower.setPowerId(tempLong);
                save(personapower);
            }
        }

        
    }
}
