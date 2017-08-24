package org.cast.leetcode.problems.assignCookies;

public class AssignCookies {
	public static int[][] PATTERN_1 = {{1, 2, 3}, {1, 1}};
	public static int[][] PATTERN_2 = {{1, 2}, {1, 2, 3}};

	public static void main(String[] args) {
		System.out.println(new Solution().findContentChildren(PATTERN_1[0], PATTERN_1[1])); // 1

		System.out.println(new Solution().findContentChildren(PATTERN_2[0], PATTERN_2[1])); // 2
	}
}