package com.markets.day2.inheritence.assignment;

public class Rectangle  extends Shape{
	
	private double length;
	private double breath;

	public Rectangle(int length, int breath) {
		super("Rectangle");
		// TODO Auto-generated constructor stub
		this.length = length;
		this.breath = breath;
	}
	
	public double calculateArea(int l, int b) {
		return breath*length;
		
	}

}
