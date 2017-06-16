package ua.kiev.inspector.services;

import java.util.Set;

public interface BaseService<T> {

	void add(T model);
	void update(T model);
	void delete(T model);
	T faid();
	T faid(String name);
	Set<T> all();
	
}
