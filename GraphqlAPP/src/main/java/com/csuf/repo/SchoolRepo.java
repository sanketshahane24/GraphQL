package com.csuf.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.csuf.entity.School;

@Repository
public interface SchoolRepo extends CrudRepository<School, Integer>{

}
