package com.learning.tree.topBottomView;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TopViewBinaryTree tv = new TopViewBinaryTree();
		tv.insert(4);
		tv.insert(1);
		tv.insert(6);
		tv.insert(7);
		tv.insert(8);
		tv.insert(2);
		tv.insert(3);
		
		tv.inOrder(tv.root);
		System.out.println();
		tv.levelOrder(tv.root);
		System.out.println();
//		tv.topViewLevelOrder(tv.root);
		
		tv.bottomView(tv.root);
		
	}

}
