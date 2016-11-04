package com.bogdevich.tec2.instruction.dataacess.impl;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.bogdevich.tec2.instruction.dataacess.CompanyDao;
import com.bogdevich.tec2.instruction.dataacess.filter.CompanyFilter;
import com.bogdevich.tec2.instruction.datamodel.Company;

@Repository
public class CompanyDaoImpl extends AbstractDaoImpl<Company, Long, CompanyFilter> implements CompanyDao{

	protected CompanyDaoImpl() {
		super(Company.class);
	}

	@Override
	void handleFilterParameters(CompanyFilter filter, CriteriaBuilder cb, CriteriaQuery<?> cq, Root<Company> from) {
		
	}

}
