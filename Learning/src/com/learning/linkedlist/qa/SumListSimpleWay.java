package com.learning.linkedlist.qa;

import java.sql.ResultSet;

public class SumListSimpleWay {
	
	// Question: 
	//	You have two numbers represnted by a linkedlist, where each node contains a single digit.
	//	The digits are stored in reverse order, such that the 1's digit is at the head of the list.
	//	Write a function that adds the two numbers and return the sum as a linked list.
	// List 1 : 7->1->6  617
	// List 1 : 5->9->2  295 = 912
	// Sum List: 2->1->9
	
	public LinkedList sum(LinkedList llA, LinkedList llB) {
		Node n1 = llA.head;
		Node n2 = llB.head;
		int carry = 0;
		
		LinkedList resultLL = new LinkedList();
		
		while(n1 != null || n2 != null) {
			int result = carry;
			
			if(n1 != null) {
				result += n1.value;
				n1 = n1.next;
			} 
			if (n2 != null) {
				result += n2.value;
				n2 = n2.next;	
			}
			
			resultLL.insertNode(result%10);
			
			carry = result/10;
		}
		
		return resultLL;
	}

}
