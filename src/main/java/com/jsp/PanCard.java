package com.jsp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PanCard {
	@Id
	private String name;
	private long adharno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAdharno() {
		return adharno;
	}
	public void setAdharno(long adharno) {
		this.adharno = adharno;
	}
	
}
