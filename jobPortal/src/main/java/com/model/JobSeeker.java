package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class JobSeeker {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int jobseekerid;
	private String username;
	private String name;
	private int phone;
	private String email;
	private int password;
	
	
	public JobSeeker() {
	}
	public JobSeeker(int id, String name, int phone, String email, int password,String username) {
		this.jobseekerid = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.username=username;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getId() {
		return jobseekerid;
	}
	public void setId(int jobseekerid) {
		this.jobseekerid = jobseekerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "JobSeeker [jobseekerid=" + jobseekerid + ", username=" + username + ", name=" + name + ", phone=" + phone + ", email="
				+ email + ", password=" + password + ", getUsername()=" + getUsername() + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getPhone()=" + getPhone() + ", getEmail()=" + getEmail()
				+ ", getPassword()=" + getPassword() + "]";
	}
	
	

}
