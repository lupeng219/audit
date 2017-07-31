package com.crdloo.audit.platform.information.dao.impl;

import org.springframework.stereotype.Repository;

import com.crdloo.audit.framework.common.dao.AbstractHibernateEntityDao;
import com.crdloo.audit.platform.information.dao.TelCheckDao;
import com.crdloo.audit.platform.information.dao.entity.TelCheckEntity;

@Repository("telCheckDaoImpl")
public class TelCheckDaoImpl extends AbstractHibernateEntityDao<TelCheckEntity> implements TelCheckDao {

}
