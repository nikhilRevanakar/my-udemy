package com.learning.tree.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

	BinaryNode root;

	public BinarySearchTree() {
		this.root = null;
	}

//						    70
//				50					90
//		30			60			80		100
//20		40     
	private BinaryNode insert(BinaryNode currentNode, int value) {
		if (currentNode == null) {
			BinaryNode binaryNode = new BinaryNode();
			binaryNode.value = value;
			System.out.println("Successfully inserted");
			return binaryNode;
		} else if (value <= currentNode.value) {
			currentNode.left = insert(currentNode.left, value);
			return currentNode;
		} else {
			currentNode.right = insert(currentNode.right, value);
			return currentNode;
		}
	}

	void insert(int value) {
		root = insert(root, value);
	}
	
	// PreOrder Traversal
	// Root
	//  |
	// Left Subtree
	//  |
	// Right Subtree
//	 Level0                             70
//	 Level1                    50					90
//	 Level2              30			60			80		100
//	 Level3         20		40	
//	Output: 70 50 30 20 40 60 90 80 100 
	public void preOrder(BinaryNode binaryNode) {
		if(binaryNode == null) {
			
			return;
		}
		System.out.print(binaryNode.value+" ");
		preOrder(binaryNode.left);
		preOrder(binaryNode.right);
	}
	
	// InOrder Traversal
	// Left Subtree
	//  |
	// Root
	//  |
	// Right Subtree
//	 Level0                             70
//	 Level1                    50					90
//	 Level2              30			60			80		100
//	 Level3         20		40	
//	Output: 20 30 40 50 60 70 80 90 100 
	public void inOrder(BinaryNode binaryNode) {
		if(binaryNode == null) {
			return;
		}
		inOrder(binaryNode.left);
		System.out.print(binaryNode.value+" ");
		inOrder(binaryNode.right);
	}
	
	// PostOrder Traversal
	// Left Subtree
	//  |
	// Right Subtree
	//  |
	// Root
//	 Level0                             70
//	 Level1                    50					90
//	 Level2              30			60			80		100
//	 Level3         20		40	
//	Output: 20 40 30 60 50 80 100 90 70 
	public void postOrder(BinaryNode node) {
		if(node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.value+ " ");
	}

	// Level Order Traversal
//	 Level0                             70
//	 Level1                    50					90
//	 Level2              30			60			80		100
//	 Level3         20		40	
//	Output: 70 50 90 30 60 80 100 20 40 
	public void levelOrder() {
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			BinaryNode node = queue.remove();
			System.out.print(node.value + " ");
			if(node.left !=null) {
				queue.add(node.left);
			}
			if(node.right !=null) {
				queue.add(node.right);
			}
		}
	}

	// Search Node
//	 Level0                             70
//	 Level1                    50					90
//	 Level2              30			60			80		100
//	 Level3         20		40	
// Search :  40
	public BinaryNode search(BinaryNode node, int value) {
		if(node == null) {
			System.out.println(value+" not found");
			return null;
		} else if(node.value == value) {
			System.out.println(value +" found");
			return node;
		} else if(value <= node.value) {
			return search(node.left, value);
		} else if(value >= node.value) {
			return search(node.right, value);
		}
		
		return null;
	}
	
	// DELETE A NODE
	// 3 ways to delete
	// Case 1: The node to be deleted is a leaf node
	// Case 2: The node has one child
	// Case 3: The node has two children
//	 Level0                             70
//	 Level1                    50					90
//	 Level2              30			60			80			100
//	 Level3         20		40						85
//Delete :  
	public BinaryNode delete(BinaryNode root, int value) {
		if(root == null) {
			System.out.println("Value Not found");
			return null;
		}
		
		if(value < root.value) {
			root.left = delete(root.left, value);
		} else if(value > root.value) {
			root.right = delete(root.right, value);	
		} else {
			// Case 1: The node to be deleted is a leaf node
			if(root.left != null && root.right != null) {
				BinaryNode temp = root;
				BinaryNode minNodeForRight = minNode(temp.right);
				root.value = minNodeForRight.value;
				root.right = delete(root.right, minNodeForRight.value);
				
			} else if(root.left !=null ) {
				root = root.left;
			}
			else if(root.right !=null ) {
				root = root.right;
			} else {
				root = null;
			}
		}
		
		return root;
	}
	
	
	// Find the successor of given node
	// i.e find the min node in right subtree
//	 Level0                             70
//	 Level1                    50					90
//	 Level2              30			60			80			100
//	 Level3         20		40						85
// Input : 90
// Ouput : 80 bcoz 80 is the min node. 
	public static BinaryNode minNode(BinaryNode node) {
		if(node.left == null) {
			return node;
		} else {
			return minNode(node.left);
		}
		
	}
	

}

