package com.spring.springdatarest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.spring.springdatarest.domain.Courses;

@RestResource(rel = "courses", path="courses")
public interface CoursesRepository extends CrudRepository<Courses, Integer>{

}
