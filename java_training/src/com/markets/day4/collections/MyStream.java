package com.markets.day4.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.markets.bean.Employee;

public class MyStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Employee emp1 = new Employee(101, "Asha", 60);
		Employee emp2 = new Employee(102, "Disha", 76);
		Employee emp3 = new Employee(103, "Nisha", 65);

		Employee emp4 = new Employee(101, "Asha", 60);
		Employee emp5 = new Employee(102, "Disha", 76);
		Employee emp6 = new Employee(103, "Nisha", 65);

//		Set<Employee> set = new HashSet<Employee>();
		
		List<Employee> list = new ArrayList<Employee>();

		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		
		List<Double> salary = list.stream().map(emp->emp.getSalary()).collect(Collectors.toList());
		
		System.out.println(salary);
		
		
		List<Integer> num = Arrays.asList(2,3,4,5,6);
		
		List<Integer> sq  = num.stream().map(x->x*x).collect((Collectors.toList()));
		
		List<Double> highSalary = list.stream().filter(emp->emp.getSalary()>60).map(emp->emp.getSalary()).
				collect(Collectors.toList());
		
		
		System.out.println(sq);
		
		
		
		
 		
		

	}

}
