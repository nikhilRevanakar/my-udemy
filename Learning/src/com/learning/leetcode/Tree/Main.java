package com.learning.leetcode.Tree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TreeNode n5 = new TreeNode(1,null, null);
//		TreeNode n4 = new TreeNode(2,null, null);
//		TreeNode n3 = new TreeNode(4,n5, n4);
//		TreeNode n2 = new TreeNode(5,null, null);
//		TreeNode n1 = new TreeNode(3,n3, n2);
//		
//		
//
//		TreeNode n13 = new TreeNode(1,null, null);
//		TreeNode n12 = new TreeNode(2,null, null);
//		TreeNode n11 = new TreeNode(4,n13, n12);
		

		TreeNode n12 = new TreeNode(1,null, null);
		TreeNode n11 = new TreeNode(1,n12, null);
		
		TreeNode n22 = new TreeNode(1,null, null);

		
		SubtreeOfAnotherTree st = new SubtreeOfAnotherTree();
		System.out.println(st.isSubtree(n11, n22));
		
		

	}

}
