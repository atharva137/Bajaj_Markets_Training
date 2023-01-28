package com.markets.junit5;

import java.util.function.BooleanSupplier;

public class MathUtils {

	public int sum(int a, int b) {
		
		return a+b;
	}
	
	
	public boolean validAge(int age) {
		
		
		if(age>=18) {
			return true;
		}
		
		return false;
	}
	
	
	

	public double calCircleArea(double radius) {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}


	public int  div(int i, int j) {
		// TODO Auto-generated method stub
		return i/j;
	}


	public static boolean isOdd(int number) {
		// TODO Auto-generated method stub
		if(number%2!=0) {
			return true;
		}
		return false;
	}




	
}
