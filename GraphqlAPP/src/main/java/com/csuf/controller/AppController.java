package com.csuf.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.csuf.entity.School;
import com.csuf.entity.Student;
import com.csuf.repo.SchoolRepo;
import com.csuf.repo.StudentRepo;

@Controller
public class AppController {

	
	@Autowired
	private SchoolRepo schoolRepo;
	
	@Autowired
	private StudentRepo studentRepo;
	
	@QueryMapping
	Iterable<School> school(){
		return schoolRepo.findAll();
	}
	
	@QueryMapping
	Optional<School> schoolId(@Argument int schoolId) {
		return schoolRepo.findById(schoolId);
	}
	
	@MutationMapping
	Student addStudent(@Argument int schoolId,@Argument String studentName) {
		
		System.out.println(studentName + " "+ schoolId);
		
		School sc = schoolRepo.findById(schoolId).orElseThrow(()-> new IllegalArgumentException("School not found"));
		Student s = new Student();
		s.studentName = studentName;
		s.school = sc;
		return studentRepo.save(s);
	}
	
	@MutationMapping
	public School addSchool(@Argument String schoolName) {
		School sc=new School();
		sc.schoolName = schoolName;
		return schoolRepo.save(sc);
	}

	
	
	
	
	
	
	
	
}
