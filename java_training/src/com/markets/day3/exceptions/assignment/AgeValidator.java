package com.markets.day3.exceptions.assignment;

public class AgeValidator {
	
	
	public void validateAge(int age) {
		
		try {
			
			if(age<=19) {
				System.out.println("Valid Age");
			}
		else {
			   throw new InvalidAgeException("Invalid Age");
			}
		}catch(InvalidAgeException e) {
			System.out.println(e);
		}
		
	}

}
