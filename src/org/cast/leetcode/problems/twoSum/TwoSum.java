package org.cast.leetcode.problems.twoSum;

import java.util.Arrays;

public class TwoSum {
	public static int[][] PATTERN_1 = {{2, 7, 11, 15}, {9}};
	public static int[][] PATTERN_2 = {{3, 2, 4}, {6}};

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new Solution().twoSum(PATTERN_1[0], PATTERN_1[1][0]))); // [0, 1]

		System.out.println(Arrays.toString(new Solution().twoSum(PATTERN_2[0], PATTERN_2[1][0]))); // [1, 2]
	}
}