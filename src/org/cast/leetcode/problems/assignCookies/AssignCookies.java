package org.cast.leetcode.problems.assignCookies;

public class AssignCookies {
	public static int[][] PATTERN_1 = {{1, 2, 3}, {1, 1}};
	public static int[][] PATTERN_2 = {{1, 2}, {1, 2, 3}};
	public static int[][] PATTERN_3 = {{1, 2, 1, 2, 2}, {1, 1, 1, 3, 3}};
	public static int[][] PATTERN_4 = {{1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 3, 2, 1}};

	public static void main(String[] args) {
		System.out.println(new Solution().findContentChildren(PATTERN_1[0], PATTERN_1[1])); // 1

		System.out.println(new Solution().findContentChildren(PATTERN_2[0], PATTERN_2[1])); // 2

		System.out.println(new Solution().findContentChildren(PATTERN_3[0], PATTERN_3[1])); // 4

		System.out.println(new Solution().findContentChildren(PATTERN_4[0], PATTERN_4[1])); // 4
	}
}