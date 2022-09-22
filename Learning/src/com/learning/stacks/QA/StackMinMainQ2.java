package com.learning.stacks.QA;

public class StackMinMainQ2 {
	
	// How would  you design a stack which, in addition to push and pop, has a function
	// min which returns the minimum element? 
	// Push, pop and min should all operate in O(1)
	public static void main(String[] args) {
		// Explanation
		
//		push(5)		min()->5		|7|
//		push(6)		min()->5		|3|
//		push(3)		min()->3		|6|
//		push(7)		min()->7		|5|
//		
//		pop()		min()->3		| |
//									|3|
//									|6|
//									|5|
//									
//		pop()		min()->5		| |
//									| |
//									|6|
//									|5|
									
		StackMinQ2 min = new StackMinQ2();
		
		min.push(3);
		min.push(2);
		min.push(5);
		min.push(1);
		
		System.out.println(min.pop());
		System.out.println(min.pop());
		System.out.println(min.pop());
		System.out.println(min.pop());


	}

}
