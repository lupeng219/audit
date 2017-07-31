package com.crdloo.audit.platform.example.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.stereotype.Repository;

import com.crdloo.audit.framework.common.dao.AbstractHibernateEntityDao;
import com.crdloo.audit.platform.example.dao.IExampleDao;
import com.crdloo.audit.platform.example.dao.entity.ExampleEntity;

@Repository("exampleDaoImpl")
public class ExampleDaoImpl extends AbstractHibernateEntityDao<ExampleEntity> implements IExampleDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<ExampleEntity> getExampleList(final String tag, final int pageNo, final int pageSize) {
		List<ExampleEntity> list = this.getHibernateTemplate().execute(new HibernateCallback<List<ExampleEntity>>() {
			public List<ExampleEntity> doInHibernate(Session session) throws HibernateException, SQLException {
				String hql = "from ExampleEntity e where e.name=:name";
				Query query = session.createQuery(hql);
				query.setString("name", tag);
				query.setFirstResult((pageNo - 1) * pageSize);
				query.setMaxResults(pageSize);
				return query.list();
			}
		});
		return list;
	}

}
