package com.bogdevich.tec2.instruction.service;


import java.util.Date;

import javax.inject.Inject;

import com.bogdevich.tec2.instruction.datamodel.Company;
import com.bogdevich.tec2.instruction.datamodel.Instr;
import com.bogdevich.tec2.instruction.datamodel.InstrType;
import com.bogdevich.tec2.instruction.datamodel.Setings;
import com.bogdevich.tec2.instruction.datamodel.Shop;
import com.bogdevich.tec2.instruction.datamodel.UserProfile;
import com.bogdevich.tec2.instruction.datamodel.UserRole;

public class AbstractTest {

	@Inject
	public CompanyService companyService;

	@Inject
	public InstrService instrService;

	@Inject
	public InstrTypeService instrTypeService;

	@Inject
	public SetingsService setingsService;

	@Inject
	public ShopService shopService;

	@Inject
	public UserProfileService userProfileService;

	protected InstrType addInstrType() {
		InstrType instrType = new InstrType();
		instrType.setName("Instr-type");
		instrTypeService.insert(instrType);
		return instrTypeService.get(instrType.getId());
	}

	protected Company addCompany(){
		Company company = new Company();
		company.setName("company-name");
		companyService.insert(company);
		return companyService.get(company.getId());
	}
	
	protected Shop addShop(){
		Shop shop = new Shop();
		shop.setName("shop-name");
		shop.setCompany(addCompany());
		shopService.insert(shop);
		return shopService.get(shop.getId());
		
	}
	
	protected UserProfile addUserProfile(){
		UserProfile userProfile = new UserProfile();
		userProfile.setLogin("login"+(int) (Math.random()*1000000));
		userProfile.setPassword("password");
		userProfile.setFirstName("firstName");
		userProfile.setLastName("lastName");
		userProfile.setEmail("email@tut.by");
		userProfile.setShop(addShop());
		userProfile.setRole(UserRole.ADMIN);
		userProfileService.insert(userProfile);
		return userProfileService.get(userProfile.getId());
	}
	
	protected Instr addInstr(){
		Instr instr = new Instr();
		instr.setName("instr-name");
		instr.setOvner(addUserProfile());
		instr.setInstrType(addInstrType());
		instr.setLocation(addShop());
		instr.setDateReview(new Date());
		instr.setValidity(1);
		instrService.insert(instr);
		return instrService.get(instr.getId());
	}
	
	protected Setings addSetings(){
		Setings setings = new Setings();
		setings.setName("test-name");
		setings.setValue("test-value");
		setingsService.insert(setings);
		return setingsService.get(setings.getId());
	}
}
