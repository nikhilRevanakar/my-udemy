package ValidateBinarySearchTree;

public class ValidBST {
	
	// https://leetcode.com/problems/validate-binary-search-tree/description/
	// Youtube: https://www.youtube.com/watch?v=s6ATEkipzow
	public static void main(String[] args) {
		TreeNode1 t1 = new TreeNode1(3, null, null);
		TreeNode1 t2 = new TreeNode1(7, null, null);
		TreeNode1 t3 = new TreeNode1(6, t1, t2);
		TreeNode1 t4 = new TreeNode1(4, null, null);
		TreeNode1 t5 = new TreeNode1(5, t4, t3);
		
		
			
		System.out.println(isValidBST(t5));
		
		
	}
	
	public static  boolean isValidBST(TreeNode1 root) {
        

         return valid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
	
	public static  boolean valid(TreeNode1 root, int left, int right) {
		
		if(root==null) {
			return true;
		}
		
		if(!(root.val<=right && root.val>=left)) {
			return false;
		}
		
		
		return valid(root.left, left, root.val) && valid(root.right, root.val, right);
	}

	
	
}

