package com.bogdevich.tec2.instruction.webapp.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bogdevich.tec2.instruction.dataacess.filter.InstrFilter;
import com.bogdevich.tec2.instruction.datamodel.Instr;
import com.bogdevich.tec2.instruction.service.InstrService;
import com.bogdevich.tec2.instruction.webapp.object.UserProfile;

@Controller
public class InstrController {

	@Inject
	public InstrService instrService;

	@RequestMapping(value = "/view-instr", method = RequestMethod.GET)
	public String viewInstruction(ModelMap model) {

		InstrFilter filter = new InstrFilter();
		filter.setFetchInstrType(true);
		filter.setFetchLocation(true);
		filter.setFetchUserProfile(true);
		List<Instr> instructions = instrService.getRecordSorted(filter);
		model.addAttribute("instructions", instructions);

		return "instruction/list_instr";
	}

	@RequestMapping(value = "/edit-instr-{id}", method = RequestMethod.GET)
	public String editInstructions(ModelMap model, @PathVariable Long id) {

		Instr instr = instrService.get(id);
		model.addAttribute("instr", instr);

		return "instruction/edit-instr";
	}

	@RequestMapping(value = "/edit-instr-{id}", method = RequestMethod.POST)
	public String updateInstructions(Instr instr, Model model) {

		instrService.update(instr);

		model.addAttribute("user", new UserProfile());
		return "home";
	}

}
