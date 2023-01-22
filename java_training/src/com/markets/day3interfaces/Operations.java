package com.markets.day3interfaces;


@FunctionalInterface
public interface Operations {
	
	
	void addition(int n1, int n2);
	
	default int division(int n1, int n2) {
		
		return n1/n2;
	}
	
	static int multiplication(int n1,int n2) {
		return n1*n2;
	}
	

}
