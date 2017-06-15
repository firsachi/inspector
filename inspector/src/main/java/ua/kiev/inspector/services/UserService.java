package ua.kiev.inspector.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.kiev.inspector.model.UserModel;
import ua.kiev.inspector.repository.dao.UserDao;
import ua.kiev.inspector.repository.entity.User;
import ua.kiev.inspector.transformers.BaseTransformer;

@Service("userService")
@Transactional
public class UserService implements BaseService<UserModel>,UserDetailsService{

	@Autowired
	private BaseTransformer<User, UserModel> userTransformer;
	
	@Autowired
	private UserDao userDaoImpl;

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

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
