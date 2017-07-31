package com.crdloo.audit.platform.sys.dao.impl;

import org.springframework.stereotype.Repository;

import com.crdloo.audit.framework.common.dao.AbstractHibernateEntityDao;
import com.crdloo.audit.platform.sys.dao.EmployeeDao;
import com.crdloo.audit.platform.sys.dao.entity.EmployeeEntity;

@Repository("employeeDaoImpl")
public class EmployeeDaoImpl extends AbstractHibernateEntityDao<EmployeeEntity> implements EmployeeDao{

}
