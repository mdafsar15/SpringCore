package com.genx.springcore.automanual;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ad")
public class Address {

	@Value("Amit")
	private String street;
	@Value("Mp")
	private String city;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}

}
