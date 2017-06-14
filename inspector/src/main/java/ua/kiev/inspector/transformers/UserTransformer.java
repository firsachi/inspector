package ua.kiev.inspector.transformers;

import org.springframework.stereotype.Component;

import base_inspector.entity.User;
import ua.kiev.inspector.model.UserModel;

@Component
public class UserTransformer implements BaseTransformer<User, UserModel>{

	@Override
	public UserModel entityToModel(User entity) {
		UserModel model = new UserModel();
		model.setFirstName(entity.getName());
		model.setLastName(entity.getLastname());
		model.setUsername(entity.getMail());
		model.setPassword(entity.getPassword());
		return model;
	}

	@Override
	public User modelToEntity(UserModel model) {
		// TODO Auto-generated method stub
		return null;
	}

}
