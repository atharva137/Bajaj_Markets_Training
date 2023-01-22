package com.markets.day3.exceptions.assignment;

import java.util.Scanner;

public class TestAgeValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		AgeValidator ageValidator = new AgeValidator();
		
		ageValidator.validateAge(age);
		
		sc.close();
		

	}

}
