package org.cast.leetcode.problems.interleavingString;

public class InterleavingString {
	public static String[] PATTERN_1 = {"aabcc", "dbbca", "aadbbcbcac"};
	public static String[] PATTERN_2 = {"aabcc", "dbbca", "aadbbbaccc"};

	public static void main(String[] args) {
		System.out.println(new Solution().isInterleave(PATTERN_1[0], PATTERN_1[1], PATTERN_1[2])); // true

		System.out.println(new Solution().isInterleave(PATTERN_2[0], PATTERN_2[1], PATTERN_2[2])); // false
	}
}