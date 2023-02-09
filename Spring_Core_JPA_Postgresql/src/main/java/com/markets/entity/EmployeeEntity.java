package com.markets.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employeetable")
public final class EmployeeEntity {
	
	


		@Id
		@Column(name="id")
		private int eId;
		@Column(name = "ename")
		private String name;
		@Column(name="salary")
		private int salary;
		@Column(name="dept")
		private int deptId;

		public int geteId() {
			return eId;
		}

		public void seteId(int eId) {
			this.eId = eId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		public EmployeeEntity(int eId, String name, int salary, int deptId) {
			super();
			this.eId = eId;
			this.name = name;
			this.salary = salary;
			this.deptId=deptId;
		}

		public EmployeeEntity() {
			// TODO Auto-generated constructor stub
		}

	}