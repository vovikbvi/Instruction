package com.bogdevich.tec2.instruction.dataacess;

import java.util.List;



public interface AbstractDao<T, ID, F> {

	List<T> getAll();

	T get(ID id);

	T insert(T entity);

	T update(T entity);

	void delete(ID id);

	Long count(F filter);
	



}