package com.markets.day4.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.markets.bean.Employee;

public class MyListOfEmployeeSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void myListSorting() {
		
		Employee emp1 = new Employee(101, "Asha", 60);
		Employee emp2 = new Employee(102, "Disha", 76);
		Employee emp3 = new Employee(103, "Nisha", 65);

		Employee emp4 = new Employee(101, "Asha", 60);
		Employee emp5 = new Employee(102, "Disha", 76);
		Employee emp6 = new Employee(103, "Nisha", 65);
		
		List<Employee> list = new ArrayList<Employee> ();
		

		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);

		
		Collections.sort(list,new MySalaryComparator());
		Collections.sort(list,new MyNameComparator());
		

	}

}
