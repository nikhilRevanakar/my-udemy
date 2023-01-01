package com.designpattern.factoryMethod;

public class EmailMessage implements Message{

	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println("Mesg via Mail");
	}

	@Override
	public void encode() {
		// TODO Auto-generated method stub
		System.out.println("Encode base64");
	}
	
	

}
