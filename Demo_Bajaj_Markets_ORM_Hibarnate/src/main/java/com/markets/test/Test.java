package com.markets.test;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.markets.entity.UserEntity;
public class Test {

	public static void main(String [] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
		
		EntityManager entityManger = entityManagerFactory.createEntityManager();
		
	
		UserEntity us =  entityManger.find(UserEntity.class,103);
		
		System.out.println(us);
		

		
	}
}
