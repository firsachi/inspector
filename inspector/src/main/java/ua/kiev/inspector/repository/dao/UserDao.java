package ua.kiev.inspector.repository.dao;

import org.springframework.stereotype.Repository;

import ua.kiev.inspector.repository.entity.User;


@Repository
public interface UserDao {

	User findByUserName(String username);
}
