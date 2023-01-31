package com.markets.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.markets.bean.Employee;

public class TestEmployeeApplicationFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac  = new ClassPathXmlApplicationContext("/com/markets/resources/my_bean_configuration.xml");
		
		Employee emp =  (Employee) ac.getBean("employee");
		
		System.out.println(emp + " " + "Application context");
      
	}

}
