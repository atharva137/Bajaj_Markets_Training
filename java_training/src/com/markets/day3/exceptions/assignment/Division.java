package com.markets.day3.exceptions.assignment;

public class Division {
	
	public void divison(int a, int b) {
		
		try {
			
			int div = a/b;
			
			System.out.println("Division equals to " + div);
			
		}catch(ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();
		}finally {
			System.out.println("inside Finally block ");
		}
	}

}
