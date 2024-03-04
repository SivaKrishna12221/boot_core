package com.nt.sbeans3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("book")
public class BookStall {
	@Value("${price.java}")
	private Float javaPrice;
		@Value("${price.advJava}")
	private Float advJavaPrice;
	@Value("${price.springBoot}")
	private Float springBootPrice;
	@Value("${price.microService}")
	private Float microService;
	@Value("${price.oracle}")
	private Float oracle;
	public Float getJavaPrice() {
		return javaPrice;
	}
	public Float getAdvJavaPrice() {
		return advJavaPrice;
	}
	public Float getSpringBootPrice() {
		return springBootPrice;
	}
	public Float getMicroService() {
		return microService;
	}
	public Float getOracle() {
		return oracle;
	}

	
}
