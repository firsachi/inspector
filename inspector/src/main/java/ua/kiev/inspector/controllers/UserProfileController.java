package ua.kiev.inspector.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ua.kiev.inspector.model.UserModel;
import ua.kiev.inspector.services.BaseService;
import ua.kiev.inspector.services.UserService;

@Controller
public class UserProfileController {
	
	@Autowired
	private BaseService<UserModel> userService;

	@RequestMapping(value = "/user-profile", method = RequestMethod.GET)
	public ModelAndView pageUserProfile(Authentication authentication){
		UserModel user = (UserModel)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		ModelAndView model = initModelAndView("user-profile");
		model.addObject("user", user);
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
