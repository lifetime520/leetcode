package org.cast.leetcode.problems.singleNumber;

public class SingleNumber {
	public static int[] PATTERN_1 = {1, 3, 1};
	public static int[] PATTERN_2 = {-1, 1, 1};
	public static int[] PATTERN_3 = {1, 1, 1, 4, 2, 2, 1};

	public static void main(String[] args) {
		System.out.println(new Solution().singleNumber(PATTERN_1)); // 3
		System.out.println(new Solution().singleNumber(PATTERN_2)); // -1
		System.out.println(new Solution().singleNumber(PATTERN_3)); // 4
	}
}
