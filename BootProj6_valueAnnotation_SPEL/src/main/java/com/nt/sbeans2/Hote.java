package com.nt.sbeans2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("hote")
@Data
public class Hote {
	@Value("siva")
	private String custName;
	@Value("#{price.idly+price.dosha+price.punugu+price.jilebi}")
	private Double bill;

	public String toString() {

		return "Customer Name ::" + custName + "\n" + "Total Bill:: " + bill;
	}
}
