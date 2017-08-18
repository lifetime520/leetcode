package org.cast.leetcode.problems.findTheDifference;

public class FirstUniqueCharacterInAString {
	public static String[] PATTERN_1 = {"abcd", "abcde"};
	public static String[] PATTERN_2 = {"", "x"};

	public static void main(String[] args) {
		System.out.println(new Solution().findTheDifference(PATTERN_1[0], PATTERN_1[1])); // e

		System.out.println(new Solution().findTheDifference(PATTERN_2[0], PATTERN_2[1])); // x
	}
}