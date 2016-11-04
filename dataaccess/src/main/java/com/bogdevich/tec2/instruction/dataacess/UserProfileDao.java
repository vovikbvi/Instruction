package com.bogdevich.tec2.instruction.dataacess;

import com.bogdevich.tec2.instruction.dataacess.filter.UserProfileFilter;
import com.bogdevich.tec2.instruction.datamodel.UserProfile;

public interface UserProfileDao extends AbstractDao<UserProfile, Long, UserProfileFilter>{

}
