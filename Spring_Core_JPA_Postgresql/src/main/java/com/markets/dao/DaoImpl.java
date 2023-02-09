package com.markets.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.markets.beans.Employee;
import com.markets.entity.EmployeeEntity;

@Repository
public class DaoImpl implements Dao{

	public void addEMployee(Employee employee) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit2");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		System.out.println("In controller working on adding employee");
		
		
		entityManager.getTransaction().begin();
		
		EmployeeEntity entity = new EmployeeEntity();
		
		entity.seteId(employee.geteId());
		entity.setName(employee.getName());
	
		entity.setSalary(employee.getSalary());
		
		entityManager.persist(entity);
		
		
		entityManager.getTransaction().commit();
		
		System.out.println("genrated employee Id" + entity.geteId() + " " + entity.getName());
		
	
	}

}
