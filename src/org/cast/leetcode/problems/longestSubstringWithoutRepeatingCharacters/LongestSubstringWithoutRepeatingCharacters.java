package org.cast.leetcode.problems.longestSubstringWithoutRepeatingCharacters;

public class LongestSubstringWithoutRepeatingCharacters {
	public static String[] PATTERN_1 = new String[] {"abcabcbb", "abc"};
	public static String[] PATTERN_2 = new String[] {"bbbbb", "b"};
	public static String[] PATTERN_3 = new String[] {"pwwkew", "wke"};

	public static void main(String[] args) {
		System.out.println(new Solution().lengthOfLongestSubstring(PATTERN_1[0])); // abc

		System.out.println(new Solution().lengthOfLongestSubstring(PATTERN_2[0])); // b

		System.out.println(new Solution().lengthOfLongestSubstring(PATTERN_3[0])); // wke
	}
}