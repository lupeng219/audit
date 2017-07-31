package com.crdloo.audit.platform.antifraud.dao.impl;

import org.springframework.stereotype.Repository;

import com.crdloo.audit.framework.common.dao.AbstractHibernateEntityDao;
import com.crdloo.audit.platform.antifraud.dao.ExecutionDao;
import com.crdloo.audit.platform.antifraud.dao.entity.ExecutionEntity;

@Repository("executionDaoImpl")
public class ExecutionDaoImpl extends AbstractHibernateEntityDao<ExecutionEntity> implements ExecutionDao {

}
