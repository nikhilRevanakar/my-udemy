package com.designpattern.singelton.Eager;

public class DatabaseSingleton {
	
	private static final DatabaseSingleton INSTANCE = new DatabaseSingleton();
	
	private DatabaseSingleton() {
		
	}
	
	public static DatabaseSingleton getInstance() {
		return INSTANCE;
	}
	
	public void print() {
		System.out.println("Hello");
	}

}
