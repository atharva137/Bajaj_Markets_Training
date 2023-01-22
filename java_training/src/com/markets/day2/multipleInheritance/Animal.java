package com.markets.day2.multipleInheritance;

public class Animal implements AnimalEat, AnimalTravel  {

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		
      System.out.println("Animal Travel");
		
	}

	public void eat() {
		// TODO Auto-generated method stub
		
		System.out.println("Animal Eat");
		
	}
	
	
	

}
