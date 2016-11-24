package com.bogdevich.tec2.instruction.webapp.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bogdevich.tec2.instruction.dataacess.filter.UserProfileFilter;
import com.bogdevich.tec2.instruction.datamodel.Shop;
import com.bogdevich.tec2.instruction.datamodel.UserProfile;
import com.bogdevich.tec2.instruction.service.ShopService;
import com.bogdevich.tec2.instruction.service.UserProfileService;

@Controller
public class UserProfileController {

	@Inject
	private UserProfileService userProfileService;

	@Inject
	private ShopService shopService;

	@RequestMapping(value = "/view-user-profile", method = RequestMethod.GET)
	public String viewUserProfile(ModelMap model) {

		addAllUserProfileInModel(model);

		return "user_profile/list-user-profile";
	}

	
	
	private void addAllUserProfileInModel(ModelMap model) {
		UserProfileFilter filter = new UserProfileFilter();
		filter.setFetchShop(true);

		List<UserProfile> userProfiles = userProfileService.getRecordSorted(filter);
		model.addAttribute("userProfiles", userProfiles);
	}

	
	
	@RequestMapping(value = "/edit-user-profile-{id}", method = RequestMethod.GET)
	public String editUserProfile(ModelMap model, @PathVariable Long id) {

		UserProfile userProfile = userProfileService.getWithFetch(id);
		model.addAttribute("userProfile", userProfile);

		List<Shop> shops = shopService.getAll();
		model.addAttribute("shops", shops);


		return "user_profile/edit-user-profile";
	}

	
	
	@RequestMapping(value = "/edit-user-profile-{id}", method = RequestMethod.POST)
	public String updateUserProfile(@ModelAttribute UserProfile userProfile, ModelMap model) {

		userProfileService.update(userProfile);

		addAllUserProfileInModel(model);

		return "user_profile/list-user-profile";
	}

}
