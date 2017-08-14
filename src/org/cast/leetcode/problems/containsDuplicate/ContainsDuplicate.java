package org.cast.leetcode.problems.containsDuplicate;

public class ContainsDuplicate {
	public static int[] PATTERN_1 = {1};
	public static int[] PATTERN_2 = {};
	public static int[] PATTERN_3 = {1, 1, 0};

	public static void main(String[] args) {
		System.out.println(new Solution().containsDuplicate(PATTERN_1)); // fasle

		System.out.println(new Solution().containsDuplicate(PATTERN_2)); // fasle

		System.out.println(new Solution().containsDuplicate(PATTERN_3)); // true
	}
}