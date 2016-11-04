package com.bogdevich.tec2.instruction.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.bogdevich.tec2.instruction.datamodel.Company;

public interface CompanyService {

	@Transactional
	void insert(Company company);

	@Transactional
	void update(Company company);

	@Transactional
	void delete(Long id);

	Company get(Long id);

	List<Company> getAll();

}
