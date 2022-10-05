package com.learning.tree.BinrayTreeUsingArrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree binaryTree = new BinaryTree(9);
		binaryTree.insert("N1");
		binaryTree.insert("N2");
		binaryTree.insert("N3");
		binaryTree.insert("N4");
		binaryTree.insert("N5");
		binaryTree.insert("N6");
		binaryTree.insert("N7");
		binaryTree.insert("N8");
		binaryTree.insert("N9");
		
		System.out.println("\nPre-Order traversal");
		binaryTree.preOder(1);
		
		System.out.println("\nIn-Order traversal");
		binaryTree.inOrder(1);
		
		System.out.println("\nPost-Order traversal");
		binaryTree.postOrder(1);
		
		System.out.println("\nLevel-Order traversal");
		binaryTree.levelOrder();
		
		System.out.println("\nSearch");
		binaryTree.search("N7");
		

		System.out.println("\nDelete");
		binaryTree.delete("N3");
		

		System.out.println("\nLevel-Order traversal");
		binaryTree.levelOrder();
		
	}

}
