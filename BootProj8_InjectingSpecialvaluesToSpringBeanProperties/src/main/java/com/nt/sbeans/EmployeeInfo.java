package com.nt.sbeans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("empInfo")
@ConfigurationProperties(prefix = "emp.info")
public class EmployeeInfo {
	private Integer empno;
	private String ename;
	private String[] favColors;
	private List<String> nickNames;
	private Set<String> phNumbers;
	private Map<String, String> idNumbers;
	private CompanyInfo companyInfo;

	@Override
	public String toString() {
		return "EmployeeInfo [empno=" + empno + ", ename=" + ename + ", favColors=" + Arrays.toString(favColors)
				+ ", nickNames=" + nickNames + ", phNumbers=" + phNumbers + ", idNumbers=" + idNumbers
				+ ", companyInfo=" + companyInfo + "]";
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setFavColors(String[] favColors) {
		this.favColors = favColors;
	}

	public void setNickNames(List<String> nickNames) {
		this.nickNames = nickNames;
	}

	public void setPhNumbers(Set<String> phNumbers) {
		this.phNumbers = phNumbers;
	}

	public void setIdNumbers(Map<String, String> idNumbers) {
		this.idNumbers = idNumbers;
	}

	public void setCompanyInfo(CompanyInfo companyInfo) {
		this.companyInfo = companyInfo;
	}

}
