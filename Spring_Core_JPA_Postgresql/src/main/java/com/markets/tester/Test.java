package com.markets.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.markets.beans.Employee;
import com.markets.controller.EmployeeController;
import com.markets.resources.Config;

public class Test {
	
	public static void main(String [] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		
		EmployeeController controller = (EmployeeController) applicationContext.getBean("controllerImpl");
		
		Employee employee = new Employee(107,"ravi",1000,777);
		 controller.addEmployee(employee);
		
		 System.out.println(controller);
		
	}

}


