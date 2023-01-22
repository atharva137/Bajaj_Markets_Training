package com.markets.day2.inheritance;

public class TestParentChild {
	
	public static void main(String [] args) {
//		Child child = new Child(50);
//		
//		child.diplay();
//		child.show();
//		child.addition();
	
		Parent ref;
		ref = new Parent();
		ref.display();// parent
		//ref.show() error
		ref = new Child();
	 	//ref.show() error;
		ref.display();
		
		
		TestParentChild.demo(new Parent());
		
		TestParentChild.demo(new Child());
		
		
		
		
	}
	
	
	public static void demo (Parent obj) {
		
		obj.display();
	}

}
