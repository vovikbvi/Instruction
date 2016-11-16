package com.bogdevich.tec2.instruction.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bogdevich.tec2.instruction.dataacess.UserProfileDao;
import com.bogdevich.tec2.instruction.datamodel.UserProfile;
import com.bogdevich.tec2.instruction.service.UserProfileService;

@Service
public class UserProfileServiceImpl implements UserProfileService{

	@Inject
	public UserProfileDao userProfileDao;
	
	
	@Override
	public void insert (UserProfile userProfile){
		userProfileDao.insert(userProfile);
	}
	
	@Override 
	public void update (UserProfile userProfile){
		userProfileDao.update(userProfile);
	}
	
	@Override
	public void delete (Long id){
		userProfileDao.delete(id);
	}
	
	@Override 
	public UserProfile get(Long id){
		return userProfileDao.get(id);
	}

	@Override 
	public List<UserProfile> getAll(){
		return userProfileDao.getAll();
	}

}
