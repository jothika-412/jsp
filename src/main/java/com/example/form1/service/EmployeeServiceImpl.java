package com.example.form1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.form1.model.Employee;
//import com.example.form1.model.EmployeeInfo;
//import com.example.form1.model.Employee;
import com.example.form1.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return employeeRepository.findByName(name);
	}



	
}
