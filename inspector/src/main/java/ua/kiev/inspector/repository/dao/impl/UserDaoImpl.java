package ua.kiev.inspector.repository.dao.impl;

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
		return null;
	}

}
