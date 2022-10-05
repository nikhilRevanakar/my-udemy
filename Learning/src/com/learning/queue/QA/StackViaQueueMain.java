package com.learning.queue.QA;

public class StackViaQueueMain {

//	Implement a last-in-first-out (LIFO) stack using only two queues. 
//	The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).
//
//	Implement the MyStack class:
//
//	void push(int x) Pushes element x to the top of the stack.
//	int pop() Removes the element on the top of the stack and returns it.
//	int top() Returns the element on the top of the stack.
//	boolean empty() Returns true if the stack is empty, false otherwise.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackViaQueue stackViaQueue = new StackViaQueue();
		
		stackViaQueue.push(1);
		stackViaQueue.push(2);
		stackViaQueue.push(3);
		stackViaQueue.push(4);
		
		System.out.println(stackViaQueue.pop());
		stackViaQueue.push(5);
		System.out.println(stackViaQueue.pop());
	}

}
