package com.markets.day3.exceptions.assignment;

import java.util.Scanner;

public class TestDivideByZeroException {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int  a = sc.nextInt();
		int b = sc.nextInt();
		
		Division division = new Division();
		
		division.divison(a, b);
		
	}

}
