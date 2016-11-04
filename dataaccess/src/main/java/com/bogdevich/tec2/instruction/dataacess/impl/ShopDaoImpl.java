package com.bogdevich.tec2.instruction.dataacess.impl;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.bogdevich.tec2.instruction.dataacess.ShopDao;
import com.bogdevich.tec2.instruction.dataacess.filter.ShopFilter;
import com.bogdevich.tec2.instruction.datamodel.Shop;

@Repository
public class ShopDaoImpl extends AbstractDaoImpl<Shop, Long, ShopFilter> implements ShopDao{

	protected ShopDaoImpl() {
		super(Shop.class);
	}

	@Override
	void handleFilterParameters(ShopFilter filter, CriteriaBuilder cb, CriteriaQuery<?> cq, Root<Shop> from) {
		
	}

}
