package com.learning.tree.topBottomView;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;


public class TopViewBinaryTree {

	BinaryNode root;
	
	public BinaryNode insert(BinaryNode node, int value) {
		BinaryNode cnode = new BinaryNode();
		cnode.value = value;
		if(node==null) {
			root = cnode;
			return cnode;
		}
		
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()) {
			BinaryNode currentNode = queue.remove();
			
			if(currentNode.left==null) {
				currentNode.left = cnode;
				return currentNode;
			} else if(currentNode.right==null) {
				currentNode.right = cnode;
				return currentNode;
			}
			queue.add(currentNode.left);
			queue.add(currentNode.right);
			
		}
		
		
		
		return null;
	}
	
	public void insert(int value) {
		insert(root, value);
	}
	
	// Inorder
	public void inOrder(BinaryNode node) {
		if(node==null) {
			return;
		}
		
		
		inOrder(node.left);
		System.out.print(node.value+" ");
		inOrder(node.right);
	}
	
	// LevelOrder
	public void levelOrder(BinaryNode root) {
		if(root == null) {
			return;
		}
		
		Queue<BinaryNode> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			BinaryNode currentNode = q.remove();
				
			System.out.print(currentNode.value+" ");
			if(currentNode.left!=null) {
				q.add(currentNode.left);
			}
			if(currentNode.right!=null) {
				q.add(currentNode.right);
			}
			
		}
		
	}
	
	// Bottom View - Level Order
	// hd - Horizontal Distance
	public void bottomView(BinaryNode root) {
		if(root==null) {
			return;
		}
		
		Map<Integer, Integer> map = new TreeMap<>();
		map.put(0, root.value);
		
		Queue<Pair> queue = new LinkedList<>();
		queue.add(new Pair(0, root));
		
		while(!queue.isEmpty()) {
			Pair currentPair = queue.remove();
			
			
			map.put(currentPair.hd, currentPair.node.value);
			if(currentPair.node.left!=null) {
				queue.add(new Pair(currentPair.hd-1, currentPair.node.left));
			}
			if(currentPair.node.right!=null) {
				queue.add(new Pair(currentPair.hd+1, currentPair.node.right));
			}
		}
		
		map.forEach((a,b) -> System.out.println(a+" "+b));
		
	}
	
	
	// Top View - Level Order
	// hd - Horizontal Distance
	public void topViewLevelOrder(BinaryNode root) {
		if(root==null) {
			return;
		}
		
		Map<Integer, Integer> map = new TreeMap<>();
		map.put(0, root.value);
		
		Queue<Pair> queue=new LinkedList<>();
		queue.add(new Pair(0,root));
		
		while(!queue.isEmpty()) {
			Pair currentPair = queue.remove();
			if(!map.containsKey(currentPair.hd)) {
				map.put(currentPair.hd, currentPair.node.value);
			}
			
			if(currentPair.node.left!=null) {
				queue.add(new Pair(currentPair.hd-1, currentPair.node.left));
			}
			if(currentPair.node.right!=null) {
				queue.add(new Pair(currentPair.hd+1, currentPair.node.right));
			}
			
		}
		
		
		map.forEach((a,b) -> {
			System.out.println(a+" "+b);
		});
	}
	
	static class Pair{
		int hd;
		BinaryNode node;
		
		
		public Pair() {
			super();
		}


		public Pair(int hd, BinaryNode node) {
			super();
			this.hd = hd;
			this.node = node;
		}
		
		
	}


}
