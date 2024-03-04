package com.nt.sbeans2;

import org.springframework.stereotype.Component;

@Component("nit")
public class NareshIT {
  
   public String getInstituteName() {
	return instituteName;
}
public void setInstituteName(String instituteName) {
	this.instituteName = instituteName;
}
public String getOwnerName() {
	return ownerName;
}
public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public Long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(Long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
private String instituteName;
@Override
public String toString() {
	return "NareshIT [instituteName=" + instituteName + ", ownerName=" + ownerName + ", address=" + address + ", code="
			+ code + ", phoneNumber=" + phoneNumber + "]";
}
private String ownerName;
   private String address;
   private int code;
   private Long phoneNumber;
 
}

