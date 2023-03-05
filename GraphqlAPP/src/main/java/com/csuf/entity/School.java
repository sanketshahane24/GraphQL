package com.csuf.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class School {

	@Id
	@GeneratedValue
	public int schoolId;
	
	public String schoolName;
	
	@OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
	public List<Student> studentList;
}
