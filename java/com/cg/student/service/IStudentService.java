package com.cg.student.service;

import java.util.List;

import com.cg.student.entities.Student;

public interface IStudentService {

	List<Student> findByName(String name);

	List<Student> findByFirstNameAndLastName(String fname, String lname);

	Student findById(Integer id);

	List<Student> findAll();

	Student register(Student student);

}
