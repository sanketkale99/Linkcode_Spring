package com.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.Employee;

@RestController
public class EmployeeController {

	List<Employee> emplist=new ArrayList<>();
	
	@GetMapping("/empapp")
	public List<Employee> getEmployee()
	{
		return emplist;
	}
	   
	@PostMapping("/empapp")
	public void AddEmployee(@RequestBody Employee employee) {
		emplist.add(employee);
		
		int id=employee.getEmpId();
		String ename=employee.getEmpName();
		double sal=employee.getEmpSalary();
		
		System.out.println("Employee id: "+id+"\nEmployee name: "
				+ ""+ename+"\nEmployee Salary: "+sal);
	}
	
	
	
	 
}
