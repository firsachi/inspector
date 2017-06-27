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
		System.out.println(taskService.all().size());
		/*
		User inspectorUser = userDaoIlmp.byEntity("temugin4303@mail.ua", "b35c7c6c1c5644fce580a7c0f1ba4079", new QueryHQL() {
			//WHERE i.mail = :login AND i.password = :password
			public String getQuery() {
				return "SELECT I FROM InspectorUser I WHERE I.mail = :login";
			}
		});
		for (RinspDoc rinspDoc: inspectorUser.getListRinspDocs()){
			JSONObject resultJson = new JSONObject();
			try {
				resultJson.put("idNumber", rinspDoc.getId());
				resultJson.put("street", rinspDoc.getStreet());
				resultJson.put("summary", rinspDoc.getInspectorTypeobject().getName());
				resultJson.put("created", rinspDoc.getDateDoc());
				array.put(resultJson);
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}*/
		return array.toString();
	}
	
	@GetMapping(value="objects/{id}")
	public String getObject(@PathVariable int id){
		//RinspDoc rinspDoc = rinspDocDaoImpl.byEntity(id);
		JSONObject resultJson = new JSONObject();
		/*
		try {
			String url = "http://94.45.50.250:8080/inspector/resources/upload/";
			resultJson.put("idNumber", rinspDoc.getId());
			resultJson.put("district", "");
			resultJson.put("street", rinspDoc.getStreet());
			resultJson.put("bldg", rinspDoc.getBuild());
			resultJson.put("location", rinspDoc.getLocAdd());
			resultJson.put("lat", rinspDoc.getY());
			resultJson.put("lng", rinspDoc.getX());
			resultJson.put("photoURL", url + rinspDoc.getFotop());
			resultJson.put("summary", rinspDoc.getOpis());
			resultJson.put("usrNotes", rinspDoc.getPrim());
			resultJson.put("admNotes", rinspDoc.getAnswer());
			resultJson.put("created", rinspDoc.getDateDoc());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return resultJson.toString();
	}
}
