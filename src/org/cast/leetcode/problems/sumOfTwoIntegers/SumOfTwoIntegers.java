package org.cast.leetcode.problems.sumOfTwoIntegers;

public class SumOfTwoIntegers {
	public static int[] PATTERN_1 = {0, 1};
	public static int[] PATTERN_2 = {-1, 1};
	public static int[] PATTERN_3 = {Integer.MAX_VALUE, Integer.MIN_VALUE};
	public static int[] PATTERN_4 = {10, 13};
	public static int[] PATTERN_5 = {-1, -2};

	public static void main(String[] args) {
		System.out.println(new Solution().getSum(PATTERN_1[0], PATTERN_1[1])); // 1

		System.out.println(new Solution().getSum(PATTERN_2[0], PATTERN_2[1])); // 0

		System.out.println(new Solution().getSum(PATTERN_3[0], PATTERN_3[1])); // -1

		System.out.println(new Solution().getSum(PATTERN_4[0], PATTERN_4[1])); // 23

		System.out.println(new Solution().getSum(PATTERN_5[0], PATTERN_5[1])); // -3
	}
}
