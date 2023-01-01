package com.designpattern.singelton.Eager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DatabaseSingleton db = DatabaseSingleton.getInstance();
		
		db.print();

	}

}
