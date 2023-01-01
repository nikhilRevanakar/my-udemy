package com.designpattern.Builder;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = Employee.getBuilder().withId(1).withName("Nikhil").withAdd("Shmga").build();
		
		System.out.println(employee);
	}

}
