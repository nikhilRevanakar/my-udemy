package com.learning.stacks;

public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListStack ll = new LinkedListStack();
		
		ll.create(11);
		ll.push(22);
		ll.push(33);
		ll.push(44);
		ll.push(55);
		
		ll.travers();

		ll.pop();
		ll.pop();
		ll.pop();
		ll.pop();
		ll.pop();
		ll.pop();
		
		ll.travers();

	}

}
