package com.designpattern.simpleFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c = new Customer(20, "Paid", "Mail");
		Message m = getMsgType(c.getMsgType());
		m.print();
	}
	
	private static Message getMsgType(String type) {
		
		switch(type) {
			case "Text" :
				return new TextMessage();
			case "Mail":
				return new EmailMessage();
			default:
				return null;
		}
	
	}

}
