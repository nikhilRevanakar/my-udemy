package com.learning.stacks.QA;

public class StackMinQ2 {
	NodeQ2 top;
	NodeQ2 min;
	
	public StackMinQ2() {
		this.top = null;
		this.min = null;
	}
	
	public int min() {
		return min.value;
	}
	
	public void push(int value) {
		if(min == null) {
			min= new NodeQ2(value,min);
		} else if(min.value< value) {
			min = new NodeQ2(min.value, min);
		} else {
			min = new NodeQ2(value, min);
		}
		
		top = new NodeQ2(value, top);
	}
	
	
	public int pop() {
		min = min.next;
		int res = top.value;
		top = top.next;
		return res;
	}
	
}
