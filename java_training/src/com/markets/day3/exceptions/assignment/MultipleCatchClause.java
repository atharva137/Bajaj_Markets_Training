package com.markets.day3.exceptions.assignment;

public class MultipleCatchClause {

	public void check(int a, int b, String str) {

		try {

			str.length();
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("first catch clause completed");
		}

		try {
			int div = 10 / 0;
			System.out.println(div);
			System.out.println("Division");
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("second catch clause completed");
		}
	}

}
