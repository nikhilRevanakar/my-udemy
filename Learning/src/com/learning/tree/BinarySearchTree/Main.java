package com.learning.tree.BinarySearchTree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(70);
		bst.insert(50);
		bst.insert(90);
		bst.insert(30);
		bst.insert(60);
		bst.insert(80);
		bst.insert(100);
		bst.insert(20);
		bst.insert(40);
		
		System.out.println("\n-----PreOrder---------");
		bst.preOrder(bst.root);
		
		System.out.println("\n-----InOrder---------");
		bst.inOrder(bst.root);
		
		System.out.println("\n-----postOrder---------");
		bst.postOrder(bst.root);
		
		System.out.println("\n-----levelOrder---------");
		bst.levelOrder();
		
		System.out.println("\n-----Search---------");
		System.out.println(bst.search(bst.root, 40).value);
		
	}
	

}
