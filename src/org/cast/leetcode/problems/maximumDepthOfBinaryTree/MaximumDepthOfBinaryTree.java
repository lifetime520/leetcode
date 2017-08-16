package org.cast.leetcode.problems.maximumDepthOfBinaryTree;

public class MaximumDepthOfBinaryTree {

	public static void main(String[] args) {
		System.out.println(new Solution().maxDepth(new TreeNode(0))); // 0
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}