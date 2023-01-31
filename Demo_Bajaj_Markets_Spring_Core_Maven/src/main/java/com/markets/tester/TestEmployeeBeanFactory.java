package com.markets.tester;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.markets.bean.Employee;

public class TestEmployeeBeanFactory {
	
	public static void main(String[] args) {
		
		 BeanFactory factory = new ClassPathXmlApplicationContext("/com/markets/resources/my_bean_configuration.xml");
		    Employee employee = (Employee) factory.getBean("employee");
		    
		    System.out.println(employee + " " + "bean factory runnin" ) ;
	}

}
