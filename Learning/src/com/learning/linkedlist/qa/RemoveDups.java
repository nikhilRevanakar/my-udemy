package com.learning.linkedlist.qa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDups {
	
	// Q1) Remove Duplicate
	// ll = 1 -> 2 -> 1 -> 3
	// op = 1 -> 2 -> 3
	public Node removeDuplicate(LinkedList ll) {
		System.out.println("---Inside RemoveDups -----");
		
		List<Integer> ref = new ArrayList<>();
		
		HashSet<Integer> set = new HashSet<>();
		
		Node tmp = ll.head;
		
		Node prev = null;
		
		while(tmp.next != null) {
			System.out.println(tmp.value);
			if(set.contains(tmp.value)) {
				prev.next = tmp.next;
				ll.size--;
			} else {
				set.add(tmp.value);
			}
			prev = tmp;
			tmp = tmp.next;
		}
		
		if(tmp.next==null) {
			if(set.contains(tmp.value)) {
				prev.next = tmp.next;
				ll.size--;
			} 
		}
		
		return ll.head;
		}
}
