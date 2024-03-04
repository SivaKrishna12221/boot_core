package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;

//@Component("m_info")
public class Mobile {
	@Value("${mobile.name}") // keyname
	private String name;

	@Override
	public String toString() {
		return "Mobile [mname=" + name + ", mversion=" + version + ", mcost=" + cost + ", mram=" + ram
				+ ", minternalMemory=" + internalMemory + "]";
	}

	@Value("${mobile.version}")
	private String version;
	@Value("${mobile.cost}")
	private Double cost;
	@Value("${mobile.ram}")
	private String ram;
	@Value("${mobile.internalMemory}")
	private String internalMemory;

}
