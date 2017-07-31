package com.crdloo.audit.platform.sys.dao;

import java.util.List;

import com.crdloo.audit.framework.common.dao.IEntityDao;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.sys.dao.entity.PowerEntity;

public interface PowerDao extends IEntityDao<PowerEntity> {

    public List<PowerEntity> getPowerDatas() throws BizException;
    
    public List<PowerEntity> getLevelOne() throws BizException;
}
