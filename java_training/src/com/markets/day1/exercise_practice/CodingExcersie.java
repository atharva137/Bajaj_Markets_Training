package com.markets.day1.exercise_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class CodingExcersie {
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		ArrayList<Employee> list = new ArrayList<>();
        System.out.println("Enter number of employees you want to add");
        
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
        	Employee emp1 = new Employee(scanner.nextInt(),scanner.next(), scanner.nextInt(),scanner.next());
    		list.add(emp1);
        }
        
        Employee employee = new Employee();
        System.out.println(employee);
        
        
		System.out.println("total number of employee are " + employee.getSize());
		
	

		for (Employee emp : list) {

			if (emp.getSalary() > 50000) {
				System.out.println(emp.geteId() + " " + emp.getName() + " " + emp.getSalary() + " " + emp.getCompany());
			}
		}

	}

}
