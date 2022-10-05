package com.learning.tree;

import java.util.ArrayList;
import java.util.Arrays;

public class TreeNode {
	
	String data;
	ArrayList<TreeNode> children;
	
	public TreeNode(String data) {
		this.data = data;
		this.children = new ArrayList<>();
	}
	
	public void addChild(TreeNode treeNode) {
		this.children.add(treeNode);
	}
	
	public void print() {
		if(!children.isEmpty()) {
		System.out.println("Parent:"+data);
		for(TreeNode n:children) {
			System.out.println(" Child:"+n.data);
			
		}
		
		for(TreeNode n:children) {
			n.print();
		}		
		}
	}
	
}
