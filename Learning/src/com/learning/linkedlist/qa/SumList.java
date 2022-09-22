package com.learning.linkedlist.qa;

import javax.xml.stream.events.Characters;

public class SumList {
	// Question: 
	//	You have two numbers represnted by a linkedlist, where each node contains a single digit.
	//	The digits are stored in reverse order, such that the 1's digit is at the head of the list.
	//	Write a function that adds the two numbers and return the sum as a linked list.
	// List 1 : 7->1->6  617
	// List 1 : 5->9->2  295 = 912
	// Sum List: 2->1->9
	
	public Node headOne;
	public Node headTwo;
	public Node tailOne;
	public Node tailTwo;
	
	public SumList( ) {

		Node six = new Node();
		six.value = 6;
		six.next = null;
		
		Node one = new Node();
		one.value = 1;
		one.next = six;
		
		Node seven = new Node();
		seven.value = 7;
		seven.next = one;
		
		headOne = seven;
		tailOne = six;

	
		Node two = new Node();
		two.value = 2;
		two.next = null;
		
		Node nine = new Node();
		nine.value = 9;
		nine.next = two;
		
		Node five = new Node();
		five.value = 5;
		five.next = nine;
		
		headTwo = five;
		tailTwo = two;
	
	}
	
	public void travers() {
		System.out.println(headOne.value);
		System.out.println(headTwo.value);
		Node tmpOne = headOne;
		Node tmpTwo = headTwo;
 		for(int i =0;i<3;i++) {

 			System.out.println("One "+tmpOne.value );
			System.out.println("Two "+tmpTwo.value );
			tmpOne = tmpOne.next;
			tmpTwo = tmpTwo.next;
		}
	}
	
	public void traversSum(Node tempHead) {
		Node tmpOne = tempHead;
		for(int i =0;i<3;i++) {

 			System.out.println("One "+tmpOne.value );
			tmpOne = tmpOne.next;
		}
	}
	
	public void sum() {
		System.out.println("------Sum---------");
		String first = "";
		String second = "";
		
		
		
		Node tmpFirst = headOne;
		while(tmpFirst.next!=null) {
			if(first!="") {
				first = tmpFirst.value+first;
			} else {
				first+= tmpFirst.value;
			}
			tmpFirst = tmpFirst.next;
		}
		first=tailOne.value+first;

		Node tmpSecond = headTwo;
		while(tmpSecond.next!=null) {
			if(second!="") {
				second = tmpSecond.value + second;
			} else {
				second+= tmpSecond.value;
			}
			tmpSecond = tmpSecond.next;
					
		}
		second=tailTwo.value+second;
		
		System.out.println(first);
		System.out.println(second);
		
		int sum = Integer.parseInt(first)+Integer.parseInt(second);
		
		System.out.println("Integer sum "+sum);
		System.out.println(String.valueOf(sum));
		
		String sumS = String.valueOf(sum);
	
		Node tempHead = null;
		Node tempTail = null;
		for(int i=0;i<sumS.length();i++) {
			if(i == 0) {
				Node tmp = new Node();
				tmp.value = Character.getNumericValue(sumS.charAt(i));
				tmp.next=null;
				tempHead = tmp;
				tempTail = tmp;
			} else {
				Node tmp = new Node();
				tmp.value = Character.getNumericValue(sumS.charAt(i));
				tmp.next = tempHead;
				tempHead= tmp;
			}
		}
		
		traversSum(tempHead);
	}
	
}
