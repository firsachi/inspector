package ua.kiev.inspector.repository.dao;

import java.util.List;

import ua.kiev.inspector.repository.entity.InspectorTypeobject;

public interface TypeObjectDao {
	
	List<InspectorTypeobject> getAll();

}
