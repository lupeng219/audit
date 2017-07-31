package com.crdloo.audit.platform.creditEvaluation.dao.impl;

import org.springframework.stereotype.Repository;

import com.crdloo.audit.framework.common.dao.AbstractHibernateEntityDao;
import com.crdloo.audit.platform.creditEvaluation.dao.TelPeriodDao;
import com.crdloo.audit.platform.creditEvaluation.dao.entity.TelPeriodEntity;

@Repository("telPeriodDaoImpl")
public class TelPeriodDaoImpl extends AbstractHibernateEntityDao<TelPeriodEntity> implements TelPeriodDao {

}
