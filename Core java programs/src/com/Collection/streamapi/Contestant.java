package com.Collection.streamapi;

public class Contestant {
	 
	public String phone = null;
	public String name = null;
	
	public Contestant (String phone,String name) {
		   this.phone = phone;
		   this.name = name;	
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}