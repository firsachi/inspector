package ua.kiev.inspector.services;

import java.util.Set;

public interface BaseService<T> {

	void add(T model);
	void update(T model);
	void delete(T model);
	T faid();
	Set<T> all();
	
}
