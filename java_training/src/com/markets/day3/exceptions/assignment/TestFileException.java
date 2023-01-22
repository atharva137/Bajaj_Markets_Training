package com.markets.day3.exceptions.assignment;

public class TestFileException {
	
	public static void main(String [] args) {
		
		FileNotFoundException file = new FileNotFoundException();
		try {
			file.checkFile();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("File not Found Exception done");
		}
		
	}

}
