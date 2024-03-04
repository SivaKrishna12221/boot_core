package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("mc")
public class MobileClass {

	@Override
	public String toString() {
		return "MobileClass [calOppoSamsung=" + calOppoSamsung + ", calRealmeOneplus=" + calRealmeOneplus + "]";
	}
	@Value("#{mobilePrice.oppo+mobilePrice.samsung}")
	private Double calOppoSamsung;
	@Value("#{mobilePrice.realme<mobilePrice.oneplus}")
	private Boolean calRealmeOneplus;
}
