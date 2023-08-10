package com.shan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shan.dao.EmployeeDAO;
import com.shan.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDAO empdao;
	
	
	public List<Employee> getalldata(){
		List<Employee> employees =  empdao.findAll();
		return employees;
	}

}
