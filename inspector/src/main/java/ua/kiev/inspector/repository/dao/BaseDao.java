package ua.kiev.inspector.repository.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public abstract class BaseDao<T> {
	
	@Autowired
	protected SessionFactory sessionFactory;
	
	public void insert(T entity){
		Session session = sessionFactory.getCurrentSession();
		session.save(entity);
	}
	
	public abstract T byEntity(int id);
	
	public abstract T byEntity(String login, String password, QueryHQL query);
	
	public abstract List<T> getList(QueryHQL query);
	
}
