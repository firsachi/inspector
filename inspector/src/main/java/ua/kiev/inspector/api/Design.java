package ua.kiev.inspector.api;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.kiev.inspector.model.TaskModel;
import ua.kiev.inspector.model.UserModel;
import ua.kiev.inspector.services.TaskService;

@RestController
@RequestMapping(value="/api/", produces="text/plain;charset=UTF-8")
@Transactional
public class Design {
	
	
	@Autowired
	private TaskService taskService;
	
	@RequestMapping(value="objects")
	public String getObjects(){
		JSONArray array = new JSONArray();	
		UserModel user = (UserModel)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		taskService.setUserEmail(user.getUserId());
		
		for (TaskModel taskModel : taskService.all()){
			JSONObject resultJson = new JSONObject();
			try {
				resultJson.put("idNumber", taskModel.getIdNumber());
				resultJson.put("street", taskModel.getStreet());
				resultJson.put("summary", taskModel.getSummary());
				resultJson.put("created", taskModel.getCreated());
				array.put(resultJson);
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		return array.toString();
	}
	
	@GetMapping(value="objects/{id}")
	public String getObject(@PathVariable int id){
		UserModel user = (UserModel)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		taskService.setUserEmail(user.getUserId());
		TaskModel taskModel = taskService.byId(id);
		JSONObject resultJson = new JSONObject();
		try {
			resultJson.put("idNumber", taskModel.getIdNumber());
			resultJson.put("district", "");
			resultJson.put("street", taskModel.getStreet());
			resultJson.put("bldg", taskModel.getBuild());
			resultJson.put("location", taskModel.getLocation());
			resultJson.put("lat", taskModel.getLat());
			resultJson.put("lng", taskModel.getLng());
			resultJson.put("photoURL", taskModel.getPhotoURL());
			resultJson.put("summary", taskModel.getSummary());
			resultJson.put("usrNotes", taskModel.getUsrNotes());
			resultJson.put("admNotes", taskModel.getAdmNotes());
			resultJson.put("created", taskModel.getCreated());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultJson.toString();
	}
}
