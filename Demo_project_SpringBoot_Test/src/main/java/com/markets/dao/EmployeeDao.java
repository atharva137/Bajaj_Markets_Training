package com.markets.dao;



import org.springframework.data.jpa.repository.JpaRepository;



import com.markets.entity.EmployeeEntity;

public interface EmployeeDao extends JpaRepository<EmployeeEntity,Integer> {

}
