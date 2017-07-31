package com.crdloo.audit.platform.sys.dao.impl;

import org.springframework.stereotype.Repository;

import com.crdloo.audit.framework.common.dao.AbstractHibernateEntityDao;
import com.crdloo.audit.platform.sys.dao.Employee_personaDao;
import com.crdloo.audit.platform.sys.dao.entity.Employee_personaEntity;
@Repository("employee_personaDaoImpl")
public class Employee_personaDaoImpl extends AbstractHibernateEntityDao<Employee_personaEntity> implements Employee_personaDao{

}
