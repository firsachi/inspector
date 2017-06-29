package ua.kiev.inspector.controllers;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ua.kiev.inspector.model.UserModel;

@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginPage(@RequestParam(value = "error", required = false) String error, Locale locale){
		logger.info("Welcome home! login form");
		ModelAndView model = new ModelAndView();
		if(error != null){
			model.addObject("error", "");
		}
		model.setViewName("login");
		model.addObject("user", new UserModel());
		model.addObject("locale", locale);
		return model;
	}
	
	@RequestMapping(value = "/chech_login_page", method = RequestMethod.POST)
	public String checkLoginPage(@Valid @ModelAttribute("user") UserModel user, BindingResult bindingResult){
		if (bindingResult.hasErrors()) {
            return "login";
        }else{
        	return "home";
        }
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logoutPage(HttpServletRequest request, HttpServletResponse response){
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	if (auth != null){    
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
    	return "redirect:/task";
    }
}
