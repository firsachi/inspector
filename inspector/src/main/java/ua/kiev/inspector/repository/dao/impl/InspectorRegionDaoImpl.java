package ua.kiev.inspector.repository.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ua.kiev.inspector.repository.dao.InspectorRegionDao;
import ua.kiev.inspector.repository.entity.InspectorRegion;

@Repository
public class InspectorRegionDaoImpl implements InspectorRegionDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public List<InspectorRegion> getAll() {
		Session session = sessionFactory.getCurrentSession();
		String query = "SELECT r FROM InspectorRegion r";
		TypedQuery<InspectorRegion> typedQuery = session.createQuery(query, InspectorRegion.class);
		return typedQuery.getResultList();
	}

}
