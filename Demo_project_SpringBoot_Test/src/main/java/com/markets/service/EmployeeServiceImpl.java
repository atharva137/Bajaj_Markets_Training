package com.markets.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markets.dao.EmployeeDao;
import com.markets.entity.EmployeeEntity;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	@Override
	public void addEmployee( EmployeeEntity employee) {
		// TODO Auto-generated method stub
	      	employeeDao.save(employee);


		
	}

	public List<EmployeeEntity> displayAll() {
		// TODO Auto-generated method stub
		List<EmployeeEntity> list = employeeDao.findAll();

		return list;
	}
	
	
	public Optional<EmployeeEntity> getEmployee(Integer id){

		return employeeDao.findById(id);
	}

	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		employeeDao.deleteById(id);
	}
	
	
	
	
	
	

}
