package com.markets.services;

import com.markets.beans.Employee;
import com.markets.dao.Dao;

import java.lang.annotation.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("serviceimpl")
public class ServiceImpl implements ServiceEmployee {

	@Autowired
	private Dao dao;

	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("Service is running");
		dao.addEMployee(employee);

	}

	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	public String value() {
		// TODO Auto-generated method stub
		return null;
	}

}
