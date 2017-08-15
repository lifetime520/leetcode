package org.cast.leetcode.problems.longestCommonPrefix;

public class LongestCommonPrefix {
	public static String[] PATTERN_1 = {"leets", "leetcode", "leet", "leeds"};
	public static String[] PATTERN_2 = {"flower", "flow", "flight"};
	public static String[] PATTERN_3 = {"aa", "ab"};
	public static String[] PATTERN_4 = {"", ""};

	public static void main(String[] args) {
		System.out.println(new Solution().longestCommonPrefix(PATTERN_1)); // lee

		System.out.println(new Solution().longestCommonPrefix(PATTERN_2)); // fl

		System.out.println(new Solution().longestCommonPrefix(PATTERN_3)); // a

		System.out.println(new Solution().longestCommonPrefix(PATTERN_4)); // 
	}
}