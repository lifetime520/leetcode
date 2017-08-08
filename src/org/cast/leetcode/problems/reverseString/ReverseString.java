package org.cast.leetcode.problems.reverseString;

public class ReverseString {
	public static String PATTERN_1 = "aabcc";
	public static String PATTERN_2 = "aabbcc";

	public static void main(String[] args) {
		System.out.println(new Solution().reverseString(PATTERN_1)); // true

		System.out.println(new Solution().reverseString(PATTERN_2)); // false
	}
}