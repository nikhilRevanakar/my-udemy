package com.learning.GeekForGeek.LargestSubtreeSumInTree;

class LargestSubtreeSumInTree {
	static int res = Integer.MIN_VALUE;

	public static int findLargestSubtreeSum(Node root) {
		// code here

		sum(root);
		int opt = res;
		res = Integer.MIN_VALUE;
		return opt;
	}

	public static int sum(Node root) {
		if (root == null) {
			return 0;
		}

		int left = sum(root.left);
		int right = sum(root.right);
		int ans = left + right + root.data;

		res = Math.max(res, ans);

		return ans;
	}
}
