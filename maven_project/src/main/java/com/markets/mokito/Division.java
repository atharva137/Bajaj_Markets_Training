package com.markets.mokito;

public class Division {
	
	
	DivisionService service;
	
	
	public Division(DivisionService service2) {
		this.service = service2;
	}
	
	public Division() {
		// TODO Auto-generated constructor stub
	}

	public int division(int num1, int num2) {
		return service.division(num1, num2);
	};

}
