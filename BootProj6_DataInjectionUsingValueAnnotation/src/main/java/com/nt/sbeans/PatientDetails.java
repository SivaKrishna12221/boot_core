package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("patientDetails")
public class PatientDetails {
	@Value("${patient.id}")
	private Integer patientId;
	@Value("${patient.name}")
	private String name;
	@Value("${patient.mobileNumber}")
	private Long mobileNumber;
	// @Value("#{${price.x_ray} +${price.ct_scan}}")
	// @Value("#{hspdetails.x_rayPrice +hspdetails.ct_scanPrice}")
	@Value("#{hspdetails.mri_scanPrice + hspdetails.ecg_scanPrice}")
	private Double billAmount;

	public Integer getPatientId() {
		return patientId;
	}

	@Override
	public String toString() {
		return "PatientDetails [patientId=" + patientId + ", name=" + name + ", mobileNumber=" + mobileNumber
				+ ", billAmount=" + billAmount + "]";
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(Double billAmount) {
		this.billAmount = billAmount;
	}

}
