package ua.kiev.inspector.repository.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.kiev.inspector.repository.dao.RinspDocDao;
import ua.kiev.inspector.repository.entity.RinspDoc;

@Repository
public class RispDaoImpl implements RinspDocDao{

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	@Override
	public List<RinspDoc> getAllRisoDoc(int inspectorUserId) {
		Session session = sessionFactory.getCurrentSession();
		String query = "SELECT r FROM RinspDoc r WHERE r.inspector.usersId = :userId";
		TypedQuery<RinspDoc> typedQuery = session.createQuery(query, RinspDoc.class);
		typedQuery.setParameter("userId", inspectorUserId);
		return typedQuery.getResultList();
	}

	@Transactional
	@Override
	public RinspDoc getByRispDoc(int id, int userId) {
		Session session = sessionFactory.getCurrentSession();
		String query = "SELECT r FROM RinspDoc r WHERE r.inspector.usersId = :usersId AND r.id = :id";
		TypedQuery<RinspDoc> typedQuery = session.createQuery(query, RinspDoc.class);
		typedQuery.setParameter("usersId", userId);
		typedQuery.setParameter("id", id);
		return typedQuery.getSingleResult();
	}

}
