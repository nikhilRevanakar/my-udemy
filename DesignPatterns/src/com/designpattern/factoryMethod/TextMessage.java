package com.designpattern.factoryMethod;

public class TextMessage implements Message{
	
	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println("Mesg via Text");
	}


	@Override
	public void encode() {
		// TODO Auto-generated method stub
		System.out.println("Encode Html");
	}
	

}
