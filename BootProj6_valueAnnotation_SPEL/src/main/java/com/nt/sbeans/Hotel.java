package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hotel")
public class Hotel {
	@Value("${hotel.id}")
	private Integer hotelId;
	@Value("${hotel.name}")
	private String hotelName;
	@Value("${hotel.address}")
	private String address;
	@Value("${hotel.mobileNumber}")
	private String mobileNO;
	@Value("${customer.name}")
	private String customerName;
	@Value("#{price1.dosha + price1.mysoorBajji}")
	private Float BillAmount;
	@Value("${os.name}")
	private String Os;
	@Value("${user.name}")
	private String windowUser;

	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", address=" + address + ", mobileNO="
				+ mobileNO + ", customerName=" + customerName + ", BillAmount=" + BillAmount + ", Os=" + Os
				+ ", windowUser=" + windowUser + "]";
	}

}
