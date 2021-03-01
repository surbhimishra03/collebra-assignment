package com.collebra.services.app.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dependent")
public class DependentEnrollee {

	@Id
	private long id;
	private String name;
	private String birth_Day;

	@ManyToOne
	private Enrollee enrollee;

	public DependentEnrollee() {
		
	}
	
	public DependentEnrollee(long id, String name, String birth_Day) {
		this.name = name;
		this.id = id;
		this.birth_Day = birth_Day;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBirth_Day() {
		return birth_Day;
	}

	public void setBirth_Day(String birthdate) {
		this.birth_Day = birthdate;
	}

	public void setEnrollee(Enrollee enrollee) {this.enrollee = enrollee;}

}
