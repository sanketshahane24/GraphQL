package com.csuf.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue
	public int id;

	public String studentName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	public School school;
	
}
