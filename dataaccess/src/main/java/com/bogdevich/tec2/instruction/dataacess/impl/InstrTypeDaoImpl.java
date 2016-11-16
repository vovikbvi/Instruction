package com.bogdevich.tec2.instruction.dataacess.impl;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.bogdevich.tec2.instruction.dataacess.InstrTypeDao;
import com.bogdevich.tec2.instruction.dataacess.filter.InstrTypeFilter;
import com.bogdevich.tec2.instruction.datamodel.InstrType;

@Repository
public class InstrTypeDaoImpl extends AbstractDaoImpl<InstrType, Long, InstrTypeFilter> implements InstrTypeDao{

	protected InstrTypeDaoImpl() {
		super(InstrType.class);
	}

	@Override
	void handleFilterParameters(InstrTypeFilter filter, CriteriaBuilder cb, CriteriaQuery<?> cq, Root<InstrType> from) {
		
	}

}
