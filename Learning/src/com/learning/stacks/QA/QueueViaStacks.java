package com.learning.stacks.QA;

import java.util.Stack;

public class QueueViaStacks {
	
	Stack<Integer> stack = new Stack<>();
	Stack<Integer> stackPop = new Stack<>();
	
	

	
	public void push(int value) {
		stack.add(value);
		
	}
	
	public int pop() {
		if(stackPop.isEmpty()) {
			int size =stack.size();
			for(int i=0;i<size;i++) {
				stackPop.add(stack.pop());	
			}
		}
		return stackPop.pop();
	}
	
	public int peek() {
		if(stackPop.isEmpty()) {
			for(int i=0;i<stack.size();i++) {
				stackPop.add(stack.pop());	
			}
		}
		return stackPop.peek();
	}
	
	public void travers() {
		
		System.out.println("----------START------------");
		for(int e: stack) {
			System.out.println("stack "+e);
		}
		System.out.println("----------------------");
		for(int e: stackPop) {
			System.out.println("stackPop "+e);
		}
		System.out.println("----------END------------");

	}

}
