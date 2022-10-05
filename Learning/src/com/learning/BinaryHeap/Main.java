package com.learning.BinaryHeap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryHeap heap = new BinaryHeap(9);
		heap.peek();
		
		heap.insert(10, "Min");
		heap.insert(5, "Min");
		heap.insert(15, "Min");
		heap.insert(1, "Min");
		

		heap.levelOrder();
	}

}
