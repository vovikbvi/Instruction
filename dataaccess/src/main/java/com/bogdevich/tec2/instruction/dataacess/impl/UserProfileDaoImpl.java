package com.bogdevich.tec2.instruction.dataacess.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.bogdevich.tec2.instruction.dataacess.UserProfileDao;
import com.bogdevich.tec2.instruction.dataacess.filter.UserProfileFilter;
import com.bogdevich.tec2.instruction.datamodel.Shop;
import com.bogdevich.tec2.instruction.datamodel.Shop_;
import com.bogdevich.tec2.instruction.datamodel.UserProfile;
import com.bogdevich.tec2.instruction.datamodel.UserProfile_;

@Repository
public class UserProfileDaoImpl extends AbstractDaoImpl<UserProfile, Long, UserProfileFilter> implements UserProfileDao{

	protected UserProfileDaoImpl() {
		super(UserProfile.class);
	}

	@Override
	void handleFilterParameters(UserProfileFilter filter, CriteriaBuilder cb, CriteriaQuery<?> cq,
			Root<UserProfile> from) {
		
	}

	@Override
	public List<UserProfile> getRecordSorted (UserProfileFilter filter){
		EntityManager em = getEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<UserProfile> cq = cb.createQuery(UserProfile.class);
		Root<UserProfile> from = cq.from(UserProfile.class);

		cq.select(from);

		if (filter.isFetchShop()) {
			from.fetch(UserProfile_.shop, JoinType.LEFT);
		}
		return em.createQuery(cq).getResultList();
	}

	@Override
	public UserProfile getWithFeth(Long id) {

		EntityManager em = getEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<UserProfile> cq = cb.createQuery(UserProfile.class);
		Root<UserProfile> from = cq.from(UserProfile.class);

		cq.select(from);

		from.fetch(UserProfile_.shop, JoinType.LEFT);

		cq.where(cb.equal(from.get(Shop_.id), id));

		return em.createQuery(cq).getSingleResult();
	}
	
	
}
