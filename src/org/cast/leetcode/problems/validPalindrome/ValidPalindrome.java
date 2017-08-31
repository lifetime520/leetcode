package org.cast.leetcode.problems.validPalindrome;

public class ValidPalindrome {
	public static String PATTERN_1 = "A man, a plan, a canal: Panama";
	public static String PATTERN_2 = "race a car";

	public static void main(String[] args) {
		System.out.println(new Solution().isPalindrome(PATTERN_1)); // true

		System.out.println(new Solution().isPalindrome(PATTERN_2)); // false
	}
}