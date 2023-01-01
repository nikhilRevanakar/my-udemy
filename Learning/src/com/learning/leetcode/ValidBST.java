package com.learning.leetcode;

public class ValidBST {
	public static  boolean isValidBST(TreeNode root) {
        

         return valid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
	
	public static  boolean valid(TreeNode root, int left, int right) {
		
		if(root==null) {
			return true;
		}
		
		if(!(root.val<=right && root.val>=left)) {
			return false;
		}
		
		
		return valid(root.left, left, root.val) && valid(root.right, root.val, right);
	}

	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(3, null, null);
		TreeNode t2 = new TreeNode(7, null, null);
		TreeNode t3 = new TreeNode(6, t1, t2);
		TreeNode t4 = new TreeNode(4, null, null);
		TreeNode t5 = new TreeNode(5, t4, t3);
		
		TreeNode p5 = new TreeNode(2147483647, null, null);
		
		
			
		System.out.println(isValidBST(p5));
		
		
	}
	
}

//  Definition for a binary tree node.
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
// 
//class Solution {
//	
//	
//    public boolean isValidBST(TreeNode root) {
//        
//
//        if(root.left!=null && root.right!=null) {
//            if(root.left.val<root.val && root.right.val>root.val){
//                isValidBST(root.left);
//                isValidBST(root.right);
//            } else {
//                return false;
//            }
//        } else if(root.left!=null && root.right==null) {
//            if(root.left.val<root.val){
//                isValidBST(root.left);
//            } else {
//                return false;
//            }
//        }
//         else if(root.right!=null && root.left==null) {
//            if(root.right.val>root.val){
//                isValidBST(root.right);
//            } else {
//                return false;
//            }
//        }
//        
//        return true;
//    }
//}