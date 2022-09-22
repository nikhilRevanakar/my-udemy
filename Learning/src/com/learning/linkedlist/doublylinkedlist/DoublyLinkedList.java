package com.learning.linkedlist.doublylinkedlist;

public class DoublyLinkedList {
	
	public Node head;
	
	public Node tail;

	public int size;
	
	// Create
	public Node createDoubly(int nodeValue) {
		if(head == null) {
			Node nw = new Node();
			nw.value = nodeValue;
			nw.next = null;
			nw.prev = null;
			
			head = nw;
			tail = nw;
			size = 1;
			return head;
			
		}
		return head;
	}
	
	
	// Traverse
	public void travers() {
		System.out.println("\n---------Travers-----------");
		if(head==null) {
			System.out.println("---------List Empty-----------");
		}
		
		Node tmp = head;
		for(int i=0;i<size;i++) {
			System.out.print(tmp.value);
			if(i != size-1) {
				System.out.print(" -> ");	
			}
			tmp = tmp.next;
		}
	}
	
	// Insert
	public Node insert(int nodeValue, int location) {
		System.out.println("\n---------Insert-----------");
		if(head == null) {
			return createDoubly(nodeValue);
		}
		
		if(location==0) {
			Node nw = new Node();
			nw.value = nodeValue;
			nw.next = head;
			nw.prev = head.prev;
			
			head = nw;
			size++;
			return head;
		}
		
		if(location>size) {
			Node nw = new Node();
			nw.value = nodeValue;
			nw.next = tail.next;
			nw.prev = tail;
			
			tail.next = nw;
			tail = nw;
			size++;
			return head;

		}
		
		Node tmp = head;
		for(int i=0;i<location;i++) {
			tmp = tmp.next;
		}
		
		Node nw = new Node();
		nw.value = nodeValue;
		nw.next =tmp.next;
		nw.prev = tmp;

		tmp.next.prev = nw;
		tmp.next = nw;
		size++;
		
		return head;
	}
	
	// Search
	public Node search(int nodeValue) {
		System.out.println("\n-----------Search-------------");
		if(head == null) {
			System.out.println("empty");
			return null;
		}
		
		Node tmp = head;
		for(int i=0;i<size;i++) {
			if(tmp.value == nodeValue )
			{
				return tmp;
			}
			tmp = tmp.next;
		}
		
		
		return head;
	}
	
}
