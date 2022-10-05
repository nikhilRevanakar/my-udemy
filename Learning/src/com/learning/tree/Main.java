package com.learning.tree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode drinks = new TreeNode("Drinks");
		TreeNode hot = new TreeNode("Hot");
		TreeNode cold = new TreeNode("Cold");
		
		TreeNode whiskey = new TreeNode("Whiskey");
		TreeNode rum = new TreeNode("Rum");
		
		TreeNode tea = new TreeNode("Tea");
		TreeNode coffee = new TreeNode("Coffee");
		
		drinks.addChild(hot);
		drinks.addChild(cold);
		
		cold.addChild(rum);
		cold.addChild(whiskey);
		
		hot.addChild(tea);
		hot.addChild(coffee);
		
		drinks.print();
	}

}
