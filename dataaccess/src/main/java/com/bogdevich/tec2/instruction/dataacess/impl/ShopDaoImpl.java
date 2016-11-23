package com.bogdevich.tec2.instruction.dataacess.impl;

import java.util.List;
import java.util.function.Predicate;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.bogdevich.tec2.instruction.dataacess.ShopDao;
import com.bogdevich.tec2.instruction.dataacess.filter.ShopFilter;
import com.bogdevich.tec2.instruction.datamodel.Shop;
import com.bogdevich.tec2.instruction.datamodel.Shop_;

@Repository
public class ShopDaoImpl extends AbstractDaoImpl<Shop, Long, ShopFilter>implements ShopDao {

	protected ShopDaoImpl() {
		super(Shop.class);
	}

	@Override
	void handleFilterParameters(ShopFilter filter, CriteriaBuilder cb, CriteriaQuery<?> cq, Root<Shop> from) {

	}

	@Override
	public List<Shop> getRecordSorted(ShopFilter filter) {

		EntityManager em = getEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Shop> cq = cb.createQuery(Shop.class);
		Root<Shop> from = cq.from(Shop.class);

		cq.select(from);

		if (filter.isFetchCompany()) {
			from.fetch(Shop_.company, JoinType.LEFT);
		}
		return em.createQuery(cq).getResultList();
	}

	@Override
	public Shop getWithFeth(Long id) {

		EntityManager em = getEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Shop> cq = cb.createQuery(Shop.class);
		Root<Shop> from = cq.from(Shop.class);

		cq.select(from);

		from.fetch(Shop_.company, JoinType.LEFT);

		cq.where(cb.equal(from.get(Shop_.id), id));

		return em.createQuery(cq).getSingleResult();
	}
}
