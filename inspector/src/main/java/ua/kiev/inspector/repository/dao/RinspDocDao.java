package ua.kiev.inspector.repository.dao;

import java.util.List;

import ua.kiev.inspector.repository.entity.RinspDoc;

public interface RinspDocDao {
	
	public List<RinspDoc> getAllRisoDoc(QueryHQL query, int inspectorUser);

}
