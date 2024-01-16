package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.Student;
import com.crud.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/student")
	public List<Student> getAllStudent(){
		return studentService.getAllStudent(); 
	}
	
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable int id)
	{
		return studentService.getStudentById(id);
	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student)
	{
		return studentService.addStudent(student);
	}
	
	@PutMapping("/student/{id}")
	public Student updateStudent(@RequestBody Student student, @PathVariable int id)
	{
		return studentService.updateStudentById(student, id);
	}
	
	@DeleteMapping("/student/{id}")
	public void deleteStudentById(@PathVariable int id)
	{
		studentService.deleteStudent(id);
	}
	
}

