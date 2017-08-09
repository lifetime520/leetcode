package org.cast.leetcode.problems.interleavingString;

public class InterleavingString {
	public static String PATTERN_1 = "hello";
	public static String PATTERN_2 = "xMan";

	public static void main(String[] args) {
		System.out.println(new Solution().reverseString(PATTERN_1)); // olleh

		System.out.println(new Solution().reverseString(PATTERN_2)); // naMx
	}
}