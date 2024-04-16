package com.example.form1.service;

import java.util.List;

import com.example.form1.model.Employee;


public interface EmployeeService {
	
	List<Employee> getEmployeeByName(String name);

	//List<EmployeeInfo> getAllEmployeesInfo();


}
