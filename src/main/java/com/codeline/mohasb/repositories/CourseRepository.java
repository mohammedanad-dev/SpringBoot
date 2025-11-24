package com.codeline.mohasb.repositories;

import com.codeline.mohasb.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository <Course, Integer>{
}
