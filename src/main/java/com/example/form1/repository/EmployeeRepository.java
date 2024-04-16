package com.example.form1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.form1.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
	List<Employee> findByName(String name);


}
