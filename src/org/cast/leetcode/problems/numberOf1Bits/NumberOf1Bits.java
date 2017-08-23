package org.cast.leetcode.problems.numberOf1Bits;

public class NumberOf1Bits {
	public static int PATTERN_1 = 0;
	public static int PATTERN_2 = 11;
	public static int PATTERN_3 = 15;
	public static int PATTERN_4 = 7;

	public static void main(String[] args) {
		System.out.println(new Solution().hammingWeight(PATTERN_1)); // 0

		System.out.println(new Solution().hammingWeight(PATTERN_2)); // 3

		System.out.println(new Solution().hammingWeight(PATTERN_3)); // 4

		System.out.println(new Solution().hammingWeight(PATTERN_4)); // 3
	}
}