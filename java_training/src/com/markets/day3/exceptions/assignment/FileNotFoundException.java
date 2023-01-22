package com.markets.day3.exceptions.assignment;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FileNotFoundException {

	public void checkFile() throws java.io.FileNotFoundException {
	
	 File file = new File("file.text");
	 FileInputStream stream = new FileInputStream(file);
	 
	}
}
