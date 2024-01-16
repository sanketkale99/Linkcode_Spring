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

import com.crud.model.Employee;
import com.crud.service.EmpService;

@RestController
public class EmployeeController {

	@Autowired
	private EmpService empService;
	
	@GetMapping("/emp")
	public List<Employee> getAllEmp()
	{
		return this.empService.getAllEmployees();
	}
	
	@GetMapping("/emp/{empId}")
	public Employee getEmp(@PathVariable("empId") int empId)
	{
		return this.empService.getEmployeeById(empId);
	}
	
	@PostMapping("/emp")
	public Employee addEmp(@RequestBody Employee employee)
	{
		return this.empService.addEmployee(employee);
	}
	
	@PutMapping("/emp/{Id}")
	public Employee updateEmp(@RequestBody Employee employee, @PathVariable("Id") int Id)
	{
		return this.empService.updateEmployeeById(employee, Id);
	}
	
	@DeleteMapping("/emp/{Id}")
	public void deleteEmp(@PathVariable("Id") int Id)
	{
		this.empService.deleteEmployee(Id);
	}
	
}
