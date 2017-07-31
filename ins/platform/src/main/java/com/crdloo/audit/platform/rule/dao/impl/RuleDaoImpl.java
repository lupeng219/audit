package com.crdloo.audit.platform.rule.dao.impl;

import org.springframework.stereotype.Repository;

import com.crdloo.audit.framework.common.dao.AbstractHibernateEntityDao;
import com.crdloo.audit.platform.rule.dao.RuleDao;
import com.crdloo.audit.platform.rule.dao.entity.RuleEntity;
@Repository("ruleDaoImpl")
public class RuleDaoImpl extends AbstractHibernateEntityDao<RuleEntity> implements RuleDao{

}
