package com.example.form1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.form1.model.EmployeeInfo;

public interface EmployeeInfoRepository extends JpaRepository<EmployeeInfo,Long> {

}
