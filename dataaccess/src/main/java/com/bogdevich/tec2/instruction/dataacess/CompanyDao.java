package com.bogdevich.tec2.instruction.dataacess;

import com.bogdevich.tec2.instruction.dataacess.filter.CompanyFilter;
import com.bogdevich.tec2.instruction.datamodel.Company;

public interface CompanyDao extends AbstractDao<Company, Long, CompanyFilter>{

}
