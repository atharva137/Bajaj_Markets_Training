package com.markets.day1.exercise_practice;
import java.util.Scanner;

public class BasicQuestions {

	static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String [] args) {
		BasicQuestions code = new BasicQuestions();
			
		code.maxOfThree();
		code.swapWithOutThirdVarible();
		code.swapWithThridVariable();
		code.isPalindrome();
		code.isPostiveOrNegative();
		cube();
		
		
	}

	public int maxOfThree() {
		
		System.out.println("Enter numbers for max of three numbers");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		if(num1>=num2 && num1>=num3) {
			return num1;
		}else if (num2>=num1 && num2>=num3) {
			return num2;
		}
		
		return num3;
	}
	
	
	public void swapWithThridVariable() {
		System.out.println("Enter numbers for swap with third varible");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int num3 = num1;
		num1 = num2;
		num2 = num3;
		
		System.out.println("swaping" + num1 + " " + num2);
	
	}
	
	
	
	public void swapWithOutThirdVarible() {
		
		System.out.println("Enter numbers for swap without usingg third varibale");
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
		
		System.out.println("swaping" + num1 + " " + num2);
	}
	
	
	public void isPostiveOrNegative() {
		
		System.out.println("Enter numbers for is postive or negative");
		int num = scanner.nextInt();
		
		if(num<0) {
			
			System.out.println("number is -ve");
		}else if (num > 0) {
			System.out.println("number is +ve");
		}else {
			
			System.out.println("number is zero");
		}
		
		
	}
	
	
	public boolean isPalindrome() {
		
		System.out.println("Enter number to check wheather its an palindrome or not ");
		String num = scanner.next();
		
		int i = 0, j = num.length()-1;
		
		while(i<=j) {
			
			if(num.charAt(i)!=num.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
		
	} 
	
	public static int cube() {
		
		System.out.println("Enter number to find the cube of the number");
		
		int num = scanner.nextInt();
		
		return num * num * num;
		
	}
	
	
}
