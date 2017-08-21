package org.cast.leetcode.problems.nthDigit;

public class NthDigit {
	public static int PATTERN_1 = 1;
	public static int PATTERN_2 = 10;
	public static int PATTERN_3 = 11;

	public static void main(String[] args) {
		System.out.println(new Solution().findNthDigit(PATTERN_1)); // 1

		System.out.println(new Solution().findNthDigit(PATTERN_2)); // 1

		System.out.println(new Solution().findNthDigit(PATTERN_3)); // 0
	}
}
