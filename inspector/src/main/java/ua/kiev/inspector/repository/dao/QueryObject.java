package ua.kiev.inspector.repository.dao;

import java.util.HashMap;
import java.util.Map;;

public class QueryObject {
	
	private String queryHQL;
	private Map<String, Object> parametrs;
	
	public QueryObject() {
		parametrs = new HashMap<String, Object>();
	}

	public String getQueryHQL() {
		return queryHQL;
	}

	public void setQueryHQL(String queryHQL) {
		this.queryHQL = queryHQL;
	}

	public Map<String, ?> getParametrs() {
		return parametrs;
	}

	public void addParametr(String key, int value) {
		parametrs.put(key, value);
	}
	
}
