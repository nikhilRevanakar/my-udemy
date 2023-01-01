package com.designpattern.Adapter;

public class CardHolder {
	
	public String getMessage(Customer customer) {
		String msg = " ";
		msg+= customer.getId();
		msg+=customer.getName();
		msg+=customer.getLocation();
		
		return msg;
	}

}
