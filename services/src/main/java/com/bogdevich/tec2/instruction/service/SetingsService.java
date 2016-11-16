package com.bogdevich.tec2.instruction.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.bogdevich.tec2.instruction.datamodel.Setings;

public interface SetingsService {

	@Transactional
	void insert(Setings setings);

	@Transactional
	void update(Setings setings);

	@Transactional
	void delete(Long id);

	Setings get(Long id);

	List<Setings> getAll();

}
