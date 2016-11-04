package com.bogdevich.tec2.instruction.datamodel;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
public class Instr extends AbstractModel{
	
@Column
private String name;

@ManyToOne(targetEntity = UserProfile.class, fetch = FetchType.LAZY)
private UserProfile ovner;

@ManyToOne(targetEntity = InstrType.class, fetch = FetchType.LAZY)
private InstrType instrtype;

@ManyToOne(targetEntity = Shop.class, fetch = FetchType.LAZY)
private Shop location;

@Column
private Date dateReview;

@Column
private Integer validity;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public UserProfile getOvner() {
	return ovner;
}

public void setOvner(UserProfile ovner) {
	this.ovner = ovner;
}

public InstrType getInstrtype() {
	return instrtype;
}

public void setInstrtype(InstrType instrtype) {
	this.instrtype = instrtype;
}

public Shop getLocation() {
	return location;
}

public void setLocation(Shop location) {
	this.location = location;
}

public Date getDateReview() {
	return dateReview;
}

public void setDateReview(Date dateReview) {
	this.dateReview = dateReview;
}

public Integer getValidity() {
	return validity;
}

public void setValidity(Integer validity) {
	this.validity = validity;
}


}
