package org.cast.leetcode.problems.longestCommonPrefix;

public class LongestCommonPrefix {
	public static String[] PATTERN_1 = {"leets", "leetcode", "leet", "leeds"};

	public static void main(String[] args) {
		System.out.println(new Solution().longestCommonPrefix(PATTERN_1)); // lee
	}
}