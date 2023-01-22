package com.markets.day4.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.markets.bean.Employee;

public class MySetEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MySetEmployee.myEmployeeSet();

	}

	public static void myEmployeeSet() {

		Employee emp1 = new Employee(101, "Asha", 60);
		Employee emp2 = new Employee(102, "Disha", 76);
		Employee emp3 = new Employee(103, "Nisha", 65);

		Employee emp4 = new Employee(101, "Asha", 60);
		Employee emp5 = new Employee(102, "Disha", 76);
		Employee emp6 = new Employee(103, "Nisha", 65);
//
//		Set<Employee> set = new HashSet<Employee>();
		
		Set<Employee> set = new TreeSet<Employee>();

		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		set.add(emp5);
		set.add(emp6);

//		System.out.println(set);

		for (Employee emp : set) {
			System.out.println(emp);
		}
	}

}
