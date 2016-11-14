package com.bogdevich.tec2.instruction.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bogdevich.tec2.instruction.webapp.object.UserProfile;

@Controller
public class TempController {

	@RequestMapping(value = "/loged-user", method = RequestMethod.POST)
	public ModelAndView logedUser(@ModelAttribute ("user") UserProfile user){
		return new ModelAndView("main", "user", user);
	}

}
