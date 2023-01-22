package com.markets.day3.exceptions;

public class TestDivision {
	public static void main(String args[]) {

		System.out.println("In main begin");

		Division obj = new Division();

		obj.division(10, 0);

		try {
			obj.justFun();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("END");

	}
}
