package com.bogdevich.tec2.instruction.webapp.controller;



import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bogdevich.tec2.instruction.datamodel.Instr;
import com.bogdevich.tec2.instruction.service.InstrService;
import com.bogdevich.tec2.instruction.webapp.object.UserProfile;

import javassist.bytecode.InstructionPrinter;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	public InstrService instrService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		return new ModelAndView("home", "user", new UserProfile());
	}
	
	@RequestMapping(value = "/view-instr", method = RequestMethod.GET)
	public String viewInstruction (ModelMap model){
		
		List<Instr> instructions = instrService.getAll();
		model.addAttribute("instructions", instructions);
		
		return "list_instr";
	}
}
