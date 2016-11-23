package com.bogdevich.tec2.instruction.webapp.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bogdevich.tec2.instruction.datamodel.Company;
import com.bogdevich.tec2.instruction.service.CompanyService;

@Controller
public class CompanyController {

	@Inject
	private CompanyService companyService;
	
	@RequestMapping(value = "/view-company", method = RequestMethod.GET)
	public String viewCompany(Model model){
		
		addAllCompanyInModel(model);
		return "company/list-company";
	}

	private void addAllCompanyInModel(Model model) {
		List<Company> companies= companyService.getAll();
		model.addAttribute("companies", companies);
	}
	
	@RequestMapping(value = "/edit-company-{id}", method  = RequestMethod.GET)
	public String editCompany(Model model, @PathVariable Long id){
		
		Company company = companyService.get(id);
		model.addAttribute("company", company);
		
		return "company/edit-company";
	}

	@RequestMapping(value = "/edit-company-{id}", method  = RequestMethod.POST)
	public String updateCompany(@ModelAttribute Company company, Model model){
		
		companyService.update(company);
		
		
		addAllCompanyInModel(model);
		
		return "company/list-company";
	}
	
	
}
