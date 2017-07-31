package com.crdloo.audit.platform.sys.dao;

import java.util.List;

import com.crdloo.audit.framework.common.dao.IEntityDao;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.sys.dao.entity.Persona_powerEntity;

public interface Persona_powerDao extends IEntityDao<Persona_powerEntity>{

    public List<Persona_powerEntity> getEntityByPersonaId(Long id) throws BizException;
}
