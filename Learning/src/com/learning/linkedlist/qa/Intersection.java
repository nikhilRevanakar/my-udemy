package com.learning.linkedlist.qa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;

public class Intersection {
	
	public LinkedList lC = new LinkedList();
	
	
	public void addSameNode(LinkedList lA, LinkedList lB, int value) {

		System.out.println("----addSameNode Intersection------");
		Node laTail = lA.tail;
		Node lbTail = lB.tail;
		
		lC.insertNode(value);

		if(lC.size == 1) {
		lA.tail.next = lC.head;
		lB.tail.next = lC.head;
		lA.tail = lC.tail;
		lB.tail = lC.tail;
		} else {
		
		lA.tail = lC.tail;
		lB.tail = lC.tail;
		}
		
		lA.size++;
		lB.size++;
	
	}
	
	public void traverseLC() {
		System.out.println("----Travers Intersection------");
		Node tmp = lC.head;
		
		for(int i=0;i<lC.size;i++) {
			System.out.print(tmp.value);
			if(i != lC.size-1) {
				System.out.print(" -> ");
			}
			tmp = tmp.next;
		}
	}
	
	public Node checkIntersection(LinkedList la, LinkedList lb) {
		Node tempA = la.head;
		Node tempB = lb.head;
		System.out.println("----------checkIntersection-------");
		
		Set<Node> se = new HashSet<>();
		
		for(int i=0;i<la.size;i++) {
			se.add(tempA.next);
			tempA = tempA.next;
		}
		
		for(int i=0;i<lb.size;i++) {
			if(se.contains(tempB.next)) {
				return tempB.next;
			}
			tempB =tempB.next;
		}
		
		return null;
	}

}
