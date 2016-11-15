package com.bogdevich.tec2.instruction.dataacess.impl;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.bogdevich.tec2.instruction.dataacess.SetingsDao;
import com.bogdevich.tec2.instruction.dataacess.filter.SetingsFilter;
import com.bogdevich.tec2.instruction.datamodel.Setings;

@Repository
public class SetingsDaoImpl extends AbstractDaoImpl<Setings, Long, SetingsFilter> implements SetingsDao{

	protected SetingsDaoImpl() {
		super(Setings.class);
	}

	@Override
	void handleFilterParameters(SetingsFilter filter, CriteriaBuilder cb, CriteriaQuery<?> cq, Root<Setings> from) {
		
	}

}
