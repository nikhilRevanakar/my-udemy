package com.designpattern.singelton.Lazy;

public class DatabaseSingletonLazy {
	
	private static DatabaseSingletonLazy databaseSingletonLazy;
	
	private DatabaseSingletonLazy() {
		
	}
	
	private static DatabaseSingletonLazy build() {
		databaseSingletonLazy = new DatabaseSingletonLazy();
		return databaseSingletonLazy;
	}
	
	public static DatabaseSingletonLazy getInstance() {
		if(databaseSingletonLazy==null) {
			return build();
		} else {
			return databaseSingletonLazy;
		}
		
	}

}
