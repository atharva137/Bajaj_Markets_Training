package com.markets.day2.inheritance;

public class Child extends Parent {

	int c  ;
	
	public Child(int c) {
		super(100);
		this.c = c;
		System.out.println("In child Paramterised Constructor");
	}
	
	public Child() {
		System.out.println("Child Non Paramterised Constructor");
	}
	
	
	
	public void display() {
		System.out.println("Child display");
	}
	
	public void show() {
		System.out.println("In child show");
	}
	
	public void addition() {
		int sum = p+c;
		System.out.println(sum);
	}
}
