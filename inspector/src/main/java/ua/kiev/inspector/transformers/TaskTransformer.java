package ua.kiev.inspector.transformers;

import org.springframework.stereotype.Component;

import ua.kiev.inspector.model.TaskModel;
import ua.kiev.inspector.repository.entity.RinspDoc;

@Component
public class TaskTransformer implements BaseTransformer<RinspDoc, TaskModel>{
	
	private final String URL = "http://94.45.50.250:8080/inspector/resources/upload/";

	@Override
	public TaskModel entityToModel(RinspDoc entity) {
		TaskModel model = new TaskModel();
		model.setIdNumber(entity.getId());
		model.setStreet(entity.getStreet());
		model.setBuild(entity.getBuild());
		model.setLocation(entity.getLocAdd());
		model.setLat(entity.getY());
		model.setLng(entity.getX());
		model.setPhotoURL( URL + entity.getFotop());
		model.setSummary(entity.getOpis());
		model.setUsrNotes(entity.getPrim());
		model.setAdmNotes(entity.getAnswer());
		model.setCreated(entity.getDateDoc());
		return model;
	}

	@Override
	public RinspDoc modelToEntity(TaskModel model) {
		// TODO Auto-generated method stub
		return null;
	}

}
