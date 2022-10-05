package com.designpattern.builderDesignPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = User.getBuilder()
				.withFirstName("nikhil")
				.withLastName("Revanakar")
				.withAge("22")
				.withAddress("shimoga")
				.build();
				
		
		System.out.println(user);
	}

}
