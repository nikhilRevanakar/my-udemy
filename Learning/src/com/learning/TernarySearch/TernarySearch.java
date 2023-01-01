package com.learning.TernarySearch;

public class TernarySearch {
	
	Node root;
	
	public void put(String key, int val) {
		root= insert(root, key, val, 0);
	}
	
	public Node insert(Node node, String key, int val, int ind) {
		
		char c = key.charAt(ind);
		
		if(node == null) {
			node = new Node(c);
			
		}
		
		if(c < node.getCharacter()) {
			node.setLeftChild(insert(node.getLeftChild(), key, val, ind));
		} else if(c > node.getCharacter()) {
			node.setRightChild(insert(node.getRightChild(), key, val, ind));
		} else if(ind < key.length()-1) {
			node.setMiddleChile(insert(node.getMiddleChile(), key, val, ind+1));
		} else {
			node.setLeaf(true);
			node.setValue(val);
		}
		
		return node;
	}
	
	
	public Integer get(String key) {
		Node node = get(root, key, 0);
		
		if(node==null) {
			return -1;
		}
		
		return node.value;
	}

	private Node get(Node node, String key, int i) {
		if(node == null) {
			return null;
		}
		
		char c = key.charAt(i);
		
		if(c< node.getCharacter()) {
			return get(node.getLeftChild(), key, i);
		} else if(c > node.getCharacter()) {
			return get(node.getRightChild(), key, i);
		} else if(i < key.length()-1) {
			return get(node.getMiddleChile(), key, i+1);
		} else {
			if(!node.isLeaf()) {
				return null;
			}
			
			return node;
		}
		
	}
	
	
	public void travers() {
		traverse(root, "");
	}

	private void traverse(Node node, String s) {
		
		// Left + root +  Right
		
		// We hit a leaf node
		if(node.getMiddleChile() == null || node.getValue() != 0) {
			System.out.println(s + node.getCharacter() +":" +node.getValue());
		}
		
		// Recursvily to left
		if(node.getLeftChild() != null) {
			traverse(node.getLeftChild(), s);
		}

		// Recursvily to Middle
		if(node.getMiddleChile() != null) {
			traverse(node.getMiddleChile(), s + node.getCharacter());
		}

		// Recursvily to right
		if(node.getRightChild() != null) {
			traverse(node.getRightChild(), s);
		}

		
	}

}
