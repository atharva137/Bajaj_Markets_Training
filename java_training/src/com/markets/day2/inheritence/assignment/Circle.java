package com.markets.day2.inheritence.assignment;

public class Circle extends Shape {
 
	private int radius;
 
 public Circle(int radius) {
	 super("Circle");
	 this.radius = radius;
 }
 
 public double calculateArea(int r) {
	 
	 return radius*radius;
 }
}
