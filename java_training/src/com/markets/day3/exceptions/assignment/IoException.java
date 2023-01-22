package com.markets.day3.exceptions.assignment;

import java.io.IOException;
import java.util.Scanner;

public class IoException {
  
	public void checkException() throws IOException{
		throw new IOException("message");
	}
}
