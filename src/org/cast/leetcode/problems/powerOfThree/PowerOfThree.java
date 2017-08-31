package org.cast.leetcode.problems.powerOfThree;

public class PowerOfThree {
	public static int PATTERN_1 = 1162261467;
	public static int PATTERN_2 = 0;
	public static int PATTERN_3 = 28;

	public static void main(String[] args) {
		System.out.println(new Solution().isPowerOfThree(PATTERN_1)); // true

		System.out.println(new Solution().isPowerOfThree(PATTERN_2)); // true

		System.out.println(new Solution().isPowerOfThree(PATTERN_3)); // false
	}
}