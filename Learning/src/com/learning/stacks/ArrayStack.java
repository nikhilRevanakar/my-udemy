package com.learning.stacks;

public class ArrayStack {

	int[] stack = null;
	int topOfStack = -1;
			
	public ArrayStack(int size) {
		stack = new int[size];
	}
	
	public int[] push(int value) {
		if(!isFull()) {
			topOfStack++;
			stack[topOfStack] = value;
			System.out.println("Push value : "+value+" topOfStack value: "+topOfStack );
		} else {
			System.out.println("-------------Stack is full----------------");
		}
		return stack;
	}
	
	public void pop() {
		if(!isEmpty()) {
			int value = stack[topOfStack];
			stack[topOfStack] = 0;
			topOfStack = topOfStack-1;
			System.out.println("pop value: "+value);
		} else {
			System.out.println("------[POP] Stack is empty----------------");
		}
	}
	
	public int peek() {
		if(!isEmpty()) {
			int index = topOfStack;
			System.out.println("----PEEK VALUE: "+stack[index]);
			return stack[index];
		} else {
			System.out.println("------[PEEK] Stack is empty----------------");
		}
		return 0;
	}
	
	public boolean isFull() {
		
		if(topOfStack == stack.length-1) {
			return true;
		} 
		
		return false;
	}
	
	public boolean isEmpty() {
		if(topOfStack==-1) {
			return true;
		}
		return false;
	}
	
	public void travers() {
		System.out.println("----------Travers-------------");

		for(int i=topOfStack-1;i>=0;i--) {
			System.out.println(stack[i]);
		}
	}

}
