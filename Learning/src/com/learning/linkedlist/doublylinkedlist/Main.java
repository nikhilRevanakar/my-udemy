package com.learning.linkedlist.doublylinkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dll = new DoublyLinkedList();
		
		// Create 
		dll.createDoubly(5);
		
		// Travers
		dll.travers();
		
		// Insert
		dll.insert(33, 0);
		
		// Travers
		dll.travers();
		
		// Insert
		dll.insert(67, 8);
		
		// Travers
		dll.travers();
		
		// Insert
		dll.insert(99, 1);
		
		// Travers
		dll.travers();
		
		// Search
		Node node = dll.search(99);
		System.out.println(node.prev + " "+ node.value +" "+node.next);
		
	}

}
