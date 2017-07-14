package ua.kiev.inspector.repository.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.kiev.inspector.repository.dao.QueryHQL;
import ua.kiev.inspector.repository.dao.RinspDocDao;
import ua.kiev.inspector.repository.entity.RinspDoc;

@Repository
public class RispDaoImpl implements RinspDocDao{

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	@Override
	public List<RinspDoc> getAllRisoDoc(QueryHQL query, int inspectorUser) {
		Session session = sessionFactory.getCurrentSession();
		TypedQuery<RinspDoc> typedQuery = session.createQuery(query.getQuery(), RinspDoc.class);
		typedQuery.setParameter("userId", inspectorUser);
		return typedQuery.getResultList();
	}

}
