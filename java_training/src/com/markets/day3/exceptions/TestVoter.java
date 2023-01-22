package com.markets.day3.exceptions;

public class TestVoter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Voter voter = new Voter();
		voter.validateAge(10);
		
		System.out.println("Validation done");
		
		voter.fun();
	}

}
