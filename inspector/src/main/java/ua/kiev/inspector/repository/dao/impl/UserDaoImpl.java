package ua.kiev.inspector.repository.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ua.kiev.inspector.repository.dao.UserDao;
import ua.kiev.inspector.repository.entity.User;

@Repository("userDaoImpl")
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User findByUserName(String username) {
		Session session = sessionFactory.getCurrentSession();
		String query = "SELECT u FROM User u WHERE u.mail = :username";
		TypedQuery<User> typedQuery = session.createQuery(query, User.class);
		typedQuery.setParameter("username", username);
		List<User> users = typedQuery.getResultList();
		if (users.size() > 0) {
			return users.get(0);
		} else {
			return null;
		}
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
