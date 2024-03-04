package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("comInfo")
@ConfigurationProperties(prefix = "emp.info.companyinfo") // here profix should not be capital
public class CompanyInfo {
	private String name;
	private Integer id;
	private String address;
	private String contact;

	public void setName(String name) {
		this.name = name;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setContact(String contact) {
		this.contact = contact;

	}

	@Override
	public String toString() {
		return "CompanyInfo [name=" + name + ", id=" + id + ", address=" + address + ", contact=" + contact + "]";
	}

}
