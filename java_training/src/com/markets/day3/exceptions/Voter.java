package com.markets.day3.exceptions;

public class Voter {

	public void validateAge(int age) {
		try {
			if (age >= 18) {

			} else {
				throw new AgeInvalidException("Invalid Age Exception get Raised");
			}
		} catch (AgeInvalidException e) {

			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();

		}
	}

	public void fun() {
		// TODO Auto-generated method stub
		
		System.out.println("Fun");
		
	}

}
