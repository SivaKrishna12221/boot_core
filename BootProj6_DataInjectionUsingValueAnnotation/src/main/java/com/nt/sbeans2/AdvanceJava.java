package com.nt.sbeans2;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("advanceJava")
@ConfigurationProperties(prefix = "advjava")
public class AdvanceJava {
	private String faculty;
	private String batchStart;
	private Float coursePrice;
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

	public Float getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(Float coursePrice) {
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
}
