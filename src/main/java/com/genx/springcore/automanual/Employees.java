package com.genx.springcore.automanual;

import org.springframework.beans.factory.annotation.Autowired;

public class Employees {

	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employees [address=" + address + "]";
	}

}
