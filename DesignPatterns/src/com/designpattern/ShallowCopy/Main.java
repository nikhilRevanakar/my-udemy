package com.designpattern.ShallowCopy;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Address a = new Address();
		a.setAddress("Shinmfa");
		Employee  e= new Employee(1, "Nik",a);
		Employee d =(Employee)e.clone();
		System.out.println(e);
		System.out.println(d);

		e.getAddress().setAddress("bfhg");
		
		System.out.println(e);
		System.out.println(d);
		
	}

}
