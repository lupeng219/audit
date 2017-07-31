package com.crdloo.audit.platform.information.dao.impl;

import org.springframework.stereotype.Repository;

import com.crdloo.audit.framework.common.dao.AbstractHibernateEntityDao;
import com.crdloo.audit.platform.information.dao.BankThreeDao;
import com.crdloo.audit.platform.information.dao.entity.BankThreeEntity;

@Repository("bankThreeDaoImpl")
public class BankThreeDaoImpl extends AbstractHibernateEntityDao<BankThreeEntity> implements BankThreeDao{

}
