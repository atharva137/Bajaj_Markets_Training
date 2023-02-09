package com.markets.dao;

import org.springframework.stereotype.Repository;

import com.markets.beans.Employee;

@Repository
public interface Dao {
	
	public void addEMployee(Employee employee);

}
