package com.crdloo.audit.platform.information.dao.impl;

import org.springframework.stereotype.Repository;

import com.crdloo.audit.framework.common.dao.AbstractHibernateEntityDao;
import com.crdloo.audit.platform.information.dao.KeyAttributionDao;
import com.crdloo.audit.platform.information.dao.entity.KeyAttributionEntity;

@Repository("keyAttributionDaoImpl")
public class KeyAttributionDaoImpl extends AbstractHibernateEntityDao<KeyAttributionEntity> implements KeyAttributionDao {

}
