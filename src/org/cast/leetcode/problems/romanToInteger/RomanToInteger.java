package org.cast.leetcode.problems.romanToInteger;

public class RomanToInteger {
	public static String PATTERN_1 = "DCXXI";
	public static String PATTERN_2 = "MCMXCVI";

	public static void main(String[] args) {
		System.out.println(new Solution().romanToInt(PATTERN_1)); // 621

		System.out.println(new Solution().romanToInt(PATTERN_2)); // 1996
	}
}