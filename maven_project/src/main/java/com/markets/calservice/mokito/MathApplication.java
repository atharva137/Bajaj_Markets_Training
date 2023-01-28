package com.markets.calservice.mokito;

public class MathApplication {

	CalService service;

	public MathApplication(CalService service) {
		this.service = service;
	}

	public MathApplication() {
		// TODO Auto-generated constructor stub
	}

	public double addition(double d, double e) {

		return service.add(d, e);

	}

	public double subtract(double num1, double num2) {

		return service.subtract(num1, num2);
	}

	public double multiply(double num1, double num2) {

		return service.multiply(num1, num2);
	}

	public double division(double num1, double num2) {

		return service.division(num1, num2);
	}
}
