package org.cast.leetcode.problems.rotateArray;

import java.util.Arrays;

public class RotateArray {
	public static int[][] PATTERN_1 = {{1, 2, 3, 4, 5, 6, 7}, {3}};
	public static int[][] PATTERN_2 = {{1}, {3}};
	public static int[][] PATTERN_3 = {{1, 2, 3, 4, 5, 6, 7}, {7}};

	public static void main(String[] args) {
		new Solution().rotate(PATTERN_1[0], PATTERN_1[1][0]);
		System.out.println(Arrays.toString(PATTERN_1[0])); // [5, 6, 7, 1, 2, 3, 4]

		new Solution().rotate(PATTERN_2[0], PATTERN_2[1][0]);
		System.out.println(Arrays.toString(PATTERN_2[0])); // [1]

		new Solution().rotate(PATTERN_3[0], PATTERN_3[1][0]);
		System.out.println(Arrays.toString(PATTERN_3[0])); // [1, 2, 3, 4, 5, 6, 7]
	}
}