package ua.kiev.inspector.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.kiev.inspector.model.HomeModel;
import ua.kiev.inspector.repository.dao.QueryHQL;
import ua.kiev.inspector.repository.dao.RinspDocDao;
import ua.kiev.inspector.repository.entity.RinspDoc;
import ua.kiev.inspector.transformers.BaseTransformer;

@Service
public class HomeService {
	
	@Autowired
	private RinspDocDao rinspDocImpl;
	
	@Autowired
	private BaseTransformer<RinspDoc, HomeModel> homeTarnsformer;

	public List<HomeModel> getAll(int userId) {
		List<HomeModel> result = new ArrayList<>();
		List<RinspDoc> rinspDocs = rinspDocImpl.getAllRisoDoc(new QueryHQL() {
			
			@Override
			public String getQuery() {
				return "SELECT r FROM RinspDoc r WHERE r.inspector.usersId = :userId";
			}
		}, userId);
		for (RinspDoc entity: rinspDocs ) {
			result.add(homeTarnsformer.entityToModel(entity));
		}
		return result;
	}
	
}