package ua.kiev.inspector.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ua.kiev.inspector.model.UserModel;
import ua.kiev.inspector.services.TaskService;

@RequestMapping(value = "/home", method = RequestMethod.GET)
@Controller
public class HomeController {
	
	@Autowired
	private TaskService taskService;
	
	@RequestMapping
	public ModelAndView homePage(){
		ModelAndView model = new ModelAndView();
		model.setViewName("home");
		UserModel user = (UserModel)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		taskService.setUserEmail(user.getUserId());
		model.addObject("user", user);
		model.addObject("tasks", taskService.all());
		return model;
	}
	
	@GetMapping(value = "/{taskId}")
	public String taskIdPage(@PathVariable("taskId") int id, Model model){
		model.addAttribute("title", "task.title");
		return "view-task";
	}

}
