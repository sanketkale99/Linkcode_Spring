package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer>{

	public Employee findById(int Id);

}
