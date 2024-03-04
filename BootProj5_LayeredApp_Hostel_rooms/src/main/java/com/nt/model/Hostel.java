package com.nt.model;

import lombok.Data;


public class Hostel 
{
   private String city;
   private String hostelName;
   private int roomNumber;
   private int sharing;
   private double price;
   private String washingMachine;
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getHostelName() {
	return hostelName;
}
public void setHostelName(String hostelName) {
	this.hostelName = hostelName;
}
public int getRoomNumber() {
	return roomNumber;
}
public void setRoomNumber(int roomNumber) {
	this.roomNumber = roomNumber;
}
public int getSharing() {
	return sharing;
}
public void setSharing(int sharing) {
	this.sharing = sharing;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getWashingMachine() {
	return washingMachine;
}
public void setWashingMachine(String washingMachine) {
	this.washingMachine = washingMachine;
}
@Override
public String toString() {
	return "Hostel [city=" + city + ", hostelName=" + hostelName + ", roomNumber=" + roomNumber + ", sharing=" + sharing
			+ ", price=" + price + ", washingMachine=" + washingMachine + "]";
}
   
}
