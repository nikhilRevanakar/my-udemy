package com.learning.linkedlist.singlylinkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList sll = new SinglyLinkedList();
		
		sll.createSingly(5);
		
		System.out.println(sll.head.getValue()+" "+sll.head.getNext());
		
		
		// Insert 0 means head
		sll.insertSll(6, 0);
		
		System.out.println(sll.head.getValue()+" "+sll.head.getNext());
		
		// Insert 1st position  means head
		sll.insertSll(7, 1);
		
		System.out.println(sll.head.getValue()+" "+sll.head.getNext());
		
		// Insert 5th position  means head
		sll.insertSll(44, 5);
		
		System.out.println(sll.head.getValue()+" "+sll.head.getNext());
		
		
		// Travers
		sll.traversSll();
		
		// Search
		Node node = sll.search(5);
		System.out.println(node.getValue() + " "+node.getNext());
		
		// Delete
		sll.delete(5);
		
		// Travers
		sll.traversSll();
				
	}

}
