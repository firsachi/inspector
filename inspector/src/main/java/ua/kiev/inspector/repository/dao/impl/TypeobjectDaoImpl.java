package ua.kiev.inspector.repository.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import ua.kiev.inspector.repository.dao.BaseDao;
import ua.kiev.inspector.repository.dao.QueryHQL;
import ua.kiev.inspector.repository.entity.InspectorTypeobject;

@Repository("typeobjectDaoImpl")
public class TypeobjectDaoImpl extends BaseDao<InspectorTypeobject>{

	@Override
	public List<InspectorTypeobject> getList(QueryHQL query) {
		return null;
	}

	@Override
	public InspectorTypeobject byEntity(String login, String password, QueryHQL query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InspectorTypeobject byEntity(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
