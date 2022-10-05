package com.learning.hibernate;

public class User implements Cloneable {
	
	private String name;
	
	private String address;
	
	private String umsUrl;

	public User clone() throws CloneNotSupportedException {
		
		return (User)super.clone();
	}
	
	
	public String getUmsUrl() {
		return umsUrl;
	}

	public void setUmsUrl(String umsUrl) {
		this.umsUrl = umsUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", address=" + address + ", umsUrl=" + umsUrl + "]";
	}
	
	
	
	

}
