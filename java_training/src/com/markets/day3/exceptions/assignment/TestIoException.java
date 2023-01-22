package com.markets.day3.exceptions.assignment;

import java.io.IOException;

public class TestIoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IoException io = new IoException();
		
		try {
			io.checkException();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
