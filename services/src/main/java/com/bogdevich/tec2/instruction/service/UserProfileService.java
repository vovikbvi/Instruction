package com.bogdevich.tec2.instruction.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.bogdevich.tec2.instruction.datamodel.UserProfile;

public interface UserProfileService {

	@Transactional
	void insert(UserProfile userProfile);

	@Transactional
	void update(UserProfile userProfile);

	@Transactional
	void delete(Long id);

	UserProfile get(Long id);

	List<UserProfile> getAll();

}
