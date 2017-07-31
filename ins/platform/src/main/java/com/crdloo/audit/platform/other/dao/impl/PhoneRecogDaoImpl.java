package com.crdloo.audit.platform.other.dao.impl;

import org.springframework.stereotype.Repository;

import com.crdloo.audit.framework.common.dao.AbstractHibernateEntityDao;
import com.crdloo.audit.platform.other.dao.PhoneRecogDao;
import com.crdloo.audit.platform.other.dao.entity.PhoneRecogEntity;

@Repository("phoneRecogDaoImpl")
public class PhoneRecogDaoImpl extends AbstractHibernateEntityDao<PhoneRecogEntity> implements PhoneRecogDao {

}
