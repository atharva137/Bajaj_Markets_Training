package com.markets.day2.inheritence.assignment;

public class Square extends Shape{
	
	private int side;
	
	
	public Square(int
			
			side) {
		super("Square");
		this.side = side;
	}
	
	public double calculateArea(int s){
		return side*side;
		
	}
	

}
