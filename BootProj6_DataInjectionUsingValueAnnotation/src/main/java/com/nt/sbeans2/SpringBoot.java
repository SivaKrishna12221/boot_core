package com.nt.sbeans2;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component("boot")
@ConfigurationProperties(prefix="spring")
public class SpringBoot {
	private String batchStart;
	private Double coursePrice;
	private String courseDuration;
	private String blockName;
	
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getBatchStart() {
		return batchStart;
	}
	public void setBatchStart(String batchStart) {
		this.batchStart = batchStart;
	}
	public Double getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(Double coursePrice) {
		this.coursePrice = coursePrice;
	}
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	public String getBlockName() {
		return blockName;
	}
	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}
	private String faculty;
	@Override
	public String toString() {
		return "SpringBoot [faculty=" + faculty + ", batchStart=" + batchStart + ", coursePrice=" + coursePrice
				+ ", courseDuration=" + courseDuration + ", blockName=" + blockName + "]";
	}
	

}
