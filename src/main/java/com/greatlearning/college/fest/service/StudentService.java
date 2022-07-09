package com.greatlearning.college.fest.service;

import java.util.List;

import com.greatlearning.college.fest.entity.Student;

public interface StudentService {
	public List<Student> findAll();

	public Student findById(long id);

	public void save(Student student);

	public void deleteById(long id);
}
