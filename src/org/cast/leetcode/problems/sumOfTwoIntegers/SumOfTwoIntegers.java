package org.cast.leetcode.problems.sumOfTwoIntegers;

public class SumOfTwoIntegers {
	public static int[] PATTERN_1 = {0, 1};
	public static int[] PATTERN_2 = {-1, 1};
	public static int[] PATTERN_3 = {Integer.MAX_VALUE, Integer.MIN_VALUE};

	public static void main(String[] args) {
		System.out.println(new Solution().getSum(PATTERN_1[0], PATTERN_1[1])); // 1

		System.out.println(new Solution().getSum(PATTERN_2[0], PATTERN_2[1])); // 0

		System.out.println(new Solution().getSum(PATTERN_3[0], PATTERN_3[1])); // -1
	}
}
