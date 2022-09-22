package com.learning.stacks.QA;

public class ThreeInOneMainQ1 {
	
	// Question:
	// How to implement 3 stacks in an array ?
	public static void main(String[] args) {
		// Array with size 9
		// Index: 0 1 2 3 4 5 6 7 8 9
		// Stack 1: [0 - n/3] = [0-3]
		// Stack 2: [n/3 - 2n/3] = [3-6]
		// Stack 3: [2n/3 - n] = [6-9]
		
		ThreeInOneQ1 one= new ThreeInOneQ1(3);

		// Is empty
		System.out.println(one.isEmpty(0));
		System.out.println(one.isEmpty(1));
		System.out.println(one.isEmpty(2));
		
		// Is full
		System.out.println(one.isFull(0));
		System.out.println(one.isFull(1));
		System.out.println(one.isFull(2));
		
		one.push(0, 1);
		one.push(0, 2);
		one.push(0, 3);
		
		one.push(1, 1);
		one.push(1, 2);
		one.push(1, 3);
		
		one.push(2, 1);
		one.push(2, 2);
		one.push(2, 3);
		
		
		

	}

}
