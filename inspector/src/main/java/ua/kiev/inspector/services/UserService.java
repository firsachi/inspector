package ua.kiev.inspector.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import base_inspector.dao.UserDao;
import base_inspector.entity.User;
import ua.kiev.inspector.model.UserModel;
import ua.kiev.inspector.transformers.BaseTransformer;

@Service
public class UserService implements BaseService<UserModel>{

	@Autowired
	private BaseTransformer<User, UserModel> userTransformer;
	
	@Autowired
	private UserDao userDao;

	@Override
	public void add(UserModel model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UserModel model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UserModel model) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public UserModel faid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<UserModel> all() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
