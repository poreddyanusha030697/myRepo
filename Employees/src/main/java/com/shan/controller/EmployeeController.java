package com.shan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shan.model.Employee;
import com.shan.service.EmployeeService;

@RestController
@RequestMapping("/controller")
public class EmployeeController {

	@Autowired
	EmployeeService empservice;

	@GetMapping("/alldata")
	public List<Employee> getdetails() {
		return empservice.getalldata();
		
	}

}
