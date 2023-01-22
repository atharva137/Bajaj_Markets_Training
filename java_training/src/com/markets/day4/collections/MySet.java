package com.markets.day4.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MySet.myHashSet();
	}
	
	public static void myHashSet() {
//		Set<String> set = new HashSet<String>();
//		Set<String> set = new LinkedHashSet<String>();
		Set<String> set = new TreeSet<String>();
		set.add("Ram");
		set.add("sham");
		set.add("jam");
		System.out.println(set);
		
	}

}
