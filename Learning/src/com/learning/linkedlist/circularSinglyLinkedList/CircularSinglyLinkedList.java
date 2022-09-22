package com.learning.linkedlist.circularSinglyLinkedList;

public class CircularSinglyLinkedList {
	
	public Node head;
	
	public Node tail;
	
	public int size;
	
	public Node createCircularSinglyLL(int nodeValue) {
		
		if(head == null) {
		Node newNode = new Node();
		newNode.value = nodeValue;
		newNode.next = newNode;
		
		head=newNode;
		tail = newNode;
		size = 1;
		return head;
		}
		
		return head;
	}
	
	// Inser 
	public Node insert(int nodeValue, int location) {
		System.out.println("\n-------------Inserting-------------");
			
		if(head == null) {
			return createCircularSinglyLL(nodeValue);
		}
		
		if(location==0) {
			Node nw = new Node();
			nw.value = nodeValue;
			nw.next = head.next;
			
			head = nw;
			tail.next = head;
			size++;
		}
		
		if(location>size) {
			
//			Node tmp = head;
//			for(int i=0;i<size-1;i++) {
//				tmp = tmp.next;
//			}
//			
			System.out.println(tail.value +" "+tail.next.value);
			Node nw = new Node();
			nw.value = nodeValue;
			nw.next = tail.next;
			tail.next = nw;
			tail = nw;
			
			size++;
		}
		
		
		return null;
	}
	
	// Treavers 
	public void travers() {
		System.out.println("\n-------------travers-------------");
		Node temp = head;
		
		for(int i=0;i<size;i++) {
			System.out.print(temp.value);
			if(i != size-1) {
				System.out.print(" -> ");
			}
			temp = temp.next;
		}
				
	}
	
	// Delete
	public void delete(int nodeValue) {
		if(size==1) {
			head = null;
			tail = null;
		}
		
		Node tmp = head;
		Node prev = head;
		for(int i=0;i<size;i++) {
			if(tmp.value==nodeValue) {
				if(i==0) {
					head = tmp.next;
					tail.next = head;
					size--;
					return;
				}
				prev.next = tmp.next;
				size--;
				return;
			}
			prev = tmp;
			tmp = tmp.next;
		}
		
	}

}
