package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Application {
	@Id
	private int applicationid;
	private String name;
	private String address;
	private String educational_details;
	private int experience;
	public Application() {
	}
	public Application(int applicationid, String name, String address, String educational_details, int experience) {
		this.applicationid = applicationid;
		this.name = name;
		this.address = address;
		this.educational_details = educational_details;
		this.experience = experience;
	}
	public int getApplicationid() {
		return applicationid;
	}
	public void setApplicationid(int applicationid) {
		this.applicationid = applicationid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEducational_details() {
		return educational_details;
	}
	public void setEducational_details(String educational_details) {
		this.educational_details = educational_details;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Application [applicationid=" + applicationid + ", name=" + name + ", address=" + address
				+ ", educational_details=" + educational_details + ", experience=" + experience
				+ ", getApplicationid()=" + getApplicationid() + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + ", getEducational_details()=" + getEducational_details() + ", getExperience()="
				+ getExperience() + "]";
	}
	

}
