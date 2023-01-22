package com.markets.day3.exceptions;

public class Division {

	public void division(int num1, int num2) {
		System.out.println("In Divsion");
		
		
		try {
			String str = null;
			
			str.length();
			
		}catch(Exception e){
			
			System.out.println(e);
		}

		try {

			int div = num1 / num2;

			System.out.println("Division = " + div);

		} catch (NullPointerException e) {

			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Division don");
		}

	}

	public void justFun() throws InterruptedException, ClassNotFoundException {

		Class.forName("");
		Thread.sleep(1000);

		System.out.println("In just for fun");

	}

}
