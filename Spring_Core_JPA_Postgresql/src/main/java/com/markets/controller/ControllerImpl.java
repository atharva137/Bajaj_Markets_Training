package com.markets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.markets.beans.Employee;

import com.markets.services.ServiceEmployee;

@Controller
class ControllerImpl implements EmployeeController {

	@Autowired
	private ServiceEmployee service;
  

	public void addEmployee(Employee employee) {
		System.out.println("hello controller");
		service.addEmployee(employee);
	}
	
	

}