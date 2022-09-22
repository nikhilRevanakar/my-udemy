package com.learning.linkedlist.qa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Partition {
	
	// IP 3->5->8->5->10->2->1 [x=5]
	// OP 3->1->2->10->5->5->8
	public void partition(LinkedList ll, int check) {
		System.out.println("-------Partition--------");
		
//		3 Node prev 
//		2 node prev
//		1 Node prev

		Node tmp = ll.head;
		Node prev = null;
		int size = ll.size;
		
		List<Node> lesser = new ArrayList<>();
		List<Node> greater = new ArrayList<>();
		
		
		for(int i=0;i<size;i++) {
			if(tmp.value < check) {
				tmp.prev = prev;
				Node nw = tmp;
				lesser.add(nw);
			} else {
				tmp.prev = prev;
				Node nw = tmp;
				greater.add(nw);
			}
			prev = tmp;
			tmp = tmp.next;
		}
		


		// Lesser
		Node tmpTail = null;
		for(int i=0;i<lesser.size()-1;i++) {
			Node n = lesser.get(i);
			if(i==0) {
				ll.head = n;
			}
			n.next = lesser.get(i+1);
		}
		tmpTail = lesser.get(lesser.size()-1);
		
		// Greater
		for(int i=0;i<greater.size()-1;i++) {
			Node n = greater.get(i);
			
			if(i==0) {
				tmpTail.next = n;
				n.prev=tmpTail;
			}
			n.next = greater.get(i+1);
		}
		ll.tail = greater.get(greater.size()-1);
		ll.tail.next = null;
		ll.travers();
	}

}
