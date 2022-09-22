package com.learning.linkedlist.singlylinkedlist;

public class SinglyLinkedList {
	
	public Node head;
	
	public Node tail;
	
	public int size;
	
	// Create SLL
	public Node createSingly(int nodeValue) {
		
		Node newNode = new Node();
		newNode.setValue(nodeValue);
		newNode.setNext(null);
		
		head = newNode;
		tail = newNode;
		
		size = 1;
		
		return head;
	}
	
	// Insert 
	public void insertSll(int nodeValue, int location) {
		Node node = new Node();
		node.setValue(nodeValue);
		
		if(head==null) {
			createSingly(nodeValue);
			return;
		} else if(location == 0) {
			node.setNext(head);
			head = node;
		}else if(location>=size) {
			node.setNext(null);
			tail.setNext(node);
			tail = node;
		} else {
			
			Node tempNode = head;
			int index = 0;
			while(index < location -1) {
				tempNode = tempNode.getNext();
				index++;
			}
			
			node.setNext(tempNode.getNext());
			tempNode.setNext(node);
		}
		size++;
		
	}
	
	// Traversal
	public void traversSll() {
		System.out.println("-------Travers SLL-----------");
		if(head == null) {
			System.out.println("--Doesnt Exisit--");
		} else {
			Node tmp = head;
			for(int i =0;i<size;i++) {
				System.out.print(tmp.getValue());
				if(i != size-1) {
					System.out.print(" -> ");
				}
				tmp = tmp.getNext();
			}
		}
		
	}
	
	// Serach
	public Node search(int nodeValue) {
		System.out.println("\n-------Search SLL-----------");
		
		if(head==null) {
			
			return null;
		}
		
		Node tempNode = head;
		for(int i=0;i<size;i++) {
			if(tempNode.getValue()==nodeValue) {
				return tempNode;
			}
			tempNode = tempNode.getNext();
			
		}
		
		return new Node();
	}
	
	// Delete
	public void delete(int nodeValue) {
		System.out.println("\n-------Delete SLL-----------");
		
		if(head==null) {
			
			System.out.println("-----Empty SLL------");;
		}
		if(size==1) {
			head = null;
			tail = null;
		}
		
		Node temp = head;
		Node prev = head;
	
		for(int i=0;i<size-1;i++) {
			if(temp.getValue()==nodeValue) {
				if(i==0) {
					head = temp.getNext();
					temp.setNext(null);
				}
				prev.setNext(temp.getNext());
				temp.setNext(null);
				size--;
				return;
			}
			prev=temp;
			
			temp = temp.getNext();
		}
	}
	
	// Delete entire ll
	public void deleteEntireLinkedList() {
		head = null;
		tail = null;
		System.out.println("---Successfully Deleted Entire LL-------");
		
	}

}
