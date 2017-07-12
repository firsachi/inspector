package ua.kiev.inspector.repository.dao;

import java.util.List;

import org.hibernate.engine.query.spi.HQLQueryPlan;

import ua.kiev.inspector.repository.entity.RinspDoc;

public interface RinspDocDao {
	
	public List<RinspDoc> getAllRisoDoc(HQLQueryPlan query);

}
