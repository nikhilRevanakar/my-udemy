package com.designpattern.singelton.LazyMultiThread;

public class DatabaseSingletonLazy {
	
	private static DatabaseSingletonLazy databaseSingletonLazy;
	
	private DatabaseSingletonLazy() {
		
	}
	
	
	public static DatabaseSingletonLazy getInstance() {
		if(databaseSingletonLazy==null) {
			synchronized (DatabaseSingletonLazy.class) {
				if(databaseSingletonLazy==null) {
					databaseSingletonLazy = new DatabaseSingletonLazy();
					return databaseSingletonLazy;
				}
			}
		} 
		return databaseSingletonLazy;
	}

}
