package com.learning.stacks.QA;

import java.util.Queue;

public class QueueViaStacksMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueViaStacks queueViaStacks = new QueueViaStacks();
		
		queueViaStacks.push(1);
		queueViaStacks.push(2);
		queueViaStacks.push(3);
		queueViaStacks.push(4);
		
		queueViaStacks.travers();
		
		System.out.println("Popping-"+queueViaStacks.pop());
		System.out.println("Popping-"+queueViaStacks.pop());
		
		queueViaStacks.travers();

		queueViaStacks.push(1);
		queueViaStacks.push(2);
		
		queueViaStacks.travers();
		
	}

}
