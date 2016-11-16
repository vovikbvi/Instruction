package com.bogdevich.tec2.instruction.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bogdevich.tec2.instruction.dataacess.InstrDao;
import com.bogdevich.tec2.instruction.datamodel.Instr;
import com.bogdevich.tec2.instruction.service.InstrService;

@Service
public class InstrServiceImpl implements InstrService {

	@Inject
	public InstrDao instrDao;
	
	@Override
	public void insert (Instr instr){
		instrDao.insert(instr);
		
	}
	
	@Override 
	public void update (Instr instr){
		instrDao.update(instr);
	}
	
	@Override
	public void delete (Long id){
		instrDao.delete(id);
	}
	
	@Override 
	public Instr get(Long id){
		return instrDao.get(id);
	}

	@Override 
	public List<Instr> getAll(){
		return instrDao.getAll();
	}
	
}
