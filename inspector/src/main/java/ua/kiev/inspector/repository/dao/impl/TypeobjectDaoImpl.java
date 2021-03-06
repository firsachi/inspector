package ua.kiev.inspector.repository.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import ua.kiev.inspector.repository.dao.TypeObjectDao;
import ua.kiev.inspector.repository.entity.InspectorTypeobject;

@Repository("typeobjectDaoImpl")
public class TypeobjectDaoImpl implements TypeObjectDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public List<InspectorTypeobject> getAll() {
		Session session = sessionFactory.getCurrentSession();
		String query = "SELECT t FROM InspectorTypeobject t order by t.name";
		TypedQuery<InspectorTypeobject> typedQuery = session.createQuery(query, InspectorTypeobject.class);
		return typedQuery.getResultList();
	}
	
	
}
