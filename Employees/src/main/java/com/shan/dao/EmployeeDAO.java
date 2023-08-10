package com.shan.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shan.model.Employee;


public interface EmployeeDAO extends JpaRepository<Employee, Integer> {

}
