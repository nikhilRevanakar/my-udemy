package com.learning.leetcode.Tree;

public class SubtreeOfAnotherTree {
	
	
	public boolean isSubtree(TreeNode root, TreeNode subRoot) {
		if(root==null && subRoot==null) {
			return true;
		}
		if(root!=null && subRoot!=null) {
			if(isSubtreetwo(root, subRoot)) {
				return true;
			} else  {
				if(root.left!=null) {
					return isSubtree(root.left,subRoot);
				}
				if(root.right!=null) {
					return isSubtree(root.right, subRoot);
				}
				
			}
		}
		return false;
		
	}

	public boolean isSubtreetwo(TreeNode root, TreeNode subRoot) {
		if(root==null && subRoot==null) {
			return true;
		}
		
		if(root!=null && subRoot!=null) {
			if(root.val==subRoot.val) {
					return (isSubtreetwo(root.left, subRoot.left) && isSubtreetwo(root.right, subRoot.right));
				
			} else {
				return false;
			}
		}
		
		return false;
		
	}
	
	

}

