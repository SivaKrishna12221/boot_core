package com.nt.model;

import lombok.Data;

@Data
public class Hostel {

	
	private String city;
	private String hostel_name;
	private int room_number;
	private int sharing;
	private double price;
	private String washing_machine;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHostel_name() {
		return hostel_name;
	}

	public void setHostel_name(String hostel_name) {
		this.hostel_name = hostel_name;
	}

	public int getRoom_number() {
		return room_number;
	}

	public void setRoom_number(int room_number) {
		this.room_number = room_number;
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

	public String getWashing_machine() {
		return washing_machine;
	}

	public void setWashing_machine(String washing_machine) {
		this.washing_machine = washing_machine;
	}

	@Override
	public String toString() {
		return "Hostel [city=" + city + ", hostel_name=" + hostel_name + ", room_number=" + room_number + ", sharing="
				+ sharing + ", price=" + price + ", washing_machine=" + washing_machine + "]";
	}

}
