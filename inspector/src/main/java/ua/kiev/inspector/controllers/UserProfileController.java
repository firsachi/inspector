package ua.kiev.inspector.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ua.kiev.inspector.model.UserModel;

@Controller
public class UserProfileController {

	@RequestMapping(value = "/user-profile", method = RequestMethod.GET)
	public ModelAndView pageUserProfile(){
		ModelAndView model = initModelAndView("user-profile");
		return model;
	}
	
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public ModelAndView pageRegistration(){
		ModelAndView model = initModelAndView("registration");
		return model;
	}

	private ModelAndView initModelAndView(String viewName) {
		ModelAndView model = new ModelAndView();
		model.setViewName(viewName);
		model.addObject("user", new UserModel());
		return model;
	}
	

}
