package com.markets.day4.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.markets.bean.Employee;

public class MyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myHashMap1();
		myHashMapWithEmployee();

	}
     public static void myHashMap() {
    	 Map<Integer,String> map = new HashMap<Integer,String>();
    	 
    	 map.put(101, "pune");
    	 map.put(102, "chennai");
    	 map.put(103,"Mumbai");
    	 
    	 
    	 Set set = map.entrySet();
    	 
    	 Iterator itr = set.iterator();
    	 
    	 
    	 while(itr.hasNext()) {
    		 
    		 Map.Entry entry = (Map.Entry) itr.next();
    		 
    		 System.out.println(entry.getKey() + " " + entry.getValue());
    		}
     }
     
     public static void myHashMap1() {
    	 Map<Integer,String> map = new TreeMap<Integer,String>();
    	 
    	 map.put(101, "pune");
    	 map.put(102,"Chennai");
    	 map.put(10-3,"Mumbai");
    	 
    	 Set<Integer> set = map.keySet();
    	 
    	 for(Integer key : set) {
    		 String value = map.get(key);
    		 
    		 System.out.println(key + " " + value);
    		 
    	 }
     }
     
     public  static void myHashMapWithEmployee() {
    	 
    	 

 		Employee emp1 = new Employee(101, "Asha", 60);
 		Employee emp2 = new Employee(102, "Disha", 76);
 		Employee emp3 = new Employee(103, "Nisha", 65);

 		Employee emp4 = new Employee(101, "Asha", 60);
 		Employee emp5 = new Employee(102, "Disha", 76);
 		Employee emp6 = new Employee(103, "Nisha", 65);
 //
 		
 		Map<Employee, String> map = new HashMap<Employee,String>();
 		
 		
 		map.put(emp1, "Pune");
 		
 		map.put(emp2, "Chennai");
 		
 		map.put(emp3, 
 				"New Delhi");
 		
 		map.put(emp4, "Hydrabad");
 		
 
 		
 		
 		
 		System.out.println(map);
 		
 		
 		
 		
 		
     }
}
