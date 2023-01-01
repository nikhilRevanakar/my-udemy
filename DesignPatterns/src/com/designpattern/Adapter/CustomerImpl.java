package com.designpattern.Adapter;

public class CustomerImpl implements Customer{

	Employee e;
	public CustomerImpl(Employee e) {
		// TODO Auto-generated constructor stub
		this.e = e;
	}
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return e.getId();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return e.getName();
	}

	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		return e.getAddress();
	}
	

}
