package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("mcp")
@ConfigurationProperties(prefix = "com.mobile")
public class MobileConfigurationPropertites {

	

	@Override
	public String toString() {
		return "Mobile [mname=" + name + ", mversion=" + version + ", mcost=" + cost + ", mram=" + ram
				+ ", minternalMemory=" + internalMemory + "]";
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getInternalMemory() {
		return internalMemory;
	}
	public void setInternalMemory(String internalMemory) {
		this.internalMemory = internalMemory;
	}
	private String version;
	private Double cost;
	private String ram;
	private String internalMemory;

}
