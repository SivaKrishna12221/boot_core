package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component("hspdetails")
@Data
public class HospitalDetails 
{
	
	@Value("${price.x_ray}")
	 private double x_rayPrice;
	 @Value("${price.ct_scan}")
	private double ct_scanPrice;
	 @Value("${price.mri_scan}")
	 private double mri_scanPrice;
	 @Value("${price.ecg_scan}")
	 private double ecg_scanPrice;
	public double getX_rayPrice() {
		return x_rayPrice;
	}
	public double getCt_scanPrice() {
		return ct_scanPrice;
	}
	public double getMri_scanPrice() {
		return mri_scanPrice;
	}
	public double getEcg_scanPrice() {
		return ecg_scanPrice;
	}

 
 
 

} 
