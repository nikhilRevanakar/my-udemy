package com.designpattern.simpleFactory;

public class Customer {
	
	int amount;
	
	String paidStatus;
	
	String msgType;
	
	
	

	public Customer(int amount, String paidStatus, String msgType) {
		super();
		this.amount = amount;
		this.paidStatus = paidStatus;
		this.msgType = msgType;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getPaidStatus() {
		return paidStatus;
	}

	public void setPaidStatus(String paidStatus) {
		this.paidStatus = paidStatus;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	
	

}
