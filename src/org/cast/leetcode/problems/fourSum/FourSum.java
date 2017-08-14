package org.cast.leetcode.problems.fourSum;

public class FourSum {
	public static int[][] PATTERN_1 = {{1, 0, -1, 0, -2, 2}, {0}};

	public static void main(String[] args) {
		System.out.println(new Solution().fourSum(PATTERN_1[0], PATTERN_1[1][0])); // [[-1,0,0,1],[-2,-1,1,2],[-2,0,0,2]]
	}
}