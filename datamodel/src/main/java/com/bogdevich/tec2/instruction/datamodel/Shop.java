package com.bogdevich.tec2.instruction.datamodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;


@Entity
public class Shop extends AbstractModel{
	
	@Column
	private String name;
	
	@ManyToOne(targetEntity = Company.class, fetch = FetchType.LAZY)
	private Company company;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	


}
