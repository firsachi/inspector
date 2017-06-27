package ua.kiev.inspector.repository.dao.impl;

import java.util.List;
import java.util.Map;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import ua.kiev.inspector.repository.dao.BaseDao;
import ua.kiev.inspector.repository.dao.QueryHQL;
import ua.kiev.inspector.repository.dao.QueryObject;
import ua.kiev.inspector.repository.entity.RinspDoc;

@Repository("rinspDocDaoImpl")
public class RinspDocDaoImpl extends BaseDao<RinspDoc>{

	@Override
	public List<RinspDoc> getList(QueryHQL query) {
		Session session = sessionFactory.getCurrentSession();
		QueryObject queryObject = query.getQuery();
		TypedQuery<RinspDoc> typedQuery = session.createQuery(queryObject.getQueryHQL(), RinspDoc.class);
		return typedQuery.getResultList();
	}

	@Override
	public RinspDoc byEntity(String login, String password, QueryHQL query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RinspDoc byEntity(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(RinspDoc.class, id);
	}

}
