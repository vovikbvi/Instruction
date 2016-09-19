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

@ManyToOne(targetEntity = Instrtype.class, fetch = FetchType.LAZY)
private Instrtype instrtype;

@ManyToOne(targetEntity = Shop.class, fetch = FetchType.LAZY)
private Shop location;

@Column
private Date dateReview;

@Column
private Integer validity;

}
