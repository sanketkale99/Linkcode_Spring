package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.Employee;
import com.crud.repository.EmpRepository;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	private EmpRepository empRepository;
	
	@Override
	public List<Employee> getAllEmployees() {
		return empRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int empId) {
		Employee employee=null;
		try {
			employee=empRepository.findById(empId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
		//return empRepository.getOne(empId); 
	}

	@Override
	public Employee addEmployee(Employee employee) {
		Employee eobj=empRepository.save(employee);
		return eobj;
	}

	@Override
	public Employee updateEmployeeById(Employee employee, int id) {
		employee.setEmpId(id);
		return empRepository.save(employee);
	}

	@Override
	public void deleteEmployee(int id) {
		empRepository.deleteById(id);
	}

	
	
	
}
