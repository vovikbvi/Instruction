package com.bogdevich.tec2.instruction.dataacess.impl;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.bogdevich.tec2.instruction.dataacess.InstrDao;
import com.bogdevich.tec2.instruction.dataacess.filter.InstrFilter;
import com.bogdevich.tec2.instruction.datamodel.Instr;

@Repository
public class InstrDaoImpl extends AbstractDaoImpl<Instr, Long, InstrFilter> implements InstrDao{

	protected InstrDaoImpl() {
		super(Instr.class);
	}

	@Override
	void handleFilterParameters(InstrFilter filter, CriteriaBuilder cb, CriteriaQuery<?> cq, Root<Instr> from) {
		
	}

}
