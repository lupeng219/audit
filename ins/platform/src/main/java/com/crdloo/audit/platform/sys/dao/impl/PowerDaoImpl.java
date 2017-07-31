package com.crdloo.audit.platform.sys.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.crdloo.audit.framework.common.dao.AbstractHibernateEntityDao;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.sys.dao.PowerDao;
import com.crdloo.audit.platform.sys.dao.entity.PowerEntity;
import com.google.common.collect.Lists;
@Repository("powerDaoImpl")
public class PowerDaoImpl  extends AbstractHibernateEntityDao<PowerEntity> implements PowerDao{

    @Override
    public List<PowerEntity> getPowerDatas() throws BizException {
        List<PowerEntity> list = Lists.newArrayList();
        String hql = "from PowerEntity p where p.parentId is not null";
        list= selectList(hql);
        return list;
    }

    @Override
    public List<PowerEntity> getLevelOne() throws BizException {
        List<PowerEntity> list = Lists.newArrayList();
        String hql = "from PowerEntity p where p.parentId is null";
        list= selectList(hql);
        return list;
    }

}
