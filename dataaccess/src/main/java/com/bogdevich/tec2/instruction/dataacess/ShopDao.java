package com.bogdevich.tec2.instruction.dataacess;

import java.util.List;

import com.bogdevich.tec2.instruction.dataacess.filter.ShopFilter;
import com.bogdevich.tec2.instruction.datamodel.Shop;

public interface ShopDao extends AbstractDao<Shop, Long, ShopFilter>{

	List<Shop> getRecordSorted(ShopFilter filter);

}
