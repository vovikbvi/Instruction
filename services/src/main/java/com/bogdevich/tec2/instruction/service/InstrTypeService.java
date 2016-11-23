package com.bogdevich.tec2.instruction.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.bogdevich.tec2.instruction.datamodel.InstrType;

public interface InstrTypeService {

	@Transactional
	void insert(InstrType instrType);

	@Transactional
	void update(InstrType instrType);

	@Transactional
	void delete(Long id);

	InstrType get(Long id);

	List<InstrType> getAll();

}
