package ua.kiev.inspector.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.kiev.inspector.model.UserModel;
import ua.kiev.inspector.repository.dao.RinspDocDao;

@Controller
public class HomeController {
	
	@Autowired
	private RinspDocDao rispDaoImpl;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homePage(Model model){
		UserModel user = (UserModel)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		// taskService.setUserEmail(user.getUserId());
		model.addAttribute("user", user);
		model.addAttribute("tasks", rispDaoImpl.getAllRisoDoc(user.getUserId()));
		return "home";
	}
	
	@GetMapping(value = "/home{taskId}" )
	public String taskIdPage(@PathVariable("taskId") int id, Model model){
		model.addAttribute("title", "task.title");
		UserModel user = (UserModel)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		model.addAttribute("user", user);
		model.addAttribute("task", rispDaoImpl.getByRispDoc(id, user.getUserId()));
		return "view-task";
	}
}
