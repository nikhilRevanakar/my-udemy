package com.learning.TernarySearch;

public class Node {
	
	Node leftChild;
	Node rightChild;
	Node middleChile;
	char character;
	boolean leaf;
	int value;
	public Node(char character) {
		super();
		this.character = character;
	}
	public Node getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}
	public Node getRightChild() {
		return rightChild;
	}
	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}
	public Node getMiddleChile() {
		return middleChile;
	}
	public void setMiddleChile(Node middleChile) {
		this.middleChile = middleChile;
	}
	public char getCharacter() {
		return character;
	}
	public void setCharacter(char character) {
		this.character = character;
	}
	public boolean isLeaf() {
		return leaf;
	}
	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Node [leftChild=" + leftChild + ", rightChild=" + rightChild + ", middleChile=" + middleChile
				+ ", character=" + character + ", leaf=" + leaf + ", value=" + value + "]";
	}
	
	

}
