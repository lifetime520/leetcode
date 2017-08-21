package org.cast.leetcode.problems.findAllNumbersDisappearedInAnArray;

public class FindAllNumbersDisappearedInAnArray {
	public static int[] PATTERN_1 = {4, 3, 2, 7, 8, 2, 3, 1};
	public static int[] PATTERN_2 = {1, 2, 3, 6};
	public static int[] PATTERN_3 = {20};

	public static void main(String[] args) {
		System.out.println(new Solution().findDisappearedNumbers(PATTERN_1)); // [5, 6]

		System.out.println(new Solution().findDisappearedNumbers(PATTERN_2)); // [4, 5]

		System.out.println(new Solution().findDisappearedNumbers(PATTERN_3)); // [1, 2, 3, 4, ... , 19]
	}
}
