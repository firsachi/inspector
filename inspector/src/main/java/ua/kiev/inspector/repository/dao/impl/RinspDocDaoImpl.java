package ua.kiev.inspector.repository.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.kiev.inspector.repository.dao.BaseDao;
import ua.kiev.inspector.repository.dao.QueryHQL;
import ua.kiev.inspector.repository.entity.RinspDoc;

@Repository("rinspDocDaoImpl")
public class RinspDocDaoImpl extends BaseDao<RinspDoc>{

	@Override
	@Transactional
	public List<RinspDoc> getList(QueryHQL query) {
		Session session = sessionFactory.getCurrentSession();
		TypedQuery<RinspDoc> typedQuery = session.createQuery(query.getQuery(), RinspDoc.class);
		return typedQuery.getResultList();
	}

	@Override
	public RinspDoc byEntity(QueryHQL query) {
		Session session = sessionFactory.getCurrentSession();
		TypedQuery<RinspDoc> typedQuery = session.createQuery(query.getQuery(), RinspDoc.class);
		return typedQuery.getSingleResult();
	}

	@Override
	public RinspDoc byEntity(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(RinspDoc.class, id);
	}

}
