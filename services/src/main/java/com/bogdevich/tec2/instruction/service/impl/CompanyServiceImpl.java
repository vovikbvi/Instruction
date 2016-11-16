package com.bogdevich.tec2.instruction.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bogdevich.tec2.instruction.dataacess.CompanyDao;
import com.bogdevich.tec2.instruction.datamodel.Company;
import com.bogdevich.tec2.instruction.service.CompanyService;


@Service
public class CompanyServiceImpl implements CompanyService{
	
	@Inject
	CompanyDao companyDao;
	
	@Override
	public void insert (Company company){
		companyDao.insert(company);
	}

	@Override 
	public void update (Company company){
		companyDao.update(company);
	}
	
	@Override
	public void delete (Long id){
		companyDao.delete(id);
	}
	
	@Override 
	public Company get(Long id){
		return companyDao.get(id);
	}
	
	@Override 
	public List<Company> getAll(){
		return companyDao.getAll();
	}
	
}
