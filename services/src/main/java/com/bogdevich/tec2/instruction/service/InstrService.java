package com.bogdevich.tec2.instruction.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.bogdevich.tec2.instruction.datamodel.Instr;

public interface InstrService {

	@Transactional
	void insert(Instr instr);

	@Transactional
	void update(Instr instr);

	@Transactional
	void delete(Long id);

	Instr get(Long id);
	
	List<Instr> getAll();
	
	
	

}
