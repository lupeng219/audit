package com.crdloo.audit.platform.example.dao;

import java.util.List;

import com.crdloo.audit.framework.common.dao.IEntityDao;
import com.crdloo.audit.platform.example.dao.entity.ExampleEntity;

public interface IExampleDao extends IEntityDao<ExampleEntity> {

	public List<ExampleEntity> getExampleList(String tag, int pageNo, int pageSize);

}
