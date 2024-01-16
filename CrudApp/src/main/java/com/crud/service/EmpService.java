package com.crud.service;

import java.util.List;

import com.crud.model.Employee;

public interface EmpService {

	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeById(int Id);
	
	public Employee addEmployee(Employee employee);

	public Employee updateEmployeeById(Employee employee, int id);
	
	public void deleteEmployee(int id);
}
