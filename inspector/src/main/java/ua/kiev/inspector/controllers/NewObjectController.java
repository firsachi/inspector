package ua.kiev.inspector.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ua.kiev.inspector.model.TaskModel;
import ua.kiev.inspector.model.UserModel;
import ua.kiev.inspector.services.TaskService;

@Controller
public class NewObjectController {
	
	@Autowired
	private TaskService taskService; 
	
	@RequestMapping(value = "/NewObject", method = RequestMethod.GET)
	public ModelAndView newObjectPage(){
		ModelAndView model = new ModelAndView();
		model.setViewName("NewObject");
		UserModel user = (UserModel)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		model.addObject("user", user);
		model.addObject("newObject", new TaskModel());
		return model;
	}
}
