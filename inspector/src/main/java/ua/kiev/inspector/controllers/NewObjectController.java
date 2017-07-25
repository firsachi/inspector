package ua.kiev.inspector.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ua.kiev.inspector.model.TaskModel;
import ua.kiev.inspector.model.UserModel;
import ua.kiev.inspector.repository.dao.InspectorRegionDao;
import ua.kiev.inspector.repository.dao.TypeObjectDao;
import ua.kiev.inspector.repository.entity.InspectorRegion;
import ua.kiev.inspector.repository.entity.InspectorTypeobject;
import ua.kiev.inspector.services.TaskService;

@RequestMapping(value = "/NewObject")
@Controller
public class NewObjectController {
	
	@Autowired
	private TypeObjectDao typeObjectDaoImpl;
	
	@Autowired
	private InspectorRegionDao inspectorRegionDaoImpl;
	
	@Autowired
	private TaskService taskService; 
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView newObjectPage(){
		ModelAndView model = new ModelAndView();
		model.setViewName("NewObject");
		UserModel user = (UserModel)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		model.addObject("user", user);
		model.addObject("newObject", new TaskModel());
		return model;
	}
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String submit(@ModelAttribute("newObject") TaskModel taskModel){
		
		return "redirect:../home";
	}
	
	@ModelAttribute(name = "districts")
	public List<InspectorRegion> listRegion(){
		return inspectorRegionDaoImpl.getAll();
	}
	
	@ModelAttribute(name = "typeObjects")
	public List<InspectorTypeobject> gerListTypeObgects(){
		return typeObjectDaoImpl.getAll();
	}
}
