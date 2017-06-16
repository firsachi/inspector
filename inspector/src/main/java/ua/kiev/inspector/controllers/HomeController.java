package ua.kiev.inspector.controllers;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ua.kiev.inspector.model.UserModel;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView homePage(){
		ModelAndView model = new ModelAndView();
		model.setViewName("home");
		UserModel user = (UserModel)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		model.addObject("user", user);
		return model;
	}

}
