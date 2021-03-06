package ua.kiev.inspector.services;

import java.util.List;

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
	public UserModel byId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public UserModel faid(String name) {
		User user = userDaoImpl.findByUserName(name);
		return userTransformer.entityToModel(user);
	}

	@Override
	public List<UserModel> all() {
		
		return null;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userDaoImpl.findByUserName(username);
		if (user == null) {
            throw new UsernameNotFoundException(username);
        }
		return userTransformer.entityToModel(user);
	}
	
	
}
