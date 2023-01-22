package com.markets.day3.exceptions.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class TestItemList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      
		ArrayList<Item> items = new ArrayList<>();
		
		int n = sc.nextInt();
       
		while(n--!=0) {
			int itemid = sc.nextInt();
			String  itemName = sc.next();
			double priceItem = sc.nextDouble();
			items.add(new Item(itemid, itemName,priceItem));
			
		}
		
		CheckCart checkCart = new CheckCart();
		
		checkCart.checkCartDetails(items);
	}

}
