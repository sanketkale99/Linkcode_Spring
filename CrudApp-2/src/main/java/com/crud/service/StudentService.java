package com.crud.service;

import java.util.List;

import com.crud.model.Student;

public interface StudentService {

	public List<Student> getAllStudent();
	
	public Student getStudentById(int id);
	
	public Student addStudent(Student student);
	
	public Student updateStudentById(Student student, int id);
	
	public void deleteStudent(int id);
}
