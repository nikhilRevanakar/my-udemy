package com.learning.tree.BinaryTreeUsingLinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
	
	public BinaryNode root;

	public BinaryTreeLL() {
		this.root = null;
	}
	
	// PreOrder Traversal
	// Root
	//  |
	// Left Subtree
	//  |
	// Right Subtree
//	                                   n1
//	                          n2					n3
//	                   n4			n5			n6		n7
//	               n8		n9     
	// Output: N1 N2 N4 N8 N9 N5 N3 N6 N7 
	public void preOrder(BinaryNode node) {
		
		if(node == null) {
			return;
		}
		
		System.out.print(node.value + " ");
		
		preOrder(node.left);
		preOrder(node.right);
	}
	
	// In-Order Traversal
	// Left Subtree
	//  |
	// Root
	//  |
	// Right Subtree
//	                                   n1
//	                          n2					n3
//	                   n4			n5			n6		n7
//	               n8		n9   
	// output: N8 N4 N9 N2 N5 N1 N6 N3 N7 
	public void inOrder(BinaryNode node) {
		if(node == null) {
			return;
		}
		
		inOrder(node.left);
		System.out.print(node.value + " ");		
		inOrder(node.right);
	}
	
	// Post-Order Traversal
	// Left Subtree
	//  |
	// Right Subtree
	//  |
	// Root
//	                                   n1
//	                          n2					n3
//	                   n4			n5			n6		n7
//	               n8		n9   
	// output: N8 N9 N4 N5 N2 N6 N7 N3 N1 
	public void postOrder(BinaryNode node) {
		if(node ==null) {
			return;
		}
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.value+" ");
	}
	
	
	// Level-Order Traversal
	// Print node of each level
//	 Level0                             n1
//	 Level1                    n2					n3
//	 Level2              n4			n5			n6		n7
//	 Level3         n8		n9   
	// output: n1 n2 n3 n4 n5 n6 n7 n8 n9
	void levelOrdeer() {
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			BinaryNode presenBinaryNode = queue.remove();
			System.out.print(presenBinaryNode.value+ " ");
			if(presenBinaryNode.left!=null) {
				queue.add(presenBinaryNode.left);
			}
			if(presenBinaryNode.right!=null) {
				queue.add(presenBinaryNode.right);
			}
		}
		
	}
	
	
	// Search method using LEVEL ORDER Traversal
	public void search(String value) {
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			BinaryNode remove = queue.remove();
			if(remove.value == value) {
				System.out.println("Value Found: "+value);
				return;
			} else  {
				if(remove.left!=null) {
				queue.add(remove.left);
				} 
				if(remove.right!=null) {
				queue.add(remove.right);
				}
			}
			
		}
		
	}
	
	// INsert node
	public void insert(String value) {
		BinaryNode newNode = new BinaryNode();
		newNode.value = value;
		if(root == null) {
			root = newNode;
			System.out.println("Successfully inserted at ROOT node");
			return;
		}
		
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			
			if(presentNode.left == null ) {
				presentNode.left = newNode;
				System.out.println("Successfully inserted");
				break;
			} else if(presentNode.right == null) {
				presentNode.right = newNode;
				System.out.println("Successfully inserted");
				break;
			} else {
				queue.add(presentNode.left);
				queue.add(presentNode.right);
			}
		}
		
	}
	
	// Delete a node
	// Level order traversal
//	 Level0                             n1
//	 Level1                    n2					n3
//	 Level2              n4			n5			n6		n7
//	 Level3         n8		n9   
	// Delete N3
	// Steps.
	// 1. Find the node
	// 2. Find the deepest node- N9 in this case
	// 3. Set Deepest node value to Current node
	// 4. Delete Deepest Node
//	 Level0                             n1
//	 Level1                    n2					n9
//	 Level2              n4			n5			n6		n7
//	 Level3         n8		   
		
	public void delete(String value) {
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			if(presentNode.value == value) {
				presentNode.value = getDeepestNode().value;
				deleteDeepestNode();
				System.out.println("Node deleted success");
				return;
			} else {
				if(presentNode.left !=null) queue.add(presentNode.left);	
				if(presentNode.right !=null) queue.add(presentNode.right);
			}
			
		}
	}
	
	// Get Deepest node
	public BinaryNode getDeepestNode() {
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		BinaryNode presentNode = null;
		while(!queue.isEmpty()) {
			presentNode = queue.remove();
			if(presentNode.left !=null) {
				queue.add(presentNode.left);
			}
			if(presentNode.right !=null) {
				queue.add(presentNode.right);
			}
		}
		
		return presentNode;
	}
	
	// Delete Deepest node
	public void deleteDeepestNode() {
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		BinaryNode presentNode= null;
		BinaryNode previousNode = null;
		while(!queue.isEmpty()) {
			previousNode = presentNode;
			presentNode = queue.remove();
			if(presentNode.left ==null) {
				previousNode.right = null;
				return;
			}else if(presentNode.right ==null) {
				presentNode.left = null;
				return;
			}
		
			queue.add(presentNode.left);
		
			queue.add(presentNode.right);
		}
	}
}
