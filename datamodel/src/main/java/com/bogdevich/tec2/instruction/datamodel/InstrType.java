package com.bogdevich.tec2.instruction.datamodel;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class InstrType extends AbstractModel{
	
	@Column
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
