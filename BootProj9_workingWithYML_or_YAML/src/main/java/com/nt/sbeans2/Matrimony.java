package com.nt.sbeans2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component("matrimony")
@ConfigurationProperties(prefix="matrimony.info")
public class Matrimony { 
	
 private String personName;
 private Integer age;
 private String address;
 private String email;
 private String dob;
 private String education;
 private String company;
 private Double sal;
 private String land;
 private String[] parents;
 private List<String> favouriteItems;
 private Map<String,String>  idDetails;
 public String getPersonName() {
	return personName;
}
public void setPersonName(String personName) {
	this.personName = personName;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getEducation() {
	return education;
}
public void setEducation(String education) {
	this.education = education;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public Double getSal() {
	return sal;
}
public void setSal(Double sal) {
	this.sal = sal;
}
public String getLand() {
	return land;
}
public void setLand(String land) {
	this.land = land;
}
public String[] getParents() {
	return parents;
}
public void setParents(String[] parents) {
	this.parents = parents;
}
public List<String> getFavouriteItems() {
	return favouriteItems;
}
public void setFavouriteItems(List<String> favouriteItems) {
	this.favouriteItems = favouriteItems;
}
public Map<String, String> getIdDetails() {
	return idDetails;
}
public void setIdDetails(Map<String, String> idDetails) {
	this.idDetails = idDetails;
}

 @Override
public String toString() {
	return "Matrimony [personName=" + personName + ", age=" + age + ", address=" + address + ", email=" + email
			+ ", dob=" + dob + ", education=" + education + ", company=" + company + ", sal=" + sal + ", land=" + land
			+ ", parents=" + Arrays.toString(parents) + ", favouriteItems=" + favouriteItems + ", idDetails="
			+ idDetails + "]";
}

 
}
