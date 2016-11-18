package com.bogdevich.tec2.instruction.dataacess;

import java.util.List;

import com.bogdevich.tec2.instruction.dataacess.filter.InstrFilter;
import com.bogdevich.tec2.instruction.datamodel.Instr;

public interface InstrDao extends AbstractDao<Instr, Long, InstrFilter>{

	List<Instr> getRecordSorted(InstrFilter filter);

}
