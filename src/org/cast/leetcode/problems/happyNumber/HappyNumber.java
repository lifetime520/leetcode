package org.cast.leetcode.problems.happyNumber;

public class HappyNumber {
	public static int PATTERN_1 = 1;
	public static int PATTERN_2 = 19;
	public static int PATTERN_3 = 2;
	public static int PATTERN_4 = 0;

	public static void main(String[] args) {
		System.out.println(new Solution().isHappy(PATTERN_1)); // true

		System.out.println(new Solution().isHappy(PATTERN_2)); // true

		System.out.println(new Solution().isHappy(PATTERN_3)); // false

		System.out.println(new Solution().isHappy(PATTERN_4)); // false
	}
}