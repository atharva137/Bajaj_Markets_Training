package com.markets.day3.exceptions.assignment;

import java.util.ArrayList;

public class CheckCart {
	
	
	public void checkCartDetails(ArrayList<Item> list) {
		
		
		try {
			
			if(!list.isEmpty()) {
				System.out.println("Display Cart " + list);
			}else {
				
				throw new CartEmptyException("Your Cart Is Empty");
			}
		}catch(CartEmptyException e ) {
			System.out.println(e);
			e.printStackTrace();
		}
		
	}

}
