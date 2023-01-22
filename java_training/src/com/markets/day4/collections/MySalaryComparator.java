package com.markets.day4.collections;

import java.util.Comparator;

import com.markets.bean.Employee;

public class MySalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		
		if(emp1.getSalary()>emp2.getSalary()) {
			return 1;
		}else  if (emp1.getSalary()<emp2.getSalary()) {
			return -1;
		}else if(emp1.getSalary()==emp2.getSalary()) {
			return 0;
		}
		return 0;
	
	}
	
	

}
