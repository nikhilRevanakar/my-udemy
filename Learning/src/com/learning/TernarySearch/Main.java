package com.learning.TernarySearch;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TernarySearch tree = new TernarySearch();
		
		tree.put("car", 10);
		tree.put("bus", 5);
		tree.put("banana", 7);
		tree.put("city", 20);
		tree.put("person", 2);
		
		
		System.out.println(tree.get("car"));
		
		tree.travers();
	}

}
