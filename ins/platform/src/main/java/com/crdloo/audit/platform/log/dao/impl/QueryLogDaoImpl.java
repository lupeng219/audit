package com.crdloo.audit.platform.log.dao.impl;

import org.springframework.stereotype.Repository;

import com.crdloo.audit.framework.common.dao.AbstractHibernateEntityDao;
import com.crdloo.audit.platform.log.dao.QueryLogDao;
import com.crdloo.audit.platform.log.dao.entity.QueryLogEntity;
@Repository("queryLogDaoImpl")
public class QueryLogDaoImpl extends AbstractHibernateEntityDao<QueryLogEntity> implements QueryLogDao{

}
