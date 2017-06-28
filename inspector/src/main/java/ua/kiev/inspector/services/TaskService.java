package ua.kiev.inspector.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.kiev.inspector.model.TaskModel;
import ua.kiev.inspector.repository.dao.BaseDao;
import ua.kiev.inspector.repository.dao.QueryHQL;
import ua.kiev.inspector.repository.entity.RinspDoc;
import ua.kiev.inspector.transformers.BaseTransformer;

@Transactional
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
	@Transactional
	public TaskModel byId(int id) {
		final int taskId = id;
		RinspDoc rinspDoc = rinspDocDaoImpl.byEntity(new QueryHQL() {
			
			@Override
			public String getQuery() {
				return "SELECT r FROM RinspDoc r WHERE r.inspectorUser = " + userId + "AND r.id = " + taskId;
			}
		});
		return taskTransformer.entityToModel(rinspDoc);
	}

	@Override
	public TaskModel faid(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<TaskModel> all() {
		List<RinspDoc> listTask = rinspDocDaoImpl.getList(new QueryHQL() {
			
			@Override
			public String getQuery() {
				return "SELECT r FROM RinspDoc r WHERE r.inspectorUser = " + userId;
			}
		});
		List<TaskModel> resultLIst = new ArrayList<TaskModel>();
		for(RinspDoc rinspDoc: listTask){
			resultLIst.add(taskTransformer.entityToModel(rinspDoc));
		}
		return resultLIst;
	}

}
