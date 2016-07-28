package com.gan.hbdemo.beans;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "USER_INFO", uniqueConstraints = {
		@UniqueConstraint(columnNames = "USER_ID")})
public class UserInfo {

	private int id;
	private String name;
	private Date joiningDate;
	
	@Id
	@GenericGenerator(name = "increment", strategy ="increment")
	@GeneratedValue(generator="increment")
	@Column(name="USER_ID", unique = true, nullable = false, length = 10)
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "USER_NAME", nullable = false, length = 20)
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "JOIN_DATE", nullable = false)
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	
	
}
