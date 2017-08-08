package org.cast.leetcode.articles.setMismatch;

import java.util.Arrays;

public class SetMismatch {
	public static int[] PATTERN_1 = {1,2,2,4};
	public static int[] PATTERN_2 = {1,5,3,2,2,7,6,4,8,9};
	public static int[] PATTERN_3 = {1,1};
	public static int[] PATTERN_4 = {2,2};
	public static int[] PATTERN_5 = {3,3,1};

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new Solution().findErrorNums(PATTERN_1))); // [2, 3]

		System.out.println(Arrays.toString(new Solution().findErrorNums(PATTERN_2))); // [2, 10]

		System.out.println(Arrays.toString(new Solution().findErrorNums(PATTERN_3))); // [1, 2]

		System.out.println(Arrays.toString(new Solution().findErrorNums(PATTERN_4))); // [2, 1]

		System.out.println(Arrays.toString(new Solution().findErrorNums(PATTERN_5))); // [3, 2]
	}
}