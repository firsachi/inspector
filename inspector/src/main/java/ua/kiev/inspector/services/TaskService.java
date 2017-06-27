package ua.kiev.inspector.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.kiev.inspector.model.TaskModel;
import ua.kiev.inspector.repository.dao.BaseDao;
import ua.kiev.inspector.repository.dao.QueryHQL;
import ua.kiev.inspector.repository.dao.QueryObject;
import ua.kiev.inspector.repository.entity.RinspDoc;
import ua.kiev.inspector.transformers.BaseTransformer;

@Service
public class TaskService implements BaseService<TaskModel>{
	
	private int userId;
	
	@Autowired
	private BaseDao<RinspDoc> rinspDocDaoImpl;
	
	@Autowired
	private BaseTransformer<RinspDoc, TaskModel> taskTransformer;
	
	public void setUserEmail(int userId){
		this.userId = userId;
	}

	@Override
	public void add(TaskModel model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(TaskModel model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(TaskModel model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TaskModel faid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TaskModel faid(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<TaskModel> all() {
		List<RinspDoc> listTask = rinspDocDaoImpl.getList(new QueryHQL() {
			
			@Override
			public QueryObject getQuery() {
				QueryObject queryObject = new QueryObject();
				queryObject.setQueryHQL("SELECT r FROM RinspDoc r ");
				queryObject.addParametr("userId", userId);
				return queryObject;
			}
		});
		System.out.println(listTask.size());
		return null;
	}

}
