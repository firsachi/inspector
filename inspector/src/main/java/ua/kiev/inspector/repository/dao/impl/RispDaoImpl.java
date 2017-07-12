package ua.kiev.inspector.repository.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.engine.query.spi.HQLQueryPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ua.kiev.inspector.repository.dao.RinspDocDao;
import ua.kiev.inspector.repository.entity.RinspDoc;

@Repository
public class RispDaoImpl implements RinspDocDao{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<RinspDoc> getAllRisoDoc(HQLQueryPlan query) {
		Session session = sessionFactory.getCurrentSession();
		TypedQuery<RinspDoc> typedQuery = session.createQuery(query.getSourceQuery(), RinspDoc.class);
		return typedQuery.getResultList();
	}

}
