package com.bogdevich.tec2.instruction.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bogdevich.tec2.instruction.dataacess.SetingsDao;
import com.bogdevich.tec2.instruction.datamodel.Setings;
import com.bogdevich.tec2.instruction.service.SetingsService;

@Service
public class SetingsServiceImpl implements SetingsService{

	@Inject
	public SetingsDao setingsDao;
	
	
	@Override
	public void insert (Setings setings){
		setingsDao.insert(setings);
	}
	
	@Override 
	public void update (Setings setings){
		setingsDao.update(setings);
	}
	
	@Override
	public void delete (Long id){
		setingsDao.delete(id);
	}
	
	@Override 
	public Setings get(Long id){
		return setingsDao.get(id);
	}

	@Override 
	public List<Setings> getAll(){
		return setingsDao.getAll();
	}

}
