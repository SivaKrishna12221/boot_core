package com.nt.sbeans2;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("info")
@ConfigurationProperties(prefix = "stud.info")
public class StudentInfo {

	private StudentDetails sdetails;

	public StudentDetails getSdetails() {
		return sdetails;
	}

	public void setSdetails(StudentDetails sdetails) {
		this.sdetails = sdetails;
	}

	public NareshIT getInstitute() {
		return institute;
	}

	public void setInstitute(NareshIT institute) {
		this.institute = institute;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	private NareshIT institute;

	private String[] course;
   
	@Value("#{java.coursePrice+advanceJava.coursePrice}")
	private float fees;
   
	 @Override
		public String toString() {
			return "StudentInfo [sdetails=" + sdetails + ", institute=" + institute + ", course=" + Arrays.toString(course)
					+ ", fees=" + fees + "]";
		}
}
