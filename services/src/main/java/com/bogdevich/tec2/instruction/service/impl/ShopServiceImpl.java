package com.bogdevich.tec2.instruction.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bogdevich.tec2.instruction.dataacess.ShopDao;
import com.bogdevich.tec2.instruction.datamodel.Shop;
import com.bogdevich.tec2.instruction.service.ShopService;

@Service
public class ShopServiceImpl implements ShopService{
	
	@Inject
	public ShopDao shopDao;
	
	
	@Override
	public void insert (Shop shop){
		shopDao.insert(shop);
	}
	
	@Override 
	public void update (Shop shop){
		shopDao.update(shop);
	}
	
	@Override
	public void delete (Long id){
		shopDao.delete(id);
	}
	
	@Override 
	public Shop get(Long id){
		return shopDao.get(id);
	}

	@Override 
	public List<Shop> getAll(){
		return shopDao.getAll();
	}


}
