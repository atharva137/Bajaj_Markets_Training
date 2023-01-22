package com.markets.day2.inheritence.assignment;

import java.util.Scanner;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter c for area of the circle");
		System.out.println("Enter r for area of the rectangle");
		System.out.println("Enter s for area of the sqaure");
	     
		String ch = scanner.next();
		
		
		switch(ch){
			
			case "c" : System.out.println("Enter radius of the circle"); 
			           int r = scanner.nextInt();
			           Circle circle = new Circle(r);
			           double area = circle.calculateArea(r);
			           System.out.println(circle.shapeName + " " + area);
			           
			           

			case "r" : System.out.println("Enter Length of the Rectangle"); 
			           int l = scanner.nextInt();
			           System.out.println("Enter breath of the Rectangle"); 
			           int b = scanner.nextInt();
			           Rectangle rect = new Rectangle(l,b);
			           double areaOfRectangle = rect.calculateArea(l,b);
			           System.out.println(rect.shapeName + " " + areaOfRectangle);
			           
			           
			 
			case "s" : System.out.println("Enter Length of the Rectangle"); 
	           int s = scanner.nextInt();
	           Square square = new Square(s);
	           double areaOfSquare = square.calculateArea(s);
	           System.out.println(square.shapeName + " " + areaOfSquare);
			           
			           
			           
		}
		
		

	}

}
