package com.markets.controller;

import org.springframework.stereotype.Controller;

import com.markets.beans.Employee;

@Controller

public interface EmployeeController {
	 void addEmployee(Employee employee);
}
