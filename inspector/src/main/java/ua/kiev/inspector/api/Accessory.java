package ua.kiev.inspector.api;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.kiev.inspector.repository.dao.InspectorRegionDao;
import ua.kiev.inspector.repository.dao.TypeObjectDao;
import ua.kiev.inspector.repository.entity.InspectorRegion;
import ua.kiev.inspector.repository.entity.InspectorTypeobject;

@RestController
@RequestMapping(value="/api/", produces="text/plain;charset=UTF-8")
@Transactional
public class Accessory {
	
	@Autowired
	private InspectorRegionDao inspectorRegionDaoImpl;
	
	@Autowired
	private TypeObjectDao typeObjectDaoImpl;
	
	@RequestMapping(value="districs")
	private String getAllDistrics(){
		JSONArray array = new JSONArray();
		for(InspectorRegion region: inspectorRegionDaoImpl.getAll()){
			JSONObject resultJson = new JSONObject();
			try {
				resultJson.put("id", region.getRegionId());
				resultJson.put("name", region.getName());
				array.put(resultJson);
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		return array.toString();
	}
	
	@RequestMapping(value="typeObject")
	private String getLitTypeObjects(){
		JSONArray array = new JSONArray();
		for(InspectorTypeobject value: typeObjectDaoImpl.getAll()){
			JSONObject resultJson = new JSONObject();
			try {
				resultJson.put("id", value.getTypeobjectId());
				resultJson.put("name", value.getName());
				array.put(resultJson);
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		return array.toString();
	}
}
