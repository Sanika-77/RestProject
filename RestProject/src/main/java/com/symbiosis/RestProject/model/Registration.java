package com.symbiosis.RestProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Registration {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int regid;
private String name,address,city,gender,emailid,contact,passward;
public Registration() {
	super();
	// TODO Auto-generated constructor stub
}
public Registration(String name, String address, String city, String gender, String emailid, String contact,
		String passward) {
	super();
	this.name = name;
	this.address = address;
	this.city = city;
	this.gender = gender;
	this.emailid = emailid;
	this.contact = contact;
	this.passward = passward;
}
public int getRegid() {
	return regid;
}
public void setRegid(int regid) {
	this.regid = regid;
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
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getPassward() {
	return passward;
}
public void setPassward(String passward) {
	this.passward = passward;
}
@Override
public String toString() {
	return "Registration [regid=" + regid + ", name=" + name + ", address=" + address + ", city=" + city + ", gender="
			+ gender + ", emailid=" + emailid + ", contact=" + contact + ", passward=" + passward + "]";
}


}

