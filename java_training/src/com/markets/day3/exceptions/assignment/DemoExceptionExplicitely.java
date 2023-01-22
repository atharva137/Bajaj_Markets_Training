package com.markets.day3.exceptions.assignment;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DemoExceptionExplicitely {
	
	
	private String str;

	public void  checkException() {
		
		try {
			int a = 10, b = 0;
			str = null;
			int div = a/b;
			 File file = new File("file.text");
			 
			
			if(str == null) {
				str.length();
				throw new NullPointerException("String value");
			}else {
				System.out.println(str.length());
			}if(b==0) {
				throw new ArithmeticException("Denominator cant be zero");
			}else {
				System.out.println(div);
			}if (file==null) 
				throw new FileNotFoundException("Your Input is Empty");
			
		}catch(NullPointerException e) {
			System.out.println(e);
		}catch(ArithmeticException e) {
			System.out.println(e);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	

}
