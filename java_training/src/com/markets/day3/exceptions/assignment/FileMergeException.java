package com.markets.day3.exceptions.assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMergeException {

	public void mergeTwofilesAlternatively() throws FileNotFoundException,IOException {
		
		
			PrintWriter pw = new PrintWriter("file3.rtf");
			
			
			  BufferedReader br1 = new BufferedReader(new FileReader("file1.rtf"));
		      BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
		      
		      String line1= br1.readLine();
		      String line2= br2.readLine();
		      
		      
		      while(line1!=null||line2!=null) {
		    	  
		    	  if(line1!=null) {
		    		  pw.println(line1);
		    		  line1 = br1.readLine();
		    	  }
		    	  if(line2!=null) {
		    		  pw.println(line2);
		    		  line2 = br2.readLine();
		    	  }
		      }
		      
		      
		      pw.flush();
		      br1.close();
		      br2.close();
		      pw.close();
		      
		      System.out.println("File merged");
		      
		      
	}
}
