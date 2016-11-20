package com.bogdevich.tec2.instruction.webapp.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bogdevich.tec2.instruction.dataacess.filter.ShopFilter;
import com.bogdevich.tec2.instruction.datamodel.Company;
import com.bogdevich.tec2.instruction.datamodel.Shop;
import com.bogdevich.tec2.instruction.service.CompanyService;
import com.bogdevich.tec2.instruction.service.ShopService;

@Controller
public class ShopController {
	
	@Inject 
	private ShopService shopService;
	
	@Inject
	private CompanyService companyService;

	@RequestMapping(value = "/view-shop", method = RequestMethod.GET)
	public String viewShop (Model model){
		
		addAllShopsInModel(model);
		
		return "shop/list-shop";
	}

	public void addAllShopsInModel(Model model) {
		ShopFilter filter = new ShopFilter();
		filter.setFetchCompany(true);
		
		List<Shop> shops = shopService.getRecordSorted(filter);
		model.addAttribute("shops", shops);
	}
	
	@RequestMapping(value = "/edit-shop-{id}", method = RequestMethod.GET)
	public String editShop(Model model, @PathVariable Long id){
		
		Shop shop = shopService.get(id);
		model.addAttribute("shop", shop);
		
		List<Company> companies = companyService.getAll();
		model.addAttribute("companies", companies);
		
		return "shop/edit-shop";
	}

	@RequestMapping(value = "/edit-shop-{id}", method = RequestMethod.POST)
	public String updateShop(Model model, Shop shop){
		
		shopService.update(shop);
		
		addAllShopsInModel(model);		
		
		return "shop/list-shop";
	}
	
	
}
