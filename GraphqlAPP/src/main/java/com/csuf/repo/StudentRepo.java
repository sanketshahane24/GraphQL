package com.csuf.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.csuf.entity.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer>{

}
