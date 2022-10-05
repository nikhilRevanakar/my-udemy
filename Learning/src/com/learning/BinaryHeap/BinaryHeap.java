package com.learning.BinaryHeap;

public class BinaryHeap {
	
	int[] arr;
	int sizeOfTree;
	
	public BinaryHeap(int size) {
		arr = new int[size+1];
		sizeOfTree = 0;
	}
	
// Minimum Binary Heap
//	 Level0                             5
//	 Level1                    10					20
//	 Level2              30			40			50			60

	
	
	public boolean isEmpty() {
		if(sizeOfTree==0) {
			return true;
		}
		return false;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Binary Heap empty");
			return -1;
		}
		return arr[1];
	}
	
	// Size of Binary Heap
	public int sizeOfBinaryHeap() {
		return sizeOfTree;
	}
	
	// Level Order traversal
	public void levelOrder() {
		for(int i=1;i<=sizeOfTree;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println("\n");
	}
	
	// Insert a node
//	 Level0                             5
//	 Level1                    10					20
//	 Level2              30			40			50			60
// Index:	0	1	2	3	4	5	6	7	8	9
// Value:	X	5	10	20	30	40	50	60	
// Formula :  LEFT CHILD - (2*X)   RIGHT CHILD - (2*X+1)
	// Insert : 1	
	public void insert(int value, String typeOfHeap) {
		arr[sizeOfTree+1] = value;
		sizeOfTree++;
		heapify(sizeOfTree, "Min");
	}
	
	// Heapify for insert
	public void heapify(int index, String heapType) {
		int parent = index/2;
		if(index<=1) {
			return ;
		}
		if(heapType == "Min") {
			if(arr[index] < arr[parent]) {
				int tmp = arr[index];
				arr[index] = arr[parent];
				arr[parent] = tmp;
			}
		} else if (heapType == "Max") {
			if(arr[index] > arr[parent]) {
				int tmp = arr[index];
				arr[index] = arr[parent];
				arr[parent] = tmp;
			}
		}
		heapify(parent, heapType);
	}
	
	
}
