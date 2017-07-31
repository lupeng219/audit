package com.crdloo.audit.platform.antifraud.dao.impl;

import org.springframework.stereotype.Repository;

import com.crdloo.audit.framework.common.dao.AbstractHibernateEntityDao;
import com.crdloo.audit.platform.antifraud.dao.InfoRelationDao;
import com.crdloo.audit.platform.antifraud.dao.entity.InfoRelationEntity;

@Repository("infoRelationDaoImpl")
public class InfoRelationDaoImpl extends AbstractHibernateEntityDao<InfoRelationEntity> implements InfoRelationDao {

}
