package com.crdloo.audit.platform.sys.dao.impl;

import org.springframework.stereotype.Repository;

import com.crdloo.audit.framework.common.dao.AbstractHibernateEntityDao;
import com.crdloo.audit.platform.sys.dao.PersonaDao;
import com.crdloo.audit.platform.sys.dao.entity.PersonaEntity;
@Repository("personaDaoImpl")
public class PersonaDaoImpl extends AbstractHibernateEntityDao<PersonaEntity> implements PersonaDao{

}
