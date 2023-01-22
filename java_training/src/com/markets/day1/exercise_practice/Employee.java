package com.markets.day1.exercise_practice;

public class Employee {
	
	private int eId ;
	private String name;
	private double salary;
	private String company;
	public static int count = 0;
	
	
	public Employee(int eId, String name, double salary, String company) {
		super();
		this.eId = eId;
		this.name = name;
		this.salary = salary;
		this.company = company;
		
		count++;
	}
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

   
	public int getSize() {
		
		return count;
	}
	
	public double getSalary() {
		
		return this.salary;
	}


	public int geteId() {
		return eId;
	}


	public String getName() {
		return name;
	}


	public String getCompany() {
		return company;
	}
	
	public String toString() {
		
		return eId + " " + name  + " "  + salary;
	}
	

}
