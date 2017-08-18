package org.cast.leetcode.problems.longestUncommonSubsequenceI;

public class LongestUncommonSubsequenceI {
	public static String[] PATTERN_1 = {"aba", "cdc"};
	public static String[] PATTERN_2 = {"", "cdc"};
	public static String[] PATTERN_3 = {"apple", "papper"};

	public static void main(String[] args) {
		System.out.println(new Solution().findLUSlength(PATTERN_1[0], PATTERN_1[1])); // 3

		System.out.println(new Solution().findLUSlength(PATTERN_2[0], PATTERN_2[1])); // 3

		System.out.println(new Solution().findLUSlength(PATTERN_1[0], PATTERN_1[1])); // 6
	}
}