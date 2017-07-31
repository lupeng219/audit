package com.crdloo.audit.platform.sys.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.crdloo.audit.framework.common.dao.AbstractHibernateEntityDao;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.sys.dao.Persona_powerDao;
import com.crdloo.audit.platform.sys.dao.entity.Persona_powerEntity;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
@Repository("persona_powerDaoImpl")
public class Persona_powerDaoImpl extends AbstractHibernateEntityDao<Persona_powerEntity>implements Persona_powerDao {

    @Override
    public List<Persona_powerEntity> getEntityByPersonaId(Long personaId) throws BizException {
        List<Persona_powerEntity> list = Lists.newArrayList();
        String hql = "from Persona_powerEntity p where p.personaId=:personaId";
        Map<String, Object> params = Maps.newHashMap();
        params.put("personaId", personaId);
        list= selectList(hql,params);
        return list;
    }

}
