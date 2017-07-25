package ua.kiev.inspector.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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
import ua.kiev.inspector.repository.entity.InspectorRegion;
import ua.kiev.inspector.services.TaskService;

@RequestMapping(value = "/NewObject")
@Controller
public class NewObjectController {
	
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
	
	@RequestMapping(value = "save")
	public String submit(){
		return "";
	}
	
	@ModelAttribute(name = "districts")
	public List<InspectorRegion> listRegion(){
		return inspectorRegionDaoImpl.getAll();
	}
}
