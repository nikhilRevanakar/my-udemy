package com.learning.linkedlist.qa;

public class PartitionSimpleWay {
	
	// IP 3->5->8->5->10->2->1 [x=5]
	// OP 3->1->2->10->5->5->8
	public void partiton(LinkedList ll, int value) {
		System.out.println("-------Partition simple way---------");
		
		Node currentNode = ll.head;
		ll.tail = currentNode;
		
		while(currentNode != null) {
			Node next = currentNode.next;
			if(currentNode.value < value) {
				currentNode.next = ll.head;
				ll.head = currentNode;
			} else {
				ll.tail.next = currentNode;
				ll.tail = currentNode;
			}
			currentNode = next;
		}
		ll.tail.next = null;
		
		ll.travers();
	}

}
