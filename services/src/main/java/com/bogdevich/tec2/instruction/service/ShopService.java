package com.bogdevich.tec2.instruction.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.bogdevich.tec2.instruction.dataacess.filter.ShopFilter;
import com.bogdevich.tec2.instruction.datamodel.Shop;

public interface ShopService {

	@Transactional
	void insert(Shop shop);

	@Transactional
	void update(Shop shop);

	@Transactional
	void delete(Long id);

	Shop get(Long id);

	List<Shop> getAll();

	List<Shop> getRecordSorted(ShopFilter filter);

	Shop getWithFetch(Long id);

}
