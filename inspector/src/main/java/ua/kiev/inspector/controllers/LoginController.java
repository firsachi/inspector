package ua.kiev.inspector.controllers;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginPage(Locale locale){
		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		model.addObject("locale", locale);
		return model;
	}
}
