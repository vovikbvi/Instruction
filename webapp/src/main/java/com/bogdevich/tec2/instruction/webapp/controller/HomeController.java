package com.bogdevich.tec2.instruction.webapp.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bogdevich.tec2.instruction.webapp.object.UserProfile;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		return new ModelAndView("home", "user", new UserProfile());
	}
	
/*	@RequestMapping(value = "/loged-user", method = RequestMethod.POST)
	public ModelAndView logedUser(@ModelAttribute ("user") UserProfile user){
		return new ModelAndView("main", "user", user);
	}
*/	
}
