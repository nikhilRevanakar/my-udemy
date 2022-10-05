package com.learning.tree.BinrayTreeUsingArrays;

public class BinaryTree {
	
	String[] arr;

	int lastUsedIndex;

	public BinaryTree(int size) {
		this.arr = new String[size+1];
		this.lastUsedIndex = 0;
		System.out.println("Binary tree with size "+size+" has been created");
	}
	
	public boolean isFull() {
		if(arr.length-1 == lastUsedIndex) {
			return true;
		}
		return false;
	}
	
//	 Level0                             n1
//	 Level1                    n2					n3
//	 Level2              n4			n5			n6		n7
//	 Level3         n8		n9 
//	
//	Index	0	1	2	3	4	5	6	7	8	9	
//	Value	X	n1	n2	n3	n4	n5	n6	n7	n8	n9
// 	Left child = 2*X    Right child = 2*X+1
	
	
	// Insert node
	// Level order traversal
//	 Level0                             n1
//	 Level1                    n2					n3
//	 Level2              n4			n5			n6		n7
//	 Level3         n8		n9 
//	
//	Index	0	1	2	3	4	5	6	7	8	9	
//	Value	X	n1	n2	n3	n4	n5	n6	n7	n8	n9	
//	New Value N10
//	lastIndexValue will be = 9
//	New value index will be = 10
//	How to find the parent of new node. 
//	If the new node index is positive then LEFT NODE formula is 2*X
//	so 10/2 = 5th index. So the parent of N10 is N5
//	 Level0                             n1
//	 Level1                    n2					n3
//	 Level2              n4			n5			n6		n7
//	 Level3         n8		n9 	 n10
//	
//	Index	0	1	2	3	4	5	6	7	8	9	10	
//	Value	X	n1	n2	n3	n4	n5	n6	n7	n8	n9	n10 
	public void insert(String value) {
		if(!isFull()) {
			arr[lastUsedIndex+1] = value;
			lastUsedIndex++;
			System.out.println("Successfully inserted: "+value);
		} else {
			System.out.println("Tree full, can not inssert: "+value);
		}
		
	}
	
	
// PreOrder Traversal
// Root
//  |
// Left Subtree
//  |
// Right Subtree
//	 Level0                             n1
//	 Level1                    n2					n3
//	 Level2              n4			n5			n6		n7
//	 Level3         n8		n9 
//	
//	Index	0	1	2	3	4	5	6	7	8	9	
//	Value	X	n1	n2	n3	n4	n5	n6	n7	n8	n9	
// Output: N1 N2 N4 N8 N9 N5 N3 N6 N7 	
	public void preOder(int index) {
		if(index > lastUsedIndex) {
			return;
		}
		
		System.out.print(arr[index]+" ");
		preOder(index * 2);
		preOder(index * 2 + 1);
	}
	
// In-Order Traversal
// Left Subtree
//  |
// Root
//  |
// Right Subtree
//		 Level0                             n1
//		 Level1                    n2					n3
//		 Level2              n4			n5			n6		n7
//		 Level3         n8		n9 
//	
//		Index	0	1	2	3	4	5	6	7	8	9	
//		Value	X	n1	n2	n3	n4	n5	n6	n7	n8	n9	
// Output: N8 N4 N9 N2 N5 N1 N6 N3 N7 
	public void inOrder(int index) {
		if(index>lastUsedIndex) {
			return;
		}
		
		inOrder(index * 2);
		System.out.print(arr[index] + " ");
		inOrder(index * 2 + 1);
	}


// Post-Order Traversal
// Left Subtree
//  |
// Right Subtree
//  |
// Root
//			 Level0                             n1
//			 Level1                    n2					n3
//			 Level2              n4			n5			n6		n7
//			 Level3         n8		n9 
//	
//			Index	0	1	2	3	4	5	6	7	8	9	
//			Value	X	n1	n2	n3	n4	n5	n6	n7	n8	n9	
// Output:  N8 N9 N4 N5 N2 N6 N7 N3 N1 
	public void postOrder(int index) {
		if(index>lastUsedIndex) {
			return;
		}
		postOrder(index*2);
		postOrder(index*2+1);
		System.out.print(arr[index]+" ");
	}
	
// Level-Order Traversal
// Print node of each level
//	Level0                             n1
//	Level1                    n2					n3
//	Level2              n4			n5			n6		n7
//	Level3         n8		n9 
//	
//	Index	0	1	2	3	4	5	6	7	8	9	
//	Value	X	n1	n2	n3	n4	n5	n6	n7	n8	n9	
// Output:  N1 N2 N3 N4 N5 N6 N7 N8 N9 
	public void levelOrder() {
		for(int i=1;i<=lastUsedIndex;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	// Search method using level order traversal
	public int search(String value) {
		for(int i=1;i<=lastUsedIndex;i++) {
			if(arr[i] == value) {
				System.out.print("Found "+ arr[i]);
				return i;
			}
		}
		return -1;
	}
	
// Delete node 
//	Level0                             n1
//	Level1                    n2					n3
//	Level2              n4			n5			n6		n7
//	Level3         n8		n9 
//	
// Delete N3
// Steps.
// 1. Find the node
// 2. Find the deepest node- N9 in this case
// 3. Set Deepest node value to Current node
// 4. Delete Deepest Nod
//	 Level0                             n1
//	 Level1                    n2					n9
//	 Level2              n4			n5			n6		n7
//	 Level3         n8	
	public void delete(String value) {
		int location = search(value);
		if(location==-1) {
			System.out.println("Value doesnt exists");
			return;
		} else {
			arr[location] = arr[lastUsedIndex];
			lastUsedIndex--;
			System.out.println("The node deleted");
		}
	}
}
