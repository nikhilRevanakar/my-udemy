package com.learning.queue.QA;

import java.util.LinkedList;

public class StackViaQueue {
	
	 LinkedList<Integer> first;
	    LinkedList<Integer> firstPop;
	    

	    public StackViaQueue() {
	        first = new LinkedList<>();
	        firstPop = new LinkedList<>();
	    }
	    
	    public void push(int x) {
	        first.addLast(x);
	        firstPop.clear();
	    }
	    
	    public int pop() {
	        if(firstPop.isEmpty()) {
	        	firstPop.addFirst(first.removeLast());
	        }
	        if(!firstPop.isEmpty()) {
	        return firstPop.remove();    
	        }
	        return -1;
	    }
	    
	    public int top() {
	    	if(firstPop.isEmpty()) {
	        	firstPop.addFirst(first.removeLast());
	        }
	        
	        if(!firstPop.isEmpty()) {
	        return firstPop.peek();    
	        }
	        return -1;
	    }
	    
	    public boolean empty() {
	        if(first.size()+firstPop.size()==0) {
	        	return true;
	        }
	        return false;
	    }
}
