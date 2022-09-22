package com.learning.stacks;

public class ArraysMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack arrayStack = new ArrayStack(4);
		
		arrayStack.push(11);
		arrayStack.push(22);
		arrayStack.push(33);
		arrayStack.push(44);
		arrayStack.push(55);
		
		arrayStack.peek();
		
		
		arrayStack.travers();
		

		arrayStack.pop();
		arrayStack.pop();
		arrayStack.pop();
		arrayStack.pop();
		arrayStack.pop();
		

		arrayStack.peek();
		
		arrayStack.travers();
		

	}

}
