package org.cast.leetcode.problems.happyNumber;

public class HappyNumber {
	public static int PATTERN_1 = 0;
	public static int PATTERN_2 = 19;
	public static int PATTERN_3 = 0;
	public static int PATTERN_4 = 0;
	public static int PATTERN_5 = 0;
	public static int PATTERN_6 = 0;

	public static void main(String[] args) {
		System.out.println(new Solution().isHappy(PATTERN_1)); // false

		System.out.println(new Solution().isHappy(PATTERN_2)); // true
	}
}