package com.markets.mokito;

public class Addition {

	
	AdditionService service;
	
	
	public Addition(AdditionService service2) {
		// TODO Auto-generated constructor stub
		this.service = service2;
	}

 
	
	public int addition(int num1, int num2) {
		System.out.println("Addition class");
		
		return service.addition(num1,num2);
	}
}
