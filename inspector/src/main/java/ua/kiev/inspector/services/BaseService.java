package ua.kiev.inspector.services;

import java.util.List;

public interface BaseService<T> {

	void add(T model);
	void update(T model);
	void delete(T model);
	T byId(int id);
	T faid(String name);
	List<T> all();
	
}
