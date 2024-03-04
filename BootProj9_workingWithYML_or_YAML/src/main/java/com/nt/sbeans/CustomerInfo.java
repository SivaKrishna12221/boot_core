package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("custInfo")
@ConfigurationProperties(prefix="shopping.clothes")
public class CustomerInfo
{
  private Integer custId;
  private String custName;
  private String custAddress;
  private Double billAmount;

public void setCustId(Integer custId) {
	this.custId = custId;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public void setCustAddress(String custAddress) {
	this.custAddress = custAddress;
}
public void setBillAmount(Double billAmount) {
	this.billAmount = billAmount;
}
@Override
public String toString() {
	return "CustomerInfo [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress
			+ ", billAmount=" + billAmount + "]";
}
}
