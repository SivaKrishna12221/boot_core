package com.nt.sbeans2;

import org.springframework.stereotype.Component;

@Component("stud")
//@ConfigurationProperties(prefix="stud")
public class StudentDetails 
{
	private String qualification;
	   private String email;
	   private Long phoneNumber;
	   private String nativePlace;
  
   public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(Long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getNativePlace() {
	return nativePlace;
}
public void setNativePlace(String nativePlace) {
	this.nativePlace = nativePlace;
}
private String studentName;
@Override
public String toString() {
	return "StudentDetails [studentName=" + studentName + ", qualification=" + qualification + ", email=" + email
			+ ", phoneNumber=" + phoneNumber + ", nativePlace=" + nativePlace + "]";
}

 
}
