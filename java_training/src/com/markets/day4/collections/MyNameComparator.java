package com.markets.day4.collections;

import java.util.Comparator;

import com.markets.bean.Employee;



public class MyNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
	

}
