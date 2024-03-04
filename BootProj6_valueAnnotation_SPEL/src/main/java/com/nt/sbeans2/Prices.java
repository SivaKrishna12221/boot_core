package com.nt.sbeans2;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("price")
@ConfigurationProperties(prefix="hotel.price")
@Data
public class Prices {

	@Value("100")
	private Double idly;
	private Double dosha;
	private Double punugu;
	private Double jilebi;
	private List<String> sweets;
	
	
}
