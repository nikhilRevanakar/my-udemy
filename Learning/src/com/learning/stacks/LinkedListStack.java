package com.learning.stacks;

public class LinkedListStack {
	
//	11(22) 22(33) 33(44) 44(null)
	
	public Node head;
	
	public Node tail;
	
	public int size;
	
	public Node create(int value) {
		System.out.println("-------Create LinkedList-----------");
		if(head == null) {
			
			Node nw = new Node();
			nw.value = value;
			nw.next = null;
			head = nw;
			tail = nw;
			size = 1;
		}
		return head;
	}
	
	public Node push(int value) {
		System.out.println("-------Push into LinkedList-----------");
		if(head == null) {
			return create(value);
		}
		
		Node nw = new Node();
		nw.value = value;
		nw.next = head;
		head = nw;
		size+=1;
		return head;
	}
	
	public Node pop() {
		
		if(head == null) {
			System.out.println("-------[Pop] Stack Empty-----------");
			return null;
		}
		System.out.println("-------Pop into LinkedList-----------");
		Node popNode = head ;
		
		head = head.next;
		size--;
		return popNode;
	}
	
	public int peek() {
		System.out.println("-------Peek LinkedList-----------");
		
		if(head==null) {
			return -1;
		}
		
		return head.value;
	}
	
	public void travers() {
		System.out.println("-------Traverse LinkedList-----------");
		Node tmp = head;
		for(int i=0;i<size;i++) {
			System.out.println(tmp.value+" "+tmp.next);
			tmp = tmp.next;
		}
	}

}
