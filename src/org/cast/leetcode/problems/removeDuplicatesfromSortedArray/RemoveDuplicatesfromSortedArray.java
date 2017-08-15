package org.cast.leetcode.problems.removeDuplicatesfromSortedArray;

public class RemoveDuplicatesfromSortedArray {
	public static int[] PATTERN_1 = {1, 1, 2};
	public static int[] PATTERN_2 = {};
	public static int[] PATTERN_3 = {1, 2};
	public static int[] PATTERN_4 = {1, 1};
	public static int[] PATTERN_5 = {1, 1, 1};
	public static int[] PATTERN_6 = {1, 2, 2};
	public static int[] PATTERN_7 = {-3, -1};

	public static void main(String[] args) {
		System.out.println(new Solution().removeDuplicates(PATTERN_1)); // 2

		System.out.println(new Solution().removeDuplicates(PATTERN_2)); // 0

		System.out.println(new Solution().removeDuplicates(PATTERN_3)); // 2

		System.out.println(new Solution().removeDuplicates(PATTERN_4)); // 1

		System.out.println(new Solution().removeDuplicates(PATTERN_5)); // 1

		System.out.println(new Solution().removeDuplicates(PATTERN_6)); // 2

		System.out.println(new Solution().removeDuplicates(PATTERN_7)); // 2
	}
}