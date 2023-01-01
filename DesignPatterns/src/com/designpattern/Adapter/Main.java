package com.designpattern.Adapter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		e.setId(1);
		e.setName("Nik");
		e.setAddress("Bnglr");
		CustomerImpl customerImpl = new CustomerImpl(e);
		
		CardHolder holder = new CardHolder();
		System.out.println(holder.getMessage(customerImpl));

	}

}
