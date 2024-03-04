package com.nt.sbeans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component("dmart")
@ConfigurationProperties(prefix="dmart.info")
public class Dmart
{
   private Integer id;
   private String shopname;
   private String owner;
   private String phNumber;
   
   private String[] typesOfProducts;
   private List<Object> typesOfClothes;
   private Set<Object> contactDetails;
   private Map<Object,Object>  prices;

public void setId(Integer id) {
	this.id = id;
}
public void setShopname(String shopname) {
	this.shopname = shopname;
}
public void setOwner(String owner) {
	this.owner = owner;
}
public void setContact(String contact) {
	this.phNumber = contact;
}
public void setTypesOfProducts(String[] typesOfProducts) {
	this.typesOfProducts = typesOfProducts;
}
public void setTypesOfClothes(List<Object> typesOfClothes) {
	this.typesOfClothes = typesOfClothes;
}
public void setContactDetails(Set<Object> contactDetails) {
	this.contactDetails = contactDetails;
}
public void setPrices(Map<Object, Object> prices) {
	this.prices = prices;
}
@Override
public String toString() {
	return "Dmart [id=" + id + ", shopname=" + shopname + ", owner=" + owner + ", contact=" + phNumber+ ", typesOfProducts="
			+ Arrays.toString(typesOfProducts) + ", typesOfClothes=" + typesOfClothes + ", contactDetails="
			+ contactDetails + ", prices=" + prices + "]";
}
   
} 
