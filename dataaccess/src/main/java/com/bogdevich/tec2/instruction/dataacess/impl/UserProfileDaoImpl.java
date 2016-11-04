package com.bogdevich.tec2.instruction.dataacess.impl;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.bogdevich.tec2.instruction.dataacess.UserProfileDao;
import com.bogdevich.tec2.instruction.dataacess.filter.UserProfileFilter;
import com.bogdevich.tec2.instruction.datamodel.UserProfile;

@Repository
public class UserProfileDaoImpl extends AbstractDaoImpl<UserProfile, Long, UserProfileFilter> implements UserProfileDao{

	protected UserProfileDaoImpl() {
		super(UserProfile.class);
	}

	@Override
	void handleFilterParameters(UserProfileFilter filter, CriteriaBuilder cb, CriteriaQuery<?> cq,
			Root<UserProfile> from) {
		
	}

}
