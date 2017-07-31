package com.crdloo.audit.platform.creditEvaluation.dao.impl;

import org.springframework.stereotype.Repository;

import com.crdloo.audit.framework.common.dao.AbstractHibernateEntityDao;
import com.crdloo.audit.platform.creditEvaluation.dao.TelStatusDao;
import com.crdloo.audit.platform.creditEvaluation.dao.entity.TelStatusEntity;

@Repository("telStatusDaoImpl")
public class TelStatusDaoImpl extends AbstractHibernateEntityDao<TelStatusEntity> implements TelStatusDao {

}
