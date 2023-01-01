package com.designpattern.simpleFactory;

public class EmailMessage implements Message{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Mesg via Mail");
	}

}
