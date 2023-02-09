package com.markets.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usertable")
public final class UserEntity {

	public UserEntity() {
	}
	
	@Id
	@Column(name = "userid")
	private int userId;
	@Column(name = "name")
	private String name;
	@Column(name = "last_name")
	private String last_name;
	@Column(name = "address")
	private String address;
	@Column(name = "mobile")
	private String mobile;
	@Column(name = "email")
	private String email;
	@Column(name = "username")
	private String userName;
	@Column(name= "password")
	private String password;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserEntity(int userId, String name, String last_name, String address, String mobile,
			String email, String userName, String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.last_name = last_name;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.userName = userName;
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", name=" + name + ", last_name=" + last_name + ", address=" + address
				+ ", mobile=" + mobile + ", email=" + email + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
	

	
}
