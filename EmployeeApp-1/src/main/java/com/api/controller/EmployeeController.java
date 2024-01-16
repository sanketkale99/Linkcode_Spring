package com.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.Employee;

@RestController
public class EmployeeController {
	
	private List<Employee> employees = new ArrayList<>();

    @GetMapping("/emp")
    public List<Employee> getAllEmployees() {
        return employees;
    }
 
    @PostMapping("/emp")
    public void addEmployee(@RequestBody Employee employee) {
        employees.add(employee);
         
        System.out.println("\n Employee added:");
        System.out.println("ID: " + employee.getEmpId());
        System.out.println("Name: " + employee.getEmpName());
        System.out.println("Salary: " + employee.getEmpSalary());
    }
    
    @PutMapping("/update/{id}")
    public void updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmployee) {
        
    	for (Employee employee : employees) { 
            
    		if (employee.getEmpId() == id) {
                employee.setEmpName(updatedEmployee.getEmpName());
                employee.setEmpSalary(updatedEmployee.getEmpSalary());                
                return; //Exit the method after updating
            }
        }
    } 
    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable int id) {
    	for (Employee employee : employees) {
            if (employee.getEmpId() == id) {
                employees.remove(employee);
                return; 
            }
        }
    }
}
