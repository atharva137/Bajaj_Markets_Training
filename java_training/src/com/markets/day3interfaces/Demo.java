package com.markets.day3interfaces;

public class Demo implements Operations {

	@Override
	public void addition(int n1, int n2) {
		// TODO Auto-generated method stub
		int sum = n1+n2;
		System.out.println(sum);
	}
	
	public  int division(int n1, int n2) {
		
		return n1/n2;
	}
      
	static int multiplication(int n1,int n2) {
		return n1*n2;
	}
	

}


