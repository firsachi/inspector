package ua.kiev.inspector.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ua.kiev.inspector.model.UserModel;
import ua.kiev.inspector.services.BaseService;

@Controller
public class UserProfileController {
	
	@Autowired
	private Validator userProfileValidator;
	
	@Autowired
	private BaseService<UserModel> userService;

	@RequestMapping(value = "/user-profile", method = RequestMethod.GET)
	public ModelAndView pageUserProfile(Authentication authentication, UserModel userModel){
		userModel = (UserModel)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		ModelAndView model = initModelAndView("user-profile");
		model.addObject("user", userModel);
		return model;
	}
	
	@RequestMapping(value = "/editUserProfile", method = RequestMethod.POST)
	public String editUserProfile(@Valid @ModelAttribute("user") UserModel userModel, BindingResult bindingResult){
		System.out.println(bindingResult.hasErrors());
		if (bindingResult.hasErrors()) {
			System.out.println("12");
            return "user-profile";
        }else{
        	return "asd";
        }	
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
