package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Job {
	@Id
	private int id;
	private String description;
	private String title;
	private String location;
	private int salary;
	private String type;
	
	
	
	
	public Job() {
	}
	public Job(int id,String title, String location, int salary,String type, String description) {
		this.id=id;
		this.title = title;
		this.location = location;
		this.salary = salary;
		this.type=type;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Job [id="+id+",title=" + title + ", location=" + location + ", salary=" + salary
				+ ",type="+type+", description=" + description + ",getId()="+getId()+" getTitle()=" + getTitle()
				+ ", getLocation()=" + getLocation() + ", getSalary()=" + getSalary() + ",getType()="+getType()+", getDescription()="
				+ getDescription() + "]";
	}
	

}
