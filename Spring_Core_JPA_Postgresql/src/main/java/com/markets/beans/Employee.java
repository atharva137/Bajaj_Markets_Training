package com.markets.beans;


public class Employee {


	private int eId;

	private String name;
	
	private int salary;

	private int deptId;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(int eId, String name, int salary, int deptId) {
		super();
		this.eId = eId;
		this.name = name;
		this.salary = salary;
		this.deptId=deptId;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

}