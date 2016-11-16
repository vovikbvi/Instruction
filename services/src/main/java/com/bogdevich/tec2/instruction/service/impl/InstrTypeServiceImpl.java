package com.bogdevich.tec2.instruction.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bogdevich.tec2.instruction.dataacess.InstrTypeDao;
import com.bogdevich.tec2.instruction.datamodel.InstrType;
import com.bogdevich.tec2.instruction.service.InstrTypeService;

@Service
public class InstrTypeServiceImpl implements InstrTypeService{

	@Inject
	public InstrTypeDao instrTypeDao;
	
	@Override
	public void insert (InstrType instrType){
		instrTypeDao.insert(instrType);
		
	}
	
	@Override 
	public void update (InstrType instrType){
		instrTypeDao.update(instrType);
	}
	
	@Override
	public void delete (Long id){
		instrTypeDao.delete(id);
	}
	
	@Override 
	public InstrType get(Long id){
		return instrTypeDao.get(id);
	}

	@Override 
	public List<InstrType> getAll(){
		return instrTypeDao.getAll();
	}

}
