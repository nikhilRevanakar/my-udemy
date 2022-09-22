package com.learning.linkedlist.qa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList ll = new LinkedList();
		
		
		ll.createLL(3);
		
		ll.insertNode(5);
		ll.insertNode(8);
		ll.insertNode(3);
		ll.insertNode(5);
		ll.insertNode(10);
		ll.insertNode(2);
		ll.insertNode(1);
		
		ll.travers();
		
//		// Remove  Dups
//		
//		RemoveDups rd = new RemoveDups();
//		Node r=rd.removeDuplicate(ll);
//
//		ll.travers();	

//		// Partition
//		
//		Partition pp = new Partition();
//		pp.partition(ll, 5);
		
		// Partiton simple way
//		PartitionSimpleWay psw = new PartitionSimpleWay();
//		psw.partiton(ll, 5);
//		
//		// SumList
//		SumList sl = new SumList();
//		sl.travers();
//		sl.sum();
		
		// SumList Simple Way
//		SumListSimpleWay ssw = new SumListSimpleWay();
//		
//		LinkedList llA = new LinkedList();
//		llA.insertNode(7);
//		llA.insertNode(1);
//		llA.insertNode(6);
//		
//		LinkedList llB = new LinkedList();
//		llB.insertNode(5);
//		llB.insertNode(9);
//		llB.insertNode(2);
//		LinkedList sum = ssw.sum(llA, llB);
//		sum.travers();
		

		LinkedList llA = new LinkedList();
		llA.insertNode(3);
		llA.insertNode(1);
		llA.insertNode(5);
		llA.insertNode(8);
		
		LinkedList llB = new LinkedList();
		llB.insertNode(2);
		llB.insertNode(4);
		llB.insertNode(6);
		
		System.out.println("LA SIZE "+llA.size);
		System.out.println("LB SIZE "+llB.size);
		
		Intersection is = new Intersection();
		is.addSameNode(llA, llB, 7);
		is.addSameNode(llA, llB, 2);
		is.addSameNode(llA, llB, 1);
		
		System.out.println("LA SIZE "+llA.size);
		System.out.println("LB SIZE "+llB.size);
		
		is.traverseLC();
		
		llA.travers();
		llB.travers();
		
		Node intersection = is.checkIntersection(llA, llB);
		System.out.println(intersection.value);
	}

}
