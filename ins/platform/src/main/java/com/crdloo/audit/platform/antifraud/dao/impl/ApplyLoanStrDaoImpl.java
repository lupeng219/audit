package com.crdloo.audit.platform.antifraud.dao.impl;

import org.springframework.stereotype.Repository;

import com.crdloo.audit.framework.common.dao.AbstractHibernateEntityDao;
import com.crdloo.audit.platform.antifraud.dao.ApplyLoanStrDao;
import com.crdloo.audit.platform.antifraud.dao.entity.ApplyLoanStrEntity;
@Repository("applyLoanStrDaoImpl")
public class ApplyLoanStrDaoImpl extends AbstractHibernateEntityDao<ApplyLoanStrEntity> implements ApplyLoanStrDao{

}
