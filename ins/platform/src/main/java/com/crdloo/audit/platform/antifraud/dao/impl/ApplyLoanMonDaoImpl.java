package com.crdloo.audit.platform.antifraud.dao.impl;

import org.springframework.stereotype.Repository;

import com.crdloo.audit.framework.common.dao.AbstractHibernateEntityDao;
import com.crdloo.audit.platform.antifraud.dao.ApplyLoanMonDao;
import com.crdloo.audit.platform.antifraud.dao.entity.ApplyLoanMonEntity;

@Repository("applyLoanMonDaoImpl")
public class ApplyLoanMonDaoImpl extends AbstractHibernateEntityDao<ApplyLoanMonEntity> implements ApplyLoanMonDao {

}
