package org.cast.leetcode.problems.sameTree;

public class SameTree {

	public static void main(String[] args) {
		System.out.println(new Solution().isSameTree(new TreeNode(0), new TreeNode(1))); // 0
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}