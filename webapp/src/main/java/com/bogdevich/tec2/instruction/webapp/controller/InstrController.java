package com.bogdevich.tec2.instruction.webapp.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bogdevich.tec2.instruction.dataacess.filter.InstrFilter;
import com.bogdevich.tec2.instruction.datamodel.Instr;
import com.bogdevich.tec2.instruction.datamodel.InstrType;
import com.bogdevich.tec2.instruction.datamodel.Shop;
import com.bogdevich.tec2.instruction.datamodel.UserProfile;
import com.bogdevich.tec2.instruction.service.InstrService;
import com.bogdevich.tec2.instruction.service.InstrTypeService;
import com.bogdevich.tec2.instruction.service.ShopService;
import com.bogdevich.tec2.instruction.service.UserProfileService;

@Controller
public class InstrController {

	@Inject
	private InstrService instrService;
	
	@Inject
	private InstrTypeService instrTypeService;
	
	@Inject
	private UserProfileService userProfileService;
	
	@Inject
	private ShopService shopService;

	@RequestMapping(value = "/view-instr", method = RequestMethod.GET)
	public String viewInstruction(ModelMap model) {

		addAllInstrInModel(model);

		return "instruction/list_instr";
	}

	private void addAllInstrInModel(ModelMap model) {
		InstrFilter filter = new InstrFilter();
		filter.setFetchInstrType(true);
		filter.setFetchLocation(true);
		filter.setFetchUserProfile(true);
		List<Instr> instructions = instrService.getRecordSorted(filter);
		model.addAttribute("instructions", instructions);
	}

	@RequestMapping(value = "/edit-instr-{id}", method = RequestMethod.GET)
	public String editInstructions(ModelMap model, @PathVariable Long id) {

		
		Instr instr = instrService.getWithFetch(id);
		model.addAttribute("instr", instr);
		
		List<InstrType> instrTypes = instrTypeService.getAll();
		model.addAttribute("instrTypes", instrTypes);
		
		List<UserProfile> userProfiles = userProfileService.getAll();
		model.addAttribute("userProfiles", userProfiles);
		
		List<Shop> shops = shopService.getAll();
		model.addAttribute("shops", shops);
		

		return "instruction/edit-instr";
	}

	@RequestMapping(value = "/edit-instr-{id}", method = RequestMethod.POST)
	public String updateInstructions(@ModelAttribute Instr instr, ModelMap model) {

		instrService.update(instr);

		addAllInstrInModel(model);
		
		return "instruction/list_instr";
	}

}
