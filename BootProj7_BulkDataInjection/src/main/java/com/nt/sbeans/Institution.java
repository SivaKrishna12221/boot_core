package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("institute")
@ConfigurationProperties(prefix="org.nit")
@PropertySource("com/nt/properties/app.properties")
public class Institution
{
 @Value("${nit.name}")
 private String name;
 
 private String address;
 
 private Long pincode;
 
 private Long phNumber;
 
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

public Long getPincode() {
	return pincode;
}

public void setPincode(Long pincode) {
	this.pincode = pincode;
}

public Long getPhNumber() {
	return phNumber;
}

public void setPhNumber(Long phNumber) {
	this.phNumber = phNumber;
}

@Override
public String toString() {
	return "Institution [name=" + name + ", address=" + address + ", pincode=" + pincode + ", phNumber=" + phNumber
			+ "]";
}


 
 
}
