package com.greatlearning.college.fest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.college.fest.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
