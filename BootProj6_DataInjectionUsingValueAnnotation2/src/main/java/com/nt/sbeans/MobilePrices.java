package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

//@Component("mobilePrice")
@Data
public class MobilePrices {

	@Value("${price.oppo}")
	private Double oppo;
	@Value("${price.samsung}")
	private Double samsung;
	@Value("${price.realme}")
	private Double realme;
	@Value("${price.oneplus}")
	private Double oneplus;
	
}
