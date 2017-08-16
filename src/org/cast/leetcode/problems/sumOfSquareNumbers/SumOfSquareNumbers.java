package org.cast.leetcode.problems.sumOfSquareNumbers;

public class SumOfSquareNumbers {
	public static int PATTERN_1 = 5;
	public static int PATTERN_2 = 6;
	public static int PATTERN_3 = 116;
	public static int PATTERN_4 = 2147483646;
	public static int PATTERN_5 = 4;

	public static void main(String[] args) {
		System.out.println(new Solution().judgeSquareSum(PATTERN_1)); // true

		System.out.println(new Solution().judgeSquareSum(PATTERN_2)); // false

		System.out.println(new Solution().judgeSquareSum(PATTERN_3)); // true

		System.out.println(new Solution().judgeSquareSum(PATTERN_4)); // false

		System.out.println(new Solution().judgeSquareSum(PATTERN_5)); // true
	}
}