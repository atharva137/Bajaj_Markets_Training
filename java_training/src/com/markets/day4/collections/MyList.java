package com.markets.day4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MyList.myArrayList();
	}

	public static void myArrayList() {
//		List list = new ArrayList();
		
		List<String> list = new ArrayList<>();

		list.add("Ram");
		list.add("Sham");
		list.add("JAAM");
	
		
		System.out.println(list);
        System.out.println("Simple for loop");
        
        for(int i = 0; i  < list.size(); i++) {
        	String name = list.get(i);
        	System.out.println(name);
        }
        
        System.out.println("Advance for");
        
        for(String name : list) {
        	System.out.println(name);
        }
        
        
        System.out.println("Using iterator");
        
        Iterator<String> itr = list.iterator();
        
        while(itr.hasNext()) {
        	
        	String name = itr.next();
        	System.out.println(name);
        }
        
        System.out.println("ListIterator");
        
        ListIterator litr = list.listIterator();
        
        
        while(litr.hasNext()) {
        	String name = (String)litr.next();
        	System.out.println(name);
        	
        }
        
        System.out.println("In reverse order list iterator");
        
        
        while(litr.hasPrevious()) {
        	String name = (String)litr.previous();
        	System.out.println(name);		
        }
        
        
        
        
	}

}
