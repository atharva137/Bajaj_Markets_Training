package com.markets.services;

import org.springframework.stereotype.Service;

import com.markets.beans.Employee;

@Service
public interface ServiceEmployee {
  
	void addEmployee(Employee employee);
}
