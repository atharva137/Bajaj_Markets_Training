package com.markets.day2.inheritance;

public class Parent {
	
	int p;
	
	public Parent() {
		System.out.println("Parent Constructor Non parameterised");
	}
	
	public Parent(int p) {
		this.p = p;
		System.out.println("Parent Constructor Parameterised");
	}
	
	public void display() {
		System.out.println("parent class display ");
	}

}
