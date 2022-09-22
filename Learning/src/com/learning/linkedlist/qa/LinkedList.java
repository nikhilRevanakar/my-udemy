package com.learning.linkedlist.qa;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
	
	public Node head;
	
	public Node tail;
	
	public int size;
	
	public void createLL(int nodeValue) {
		Node nw = new Node();
		nw.value = nodeValue;
		nw.next = null;
		
		head = nw;
		tail = nw;
		
		size = 1;
		
	}
	
	public void  insertNode(int nodeValue) {
		if(head == null) {
			createLL(nodeValue);
			return;
		}
		Node nw = new Node();
		nw.value = nodeValue;
		nw.next = null;
		
		tail.next = nw;
		
		tail = nw;
		size++;
	}
	
	public void travers() {
		System.out.println("---Travers---");
		Node tmp = head;
		
		for(int i=0;i<size;i++) {
			System.out.print(tmp.value);
			if(i != size-1) {
				System.out.print(" -> ");
			}
			tmp = tmp.next;
		}
		System.out.println();
	}
	

}
