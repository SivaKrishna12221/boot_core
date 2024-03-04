package com.nt.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("minfo")
@Data
@ConfigurationProperties("com.mobile")
public class MobilesInfo {
	
	
	private String[] names;
	
	private Set<Integer> prices;
	
	private List<String> colors;
	
	private Map<String,Object> ids;
	
	private Mobile mob;
}
