package org.cast.leetcode.problems.validPerfectSquare;

public class ValidPerfectSquare {
	public static int PATTERN_1 = 121;
	public static int PATTERN_2 = 36;
	public static int PATTERN_3 = 34;

	public static void main(String[] args) {
		System.out.println(new Solution().isPerfectSquare(PATTERN_1)); // true

		System.out.println(new Solution().isPerfectSquare(PATTERN_2)); // true

		System.out.println(new Solution().isPerfectSquare(PATTERN_3)); // false
	}
}