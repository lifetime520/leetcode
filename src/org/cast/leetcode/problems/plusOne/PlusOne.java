package org.cast.leetcode.problems.plusOne;

public class PlusOne {
	public static int[] PATTERN_1 = new int[] {1, 3, 5, 3, 9};
	public static int[] PATTERN_2 = new int[] {9, 9, 9, 9, 9};
	public static int[] PATTERN_3 = new int[] {1, 2, 3};

	public static void main(String[] args) {
		System.out.println(new Solution().plusOne(PATTERN_1)); // [1, 3, 5, 4, 0]

		System.out.println(new Solution().plusOne(PATTERN_2)); // [1, 0, 0, 0, 0, 0]

		System.out.println(new Solution().plusOne(PATTERN_3)); // [1, 2, 4]
	}
}