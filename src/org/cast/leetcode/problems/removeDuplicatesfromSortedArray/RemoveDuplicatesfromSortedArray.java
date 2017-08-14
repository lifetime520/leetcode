package org.cast.leetcode.problems.removeDuplicatesfromSortedArray;

public class RemoveDuplicatesfromSortedArray {
	public static int[] PATTERN_1 = {1, 1, 2};
	public static int[] PATTERN_2 = {};

	public static void main(String[] args) {
		System.out.println(new Solution().removeDuplicates(PATTERN_1)); // 2

		System.out.println(new Solution().removeDuplicates(PATTERN_2)); // 0
	}
}