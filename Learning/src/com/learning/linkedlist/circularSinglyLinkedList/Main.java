package com.learning.linkedlist.circularSinglyLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularSinglyLinkedList cll = new CircularSinglyLinkedList();
		
		// Create
		cll.createCircularSinglyLL(5);
		System.out.println(cll.head.value + " "+cll.head.next);

		// Travers
		cll.travers();
		
		// Insert
		cll.insert(44, 0);
		
		// Travers
		cll.travers();
		
		// Insert
		cll.insert(93, 5);
		
		// Travers
		cll.travers();

		// Insert
		cll.insert(293, 6);
		
		// Travers
		cll.travers();
		
		// Delete
		cll.delete(44);
		
		// Travers
		cll.travers();
				
	}

}
