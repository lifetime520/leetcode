package org.cast.leetcode.problems.missingNumber;

public class MissingNumber {
	public static int[] PATTERN_1 = {0, 1, 3};
	public static int[] PATTERN_2 = {3, 2, 1, 0};
	public static int[] PATTERN_3 = {3, 2, 4, 7, 5, 1, 0};

	public static void main(String[] args) {
		System.out.println(new Solution().missingNumber(PATTERN_1)); // 2

		System.out.println(new Solution().missingNumber(PATTERN_2)); // 4

		System.out.println(new Solution().missingNumber(PATTERN_3)); // 6
	}
}
