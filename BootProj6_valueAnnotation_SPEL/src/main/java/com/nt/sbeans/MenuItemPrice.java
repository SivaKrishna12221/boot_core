package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("price1")
public class MenuItemPrice {
	@Value("${price.dosha}")
	private float dosha;
	@Value("${price.mysoorBajji}")
	private float mysoorBajji;
	@Value("${price.poori}")
	private float poori;
	@Value("${price.samosa}")
	private float samosa;
	@Value("${price.eggBajji}")
	private float eggBajji;

	public float getDosha() {
		return dosha;
	}

	public void setDosha(float dosha) {
		this.dosha = dosha;
	}

	public float getMysoorBajji() {
		return mysoorBajji;
	}

	public void setMysoorBajji(float mysoorBajji) {
		this.mysoorBajji = mysoorBajji;
	}

	public float getPoori() {
		return poori;
	}

	public void setPoori(float poori) {
		this.poori = poori;
	}

	public float getSamosa() {
		return samosa;
	}

	public void setSamosa(float samosa) {
		this.samosa = samosa;
	}

	public float getEggBajji() {
		return eggBajji;
	}

	public void setEggBajji(float eggBajji) {
		this.eggBajji = eggBajji;
	}
}
