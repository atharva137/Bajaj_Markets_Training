package com.markets.day3.exceptions.assignment;

import java.util.Scanner;

public class TestResorceTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			System.out.println(n);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
